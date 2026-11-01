***
> Name  : Dewi Novita Sari 
>
> NIM	: 264107020002
>
> Class : TI-1I
* * *
<h2 style="text-align: center"> JOBSHEET 7 - LOOPS 1  </h2>

***
<br>

## 2.1  Experiment 1: Student Grades Case Study in SIAKAD – FOR Loop 

<font color=E11A45><b>Question:</b></font> 
1. Identify and indicate each component of the `FOR` loop in the program code of Experiment 1! 
2. Why is the variable **highest** initialized to 0 and the variable **lowest** initialized to 100? What happens if highest is initialized to 100 and lowest is initialized to 0? 
3. Explain the function and workflow of the following code snippet! 
```
if (score > highest) { 
    highest = score; 
} 
if (score < lowest) { 
    lowest = score; 
} 
```
4. Modify the program to count how many students pass and how many students fail, based on  the  passing  threshold  (minimum  score  of  60).  Display  the  number  of  students  who pass and fail after displaying the highest and lowest scores! 
5. Commit and push the program code to GitHub

<font color=FF9C4C><b>Answer:</b></font>
1. The loop is `for (int i = 1; i <= 10; i++)`. It has three parts:
`int i=1` (initialization): it sets the starting value. The counter starts at student number 1. ' i <= 10 ' (condition)): checked before every round. The loop keeps going while this is true, so it stops after student 10. `i++`(Update (increment)): Adds 1 to `i` after every round, so the program moves to the next student. The statements inside the curly braces `{ }` are the loop body. They are repeated in every round: reading the score and comparing it with the highest and lowest values.
2. Scores are always between 0 and 100. We set `highest` to the smallest possible score (0) so that the first real score will always be bigger and replace it. in the same way, we set `lowest` to the largest possible score(100) so that the first real score will always be smaller and replace it. This makes sure the starting values never "win" against real data
 If we swap them (`highest = 100`, `lowest = 0`), no score can be bigger than 100, and no score can be smaller than 0. So the two `if` conditions are never true, the values never change, and the program always prints Highest score: 100.0 and lowest score: 0.0. That result is wrong because those numbers were never entered
3. This code updates the highest and lowest score each time a new score is entered.
- The first if checks whether the new score is bigger than the current highest. If yes, new score becomes the new highest.
- The second `if` checks whether the new score is smaller than the current `lowest`. If yes, the new score becomes the new `lowest`.
- If neither is true, nothing changes ,and the loop moves on to he next student.

Like holding a "record" for the best and worst score. Every new score is compared with the record, and the record is only replaced when the new score beats it. After all 10 students, `highest` and `lowest` hold the real maximum and minimum. Two separate `if` statements are used (not `if-else`) because one score can update both values, for example, the very first score.

4. The Code Before Modification:
```
import java.util.Scanner;
public class SiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare varible
        double score, highest =0,lowest = 100;
        System.out.print("Enter your score: ");
        score = sc.nextDouble();
        //Check score
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter your score: "+i+": ");
            score = sc.nextDouble();
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        
    }   
}
```
	
<div style="text-align: center;"><img src="../_resources/Screenshot%202026-11-01%20144459.png" alt="resultexperiment1.png" style="width: 60%"></div>
	
The Code After Modify:
```
import java.util.Scanner;
public class SiakadFor08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare varible
        double score, highest =0,lowest = 100;
        int passCount = 0, failCount = 0;
        //Check score
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter your score: "+i+": ");
            score = sc.nextDouble();
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
			if (score >= 60) {
                passCount++;
            }
			else {
                failCount++;
        }
```
```
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);
    }
}
```
<div style="text-align: center;"><img src="../_resources/Screenshot%202026-11-01%20144047.png" alt="resultexperiment1.png" style="width: 60%"></div>

* * *
## 2.2 Experiment 2: Student Grades Case Study in SIAKAD – WHILE Loop 
<font color=E11A45><b>Question:</b></font> 
1. In  the  following  code  snippet,  determine  the  meaning  and  purpose  of  the  following 
syntax: 
```
if (score < 0 || score > 100) { 
    System.out.println("Invalid score. Please enter a valid score!"); 
    continue; 
} 
```
a. score `< 0 || score > 100` 
b. continue 

2. Why  is  the  `i++`  statement  written  at  the  end  of  the  WHILE  loop?  What  happens  if  it  is written at the beginning of the WHILE loop? 
3. If the number of students entered is 19, how many times will the WHILE loop run? 
4. Modify  the  program  so  that,  if  a  student  receives  grade  A,  the  program  displays  an additional message “Well done, keep up the good work!” 
5. Commit and push the program code to GitHub 

<font color=FF9C4C><b>Answer:</b></font>
1. a. `score < 0 || score >100` This is the condition that checks if a score is invalid. The `||` sign means "OR", so the condition is true if at least one side is true: the score is below 0, or the score is above 100. A real score must be between 0 and 100, so any number outside that range is rejected. For example, -15 and 101 are invalid, but 70 is valid.
   b. `continue` tells the loop to skip all the code below it and jump straight back to the loop condition to start the next round. Here it skips the grading part and the `i++` line. Because `i` does not go up, the program asks for the same student's score again. That is why the output shows "Enter score for student 3" twice after 101 is entered.
2. `i++` is at the end so the counter only goes up after a valid score has been entered and graded. If the score is invalid, continue jumps back before reaching `i++`, so the same student is asked again. Also, i is still the right value while the messages are printed, so `(i + 1)` shows the correct student number.
If `i++` is moved to the beginning of the loop:
• The student numbers shift. The first prompt would say "student 2" instead of "student 1", because `i` is already 1 when `(i + 1)` is printed.
• Invalid input is no longer handled properly. The counter has already gone up before `continue` runs, so the wrong score still "uses up" one turn. That student is skipped and never gets a grade, and the program finishes with fewer valid grades than the number of students.
3. It runs **19 times** if all scores are valid. `i` starts at 0 and the condition is `i < 19`, so the loop runs for i = 0, 1, 2, ..., 18. That is 19 values. When `i` becomes 19, the condition is false and the loop stops.
Note: every invalid score adds one extra round, because `continue` repeats the turn without increasing `i`. For example, with 2 invalid inputs, the loop body runs 21 times, but there are still exactly 19 graded students.
4. The Code Before Modification:

```
import java.util.Scanner;
public class SiakadWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declare varible
        
        double score;
        double studentCount;
     
        System.out.print("Enter the number of students: ");
        studentCount = sc.nextInt();
        int i = 0;
        while (i < studentCount) { 
        System.out.print("Enter score for student " + (i + 1) + ": "); 
        score = sc.nextInt(); 
```
```
  
        if (score < 0 || score > 100) { 
            System.out.println("Invalid score. Please enter a valid score!"); 
            continue; 
        } 
 
        if (score > 80 && score <= 100) { 
            System.out.println("The grade of student " + (i + 1) + " is A"); 
        } else if (score > 73 && score <= 80) { 
            System.out.println("The grade of student " + (i + 1) + " is B+"); 
        } else if (score > 65 && score <= 73) { 
            System.out.println("The grade of student " + (i + 1) + " is B"); 
```
```
        } else if (score > 60 && score <= 65) { 
            System.out.println("The grade of student " + (i + 1) + " is C+"); 
        } else if (score > 50 && score <= 60) { 
            System.out.println("The grade of student " + (i + 1) + " is C"); 
        } else if (score > 39 && score <= 50) { 
            System.out.println("The grade of student " + (i + 1) + " is D"); 
        } else { 
            System.out.println("The grade of student " + (i + 1) + " is E"); 
        } 
        i++; 
 
        }
    }
    
}

```
   Result:
   <div style="text-align: center;"><img src="../_resources/Screenshot%202026-11-01%20180406.png" alt="resultexperiment2.png" style="width: 60%"></div>
   
   The Code After Modification:
   
```
import java.util.Scanner;
public class SiakadWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declare varible
        
        double score;
        double studentCount;
     
        System.out.print("Enter the number of students: ");
        studentCount = sc.nextInt();
        int i = 0;
        while (i < studentCount) { 
        System.out.print("Enter score for student " + (i + 1) + ": "); 
        score = sc.nextInt(); 
  
```
```
        if (score < 0 || score > 100) { 
            System.out.println("Invalid score. Please enter a valid score!"); 
            continue; 
        } 
 
        if (score > 80 && score <= 100) { 
            System.out.println("Well done, keep up the good work! Student " + (i + 1) + " got an A"); 
        } else if (score > 73 && score <= 80) { 
            System.out.println("The grade of student " + (i + 1) + " is B+"); 
        } else if (score > 65 && score <= 73) { 
            System.out.println("The grade of student " + (i + 1) + " is B"); 
        } else if (score > 60 && score <= 65) { 
            System.out.println("The grade of student " + (i + 1) + " is C+"); 
        } else if (score > 50 && score <= 60) { 
            System.out.println("The grade of student " + (i + 1) + " is C"); 
```
```
        } else if (score > 39 && score <= 50) { 
            System.out.println("The grade of student " + (i + 1) + " is D"); 
        } else { 
            System.out.println("The grade of student " + (i + 1) + " is E"); 
        } 
        i++; 
 
        }
    }
    
}
```

   Result:
   <div style="text-align: center;"><img src="../_resources/Screenshot%202026-11-01%20180050.png" alt="resultexperiment2.png" style="width: 60%"></div>
   
* * *
## 2.3 Experiment 3: Café Transaction Case Study – DO-WHILE Loop 
<font color=E11A45><b>Question:</b></font> 
1. In this `DO-WHILE` loop, if the first customer name entered is “cancel”, how many times is the loop executed? 
2. State the stopping condition used in this `DO-WHILE` loop! 
3. What is the function of using the value true in the `DO-WHILE` condition? 
4. Why  does  this  `DO-WHILE`  loop  still  run  even  though  it  has  no  initialization  and  update 
components?

<font color=FF9C4C><b>Answer:</b></font>
1. The loop is executed 1 time. A DO-WHILE loop always runs its body at least once, because the code inside `do { }` is run first and the condition is checked only at the end. In that first round, the program asks for the name, sees "cancel", prints "Transaction canceled.", and `break` stops the loop right away. The questions about coffee, tea, and bread are never asked.
2. The loop stops when the customer name entered is "cancel". This is checked with `customerName.equalsIgnoreCase("cancel")`. Because it uses `equalsIgnoreCase`, capital letters do not matter: "cancel", "Cancel", and "CANCEL" all work. When it is true, the break statement ends the loop. The condition `while (true)` itself never stops the loop.
3. `while (true)` makes the condition always true, so the loop can repeat forever. This is useful when we do not know beforehand how many customers will come. The cashier can keep entering transactions for as many customers as needed. The only way out is the `break` inside the loop, which runs when "cancel" is typed. Without that `break`, the program would never end (an infinite loop).
4. Initialization and update are only needed when a loop uses a counter (like `i` in a FOR loop) to decide when to stop. This loop does not count anything. Its condition is simply `true`, which does not depend on any variable, so there is nothing to start or update. Instead, the loop is controlled by the user's input: each round reads a new customer name, and the loop ends with `break` when the name is "cancel". In short, it is controlled by an event (typing "cancel"), not by a counter.
* * *
## Assignment
<font color=9564DD><b>Task:</b></font>
1.  A  cinema manager wants to create a program to calculate the total ticket sales in one day. Tickets are sold at Rp 50,000 per ticket. The program must calculate the total number of tickets sold and the total ticket sales revenue for the day, subject to the following rules: 
• If a customer buys more than 4 tickets, the customer receives a 10% discount. 
• If a customer buys more than 10 tickets, the customer receives a 15% discount. 
• If the ticket quantity entered is invalid (negative), the program ignores the input and asks for it to be re-entered. 
>Note:  Loops may use for,  while,  or do-while.  Add  break  or  continue  statements  if necessary
>
2. FlowChart <div style="text-align: center;">
	<img src="../_resources/Screenshot%202026-11-01%20115032.png" alt="Flowchartjobsheet7.png" style="width: 70%"></div>
A  parking lot operator wants to create a program to calculate the total parking fees of several vehicles. The parking rate is Rp 3,000 per hour for cars and Rp 2,000 per hour for motorcycles. The program keeps asking for input as long as the input is not 0. Implement the flowchart as a Java program!

<font color=427AB5><b>Code: </b></font> 
1. A program to calculate the total ticket sales in one day.
```
import java.util.Scanner;
public class CinemaWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerCount, tickets, i=0;
        int ticketPrice = 50000;
        int price, discount,totalPay;
        int totalTickets=0,totalRevenue=0;

        System.out.println("==================================");
        System.out.println("Welcome to Cinema Ticketing System");
        System.out.println("==================================");

        System.out.print("Enter the number of customers: ");
        customerCount = sc.nextInt();

        while (i < customerCount) {
            System.out.print("Enter the number of tickets for customer " + (i + 1) + ": ");
            tickets = sc.nextInt();

            if (tickets<0) {
                System.out.println("Invalid input. Please enter a valid number of tickets.");
                continue;
            }
```

```
            price = tickets * ticketPrice;

            if (tickets >10) {
                discount = price * 15 / 100;
                System.out.println("Customer " + (i + 1) + " gets a 15% discount.");
            } else if (tickets > 4) {
                discount = price * 10 / 100;
                System.out.println("Customer " + (i + 1) + " gets a 10% discount.");
            } else {
                discount = 0;
                System.out.println("Customer " + (i + 1) + " does not get any discount.");
            }

            totalPay = price - discount;

            System.out.println("Price:Rp. " + price); 
            System.out.println("Discount: " + discount);
            System.out.println("Total Pay:Rp. " + totalPay);
            System.out.println();

            totalTickets += tickets;
            totalRevenue += totalPay;
            i++;
        }

```
```
        System.out.println("=================================");
        System.out.println("Total tickets sold today: " + totalTickets);
        System.out.println("Total ticket revenue today: Rp " + totalRevenue);

    }
}


```
Result:

```
==================================
Welcome to Cinema Ticketing System
==================================
Enter the number of customers: 10
Enter the number of tickets for customer 1: 40
Customer 1 gets a 15% discount.
Price:Rp. 2000000
Discount: 300000
Total Pay:Rp. 1700000

Enter the number of tickets for customer 2: 1
Customer 2 does not get any discount.
Price:Rp. 50000
Discount: 0
Total Pay:Rp. 50000

Enter the number of tickets for customer 3: -1
Invalid input. Please enter a valid number of tickets.
Enter the number of tickets for customer 3: 2
Customer 3 does not get any discount.
Price:Rp. 100000
Discount: 0
Total Pay:Rp. 100000

Enter the number of tickets for customer 4: 19
Customer 4 gets a 15% discount.
Price:Rp. 950000
Discount: 142500
Total Pay:Rp. 807500

Enter the number of tickets for customer 5: 35
Customer 5 gets a 15% discount.
Price:Rp. 1750000
Discount: 262500
Total Pay:Rp. 1487500

Enter the number of tickets for customer 6: 0
Customer 6 does not get any discount.
Price:Rp. 0
Discount: 0
Total Pay:Rp. 0

Enter the number of tickets for customer 7: -5
Invalid input. Please enter a valid number of tickets.
Enter the number of tickets for customer 7: 2
Customer 7 does not get any discount.
Price:Rp. 100000
Discount: 0
Total Pay:Rp. 100000

Enter the number of tickets for customer 8: 2
Customer 8 does not get any discount.
Price:Rp. 100000
Discount: 0
Total Pay:Rp. 100000

Enter the number of tickets for customer 9: 6
Customer 9 gets a 10% discount.
Price:Rp. 300000
Discount: 30000
Total Pay:Rp. 270000

Enter the number of tickets for customer 10: 7
Customer 10 gets a 10% discount.
Price:Rp. 350000
Discount: 35000
Total Pay:Rp. 315000

=================================
Total tickets sold today: 114
Total ticket revenue today: Rp 4930000
```
2.  A program to calculate the total parking fees of several vehicles.

```
import java.util.Scanner;

public class ParkingDoWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type;
        int duration;
        int total = 0;
        int carRate = 3000;
        int motorcycleRate = 2000;

        System.out.println("==========================================");
        System.out.println("Welcome to Parking Fee Calculation System");
        System.out.println("==========================================");
```

```
        do {
            System.out.print("Enter vehicle type (1 for Car, 2 for Motorcycle, 0 for Exit): ");
            type = sc.nextInt();

            if (type == 1 || type == 2) {
                System.out.print("Enter parking duration (hours): ");
                duration = sc.nextInt();

                if (type == 1) {
                    total += duration * carRate;
                } else {
                    total += duration * motorcycleRate;
                }
            }
        } while (type != 0);

        System.out.println("==========================================");
        System.out.println("Total parking fee: Rp. " + total);
        System.out.println("=========================================="); 
    }
}
```

Result:
```
==========================================
Welcome to Parking Fee Calculation System
==========================================
Enter vehicle type (1 for Car, 2 for Motorcycle, 0 for Exit): 4 
Enter vehicle type (1 for Car, 2 for Motorcycle, 0 for Exit): 2
Enter parking duration (hours): 7
Enter vehicle type (1 for Car, 2 for Motorcycle, 0 for Exit): -4
Enter vehicle type (1 for Car, 2 for Motorcycle, 0 for Exit): 1
Enter parking duration (hours): -0
Enter vehicle type (1 for Car, 2 for Motorcycle, 0 for Exit): 2 
Enter parking duration (hours): 9
Enter vehicle type (1 for Car, 2 for Motorcycle, 0 for Exit): 0
==========================================
Total parking fee: Rp. 32000
==========================================


```