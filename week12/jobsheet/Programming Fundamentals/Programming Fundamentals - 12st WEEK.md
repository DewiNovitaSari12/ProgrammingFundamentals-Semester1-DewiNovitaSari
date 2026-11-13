***
> Name : Dewi Novita Sari
> 
> NIM	: 264107020002
> 
> Class : TI-1I
* * *
<h2 style="text-align: center"> LAB SHEET 9 - One-Dimensional Arrays  </h2>

***
<br>

## 3.1. Experiment 1: Declaring, Initializing, Filling, and Displaying Array Elements

<font color=E11A45><b>Question:</b></font> 
1. If the elements of the numbers array are changed to 5.0, 12867, 7.5, 2000000, what happens? Why does this happen? 
2. Modify the program above by initializing the array elements at the same time the array is declared (without new int[4] and without filling the elements one by one). 
3. Change the display statement in step 4 to the following: System.out.println("numbers[" + i + "] = " + numbers[i]  +  ",  doubled  =  "  +  (numbers[i]  *  2)); What is the output of the program? Explain the meaning of the statement. 
4. If the condition in the for loop above is changed to i <= 4, what is the output of the program? Why? 
5. What is the difference between displaying an array using a for loop, a foreach loop, and Arrays.toString() in step 5? When should each one be used?

<font color=FF9C4C><b>Answer:</b></font>
1. So if the elements of the numbers array are changed to 5.0, 12867, 7.5, 2000000, it will cause an error why because the initialization we use for the data type is int (integer) so that's why if we use decimal it cant be read. if you want to make the array with decimal you should use double or float
2. code before initialization:
```
package week12.experiment1;
import java.util.Arrays;
public class NumberArray08 {
    public static void main(String[] args) {
        int[] numbers = new int [4];
        numbers [0] = 5;
        numbers [1] = 13;
        numbers [2] = -7;
        numbers [3] = 17;
```

Code after modify use initialization
```
package week12.experiment1;
import java.util.Arrays;
public class NumberArray08 {
    public static void main(String[] args) {
        int numbers[]={5, 13, -7, 17};
```

3. Output of the program:
```
numbers[0] = 5, doubled = 10
numbers[1] = 13, doubled = 26
numbers[2] = -7, doubled = -14
numbers[3] = 17, doubled = 34
```
The statement prints each element together with its value multiplied by 2. The `+` sign joins text and numbers into one line. `"numbers[" + i + "] = "` shows the index, `numbers[i]` shows the value, and `(numbers[i] * 2)` calculates the doubled value. The brackets `( )` make sure Java does the multiplication first as a math operation, and only after that joins the result into the text.

4. The program prints the 4 elements first, then it stops with an error:
```
numbers[0] = 5, doubled = 10
numbers[1] = 13, doubled = 26
numbers[2] = -7, doubled = -14
numbers[3] = 17, doubled = 34
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
```
This happens because the array only has 4 elements, so the indexes are 0, 1, 2, and 3. With `i <= 4`, the loop also runs when `i = 4`, and Java tries to read `numbers[4]`, which does not exist. That is why we should use `i < numbers.length`, so the loop always stops at the last index.

5. The difference between the three ways:
- **for loop** uses an index (`i`). We can see the position of each element, choose which elements to show, and even change the values. Use it when we need the index or want to change the array.
- **foreach loop** (`for (int n : numbers)`) takes the elements one by one from start to end without an index. It is shorter and easier to read. Use it when we only want to read or display all values and don't need the index.
- **Arrays.toString()** turns the whole array into one line of text, like `[5, 13, -7, 17]`, without writing a loop. Use it when we just want to quickly see all the contents of the array, for example to check the data.

***
## 3.2. Experiment 2: SIAKAD Case Study — Entering Student Scores and Pass/Fail Status
<font color=E11A45><b>Question:</b></font> 
1. What does the condition i < finalScores.length in the loop above mean? 
2. Modify the program so that it displays only the scores of students who passed (score > 70), without displaying those who failed. Explain the flow of the program! 
3. Change  the loops in steps 4 and 5 from for loops to foreach loops. Can all parts of the program be converted to foreach? Explain which parts can and cannot be converted, along with the reasons. 
4. Modify the program so that it also calculates and displays the number of students who passed and the number of students who failed at the end of the program.

<font color=FF9C4C><b>Answer:</b></font>
1. `i < finalScores.length` is the limit of the loop. `finalScores.length` is the number of elements in the array. The loop keeps running as long as `i` is smaller than that number, so `i` goes from 0 up to the last index (length - 1). This way the loop visits every element and never goes past the end of the array. It is also flexible: if the array size changes, we don't need to change the loop.

2. Code for the display part:
```
for (int i = 0; i < finalScores.length; i++) {
    if (finalScores[i] > 70) {
        System.out.println("Student #" + (i + 1) + ": " + finalScores[i] + " (PASS)");
    }
}
```
With the sample input 85, 60, 72, 90, 45, 78, 66, 95, 50, 71, the output is:
```
Student #1: 85 (PASS)
Student #3: 72 (PASS)
Student #4: 90 (PASS)
Student #6: 78 (PASS)
Student #8: 95 (PASS)
Student #10: 71 (PASS)
```
Flow of the program:
- The loop starts from index 0 and checks every student's score one by one.
- For each score, the `if` checks whether the score is greater than 70.
- If yes, the print statement inside the `if` block runs and the score is shown.
- If no, nothing is printed and the loop just moves to the next student.
- The loop stops after the last student, so only students who passed are shown.

3. Not all parts can be changed to foreach.
- **Step 4 (input loop) cannot be changed.** When we input data, the value must be saved into a specific index, like `finalScores[i] = input.nextInt();`. The prompt also shows the student number `(i + 1)`. A foreach loop does not have an index. Its variable is only a copy of the element, so if we put the input into that variable, the array itself does not change and stays empty (all 0).
- **Step 5 (display loop) can be changed.** Here we only read the values, so foreach works:
```
int number = 1;
for (int score : finalScores) {
    String status = (score > 70) ? "PASS" : "FAIL";
    System.out.println("Student #" + number + ": " + score + " (" + status + ")");
    number++;
}
```
Because foreach has no index, we need our own counter variable (`number`) if we want to show the student number.

4. Add two counter variables, one for pass and one for fail:
```
int passCount = 0;
int failCount = 0;

for (int i = 0; i < finalScores.length; i++) {
    String status = (finalScores[i] > 70) ? "PASS" : "FAIL";
    System.out.println("Student #" + (i + 1) + ": " + finalScores[i] + " (" + status + ")");
    if (finalScores[i] > 70) {
        passCount++;
    } else {
        failCount++;
    }
}

System.out.println("Number of students who passed : " + passCount);
System.out.println("Number of students who failed : " + failCount);
```
Both counters start from 0. Every time a student passes, `passCount` goes up by 1, and every time a student fails, `failCount` goes up by 1. After the loop ends, both totals are printed. With the sample input, the last two lines are:
```
Number of students who passed : 6
Number of students who failed : 4
```

***
## 3.3. Experiment 3: Arithmetic Operations on Arrays — Total, Average, Highest and Lowest Scores 
<font color=E11A45><b>Question:</b></font> 
1. Modify the code above so that it displays the number of students who passed, that is, students whose score is greater than 70 (> 70). 
2. Modify the program above  so  that  it  accepts  the  number  of  array  elements  from user  input  (not always 10), while still calculating the total, average, highest value, and lowest value correctly. 
3. Why is (double) total / studentScores.length used in the average calculation instead of simply total / studentScores.length? Explain!

<font color=FF9C4C><b>Answer:</b></font>
1. Add a counter that starts from 0 and goes up by 1 every time a score is greater than 70:
```
int passCount = 0;
for (int i = 0; i < studentScores.length; i++) {
    if (studentScores[i] > 70) {
        passCount++;
    }
}
System.out.println("Number of students who passed : " + passCount);
```
With the sample data (85, 60, 72, 90, 45, 78, 66, 95, 50, 71), the output is `Number of students who passed : 6` (85, 72, 90, 78, 95, and 71).

2. The array size is now taken from user input:
```
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of students : ");
int n = input.nextInt();
int[] studentScores = new int[n];

int total = 0;
for (int i = 0; i < studentScores.length; i++) {
    System.out.print("Enter the score for student #" + (i + 1) + ": ");
    studentScores[i] = input.nextInt();
    total += studentScores[i];
}

double average = (double) total / studentScores.length;
System.out.println("Total score: " + total);
System.out.println("Average: " + average);

int highest = studentScores[0];
int lowest = studentScores[0];
for (int i = 1; i < studentScores.length; i++) {
    if (studentScores[i] > highest) highest = studentScores[i];
    if (studentScores[i] < lowest) lowest = studentScores[i];
}
System.out.println("Highest score: " + highest);
System.out.println("Lowest score: " + lowest);
```
Flow: first the user enters how many students there are, and that number becomes the array size (`new int[n]`). Then the scores are entered one by one, and each score is added to `total` in the same loop. `highest` and `lowest` start from the first score, and the second loop replaces them if a bigger or smaller score is found. The average is calculated after the input loop ends. Because everything uses `studentScores.length`, the program works for any number of students.

3. Because `total` and `studentScores.length` are both `int`. If we divide an int by an int, Java does **integer division**: the decimal part is thrown away. For example, with the sample data the total is 712 and there are 10 students. `712 / 10` gives `71`, not `71.2`. By writing `(double) total`, we change `total` into a decimal number first, so Java does a normal division and the result is `71.2`. This makes the average correct.

***
## 3.4. Experiment 4: Simple Searching and Sorting 
<font color=E11A45><b>Question:</b></font> 
1. Explain the meaning of the break; statement in the Part A code above! 
2. Modify the Part A code  so that the program accepts, as user  input,  the number of elements in the scores array, the array contents, and a value (key) to search for, and then prints the index position of that value (key) in the array. 
3. Modify  the  Part  A  program  so  that  it  displays  the  message  "The  value  you  are  looking  for  was  not found" in a more  informative format when the value being searched for (key) does not  exist in the array. 
4. Explain step by step how the bubble sort algorithm in Part B works, using the test data provided! 
5. Modify  the  Part  B  program  so  that  it  sorts  the  array  from  the  largest  to  the  smallest  value (descending), instead of from the smallest to the largest.

<font color=FF9C4C><b>Answer:</b></font>
1. `break;` stops the loop right away. In Part A, once the value (key) is found, the message is printed, `found` is set to `true`, and `break;` makes the program leave the loop. For example, key 90 is at index 2, so after index 2 the loop stops and indexes 3, 4, and 5 are not checked. There is no need to check the rest of the elements because the value is already found. This makes the program faster, and it also prevents the message from being printed twice if the same value appears more than once.

2. Code:
```
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of elements : ");
int n = input.nextInt();
int[] scores = new int[n];

for (int i = 0; i < scores.length; i++) {
    System.out.print("Enter element " + i + " : ");
    scores[i] = input.nextInt();
}

System.out.print("Enter the value to search (key) : ");
int key = input.nextInt();

boolean found = false;
for (int i = 0; i < scores.length; i++) {
    if (scores[i] == key) {
        System.out.println("Score " + key + " was found at index " + i);
        found = true;
        break;
    }
}
if (!found) {
    System.out.println("Score " + key + " was not found.");
}
```
Example output:
```
Enter the number of elements : 6
Enter element 0 : 78
Enter element 1 : 65
Enter element 2 : 90
Enter element 3 : 55
Enter element 4 : 88
Enter element 5 : 72
Enter the value to search (key) : 90
Score 90 was found at index 2
```
The array size and contents now come from the user. `found` starts as `false`, and becomes `true` when the key is found.

3. Add an `else` block that shows a clearer message (needs `import java.util.Arrays;`):
```
if (!found) {
    System.out.println("==============================================");
    System.out.println("  The value you are looking for was not found");
    System.out.println("==============================================");
    System.out.println("Key searched : " + key);
    System.out.println("Array data   : " + Arrays.toString(scores));
    System.out.println("Please check the value and try again.");
}
```
Example output:
```
Enter the number of elements : 6
Enter element 0 : 78
Enter element 1 : 65
Enter element 2 : 90
Enter element 3 : 55
Enter element 4 : 88
Enter element 5 : 72
Enter the value to search (key) : 100
==============================================
  The value you are looking for was not found
==============================================
Key searched : 100
Array data   : [78, 65, 90, 55, 88, 72]
Please check the value and try again.
```
The message now tells the user which value was searched and what data is in the array, so the user understands why it was not found.

4. Bubble sort compares two elements that are next to each other. If the left one is bigger than the right one, they swap places. After each round (pass), the biggest value "bubbles up" to the end of the array.

Test data: `{78, 65, 90, 55, 88, 72}` (6 elements, so there are 5 passes).

**Pass 1** (i = 0)
- 78 vs 65 → swap → `[65, 78, 90, 55, 88, 72]`
- 78 vs 90 → no swap
- 90 vs 55 → swap → `[65, 78, 55, 90, 88, 72]`
- 90 vs 88 → swap → `[65, 78, 55, 88, 90, 72]`
- 90 vs 72 → swap → `[65, 78, 55, 88, 72, 90]` → 90 is now in its final place

**Pass 2** (i = 1)
- 65 vs 78 → no swap
- 78 vs 55 → swap → `[65, 55, 78, 88, 72, 90]`
- 78 vs 88 → no swap
- 88 vs 72 → swap → `[65, 55, 78, 72, 88, 90]` → 88 is in its place

**Pass 3** (i = 2)
- 65 vs 55 → swap → `[55, 65, 78, 72, 88, 90]`
- 65 vs 78 → no swap
- 78 vs 72 → swap → `[55, 65, 72, 78, 88, 90]` → 78 is in its place

**Pass 4** (i = 3)
- 55 vs 65 → no swap
- 65 vs 72 → no swap

**Pass 5** (i = 4)
- 55 vs 65 → no swap

Final result: `[55, 65, 72, 78, 88, 90]`

For an array with n elements, bubble sort needs n - 1 passes. In each pass, the inner loop checks one less element, because the last ones are already sorted.

5. To sort from largest to smallest, we only change the comparison sign from `>` to `<`:
```
for (int i = 0; i < scores.length - 1; i++) {
    for (int j = 0; j < scores.length - 1 - i; j++) {
        if (scores[j] < scores[j + 1]) {
            int temp = scores[j];
            scores[j] = scores[j + 1];
            scores[j + 1] = temp;
        }
    }
}
```
Now two elements swap when the left one is **smaller** than the right one. So in every pass the smallest value moves to the end, and the result is sorted from largest to smallest, so the test data becomes `[90, 88, 78, 72, 65, 55]`.

***
<h2 style="text-align: center"> Assignments  </h2>

***
### 4.1. Assignment 1 — Managing Student Scores 
<font color=D9361E><b>Code:</b></font>
```
package week12.assignment;
import java.util.Scanner;

public class ManagingStudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int student = 5;
        double sum = 0;
        double highest = 0;
        double lowest = 100;

        double scores[] = new double[student];

        System.out.println("==========================================");
        System.out.println("        MANAGING STUDENT SCORE");
        System.out.println("==========================================");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score of student " + (i + 1) + " : ");
            scores[i] = input.nextDouble();
            sum = sum + scores[i];

            if (scores[i] > highest)
                highest = scores[i];
            if (scores[i] < lowest)
                lowest = scores[i];
        }
```
```

        System.out.println("\n==========================================");
        System.out.println("              SCORE RESULT");
        System.out.println("==========================================");
        System.out.printf("%-10s | %-8s | %-6s%n", "Student", "Score", "Status");
        System.out.println("------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            String status;
            if (scores[i] < 70)
                status = "Fail";
            else
                status = "Pass";
            System.out.printf("%-10s | %-8.2f | %-6s%n", "Student " + (i + 1), scores[i], status);
        }

```
```
        double avg = sum / scores.length;

        System.out.println("==========================================");
        System.out.println("               SUMMARY");
        System.out.println("==========================================");
        System.out.printf("Average : %.2f%n", avg);
        System.out.printf("Highest : %.2f%n", highest);
        System.out.printf("Lowest  : %.2f%n", lowest);
        System.out.println("==========================================");

        input.close();
    }
}
```

<font color=557945><b>Output:</b></font>
```
==========================================
        MANAGING STUDENT SCORE
==========================================
Enter score of student 1 : 90
Enter score of student 2 : 8
Enter score of student 3 : 97
Enter score of student 4 : 67
Enter score of student 5 : 43

==========================================
              SCORE RESULT
==========================================
Student    | Score    | Status
------------------------------------------
Student 1  | 90.00    | Pass  
Student 2  | 8.00     | Fail  
Student 3  | 97.00    | Pass  
Student 4  | 67.00    | Fail  
Student 5  | 43.00    | Fail  
==========================================
               SUMMARY
==========================================
Average : 61.00
Highest : 97.00
Lowest  : 8.00
==========================================

```
***
 ### 4.2. Assignment 2 — Campus Café Ordering Application

 <font color=D9361E><b>Code:</b></font>
 
```
package week12.assignment;
import java.util.Scanner;
public class CampusCafeOrderingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Fried Rice", "Fried Noodles", "Toast", "French Fries",
                         "Pulled Tea", "Cappuccino", "Chocolate Ice"};
        int[] prices = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("==============================================");
        System.out.println("        CAMPUS CAFE ORDERING APPLICATION");
        System.out.println("==============================================");
        System.out.printf("%-4s %-18s %12s%n", "No", "Menu", "Price");
        System.out.println("----------------------------------------------");
```
```
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-4d %-18s Rp %,9d%n", (i + 1), menu[i], prices[i]);
        }
        System.out.println("==============================================");

        String again;
        do {
            System.out.println("\n---------------- MENU SEARCH -----------------");
            System.out.print("Enter menu name to search : ");
            String keyword = input.nextLine();

            int foundIndex = -1;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(keyword)) {
                    foundIndex = i;
                    break;
                }
            }

```
```
            if (foundIndex != -1) {
                System.out.printf(">> %s is available. Price: Rp %,d%n",
                                  menu[foundIndex], prices[foundIndex]);
            } else {
                System.out.println(">> Sorry, \"" + keyword + "\" is not available on the menu.");
            }

            System.out.print("Search again? (y/n) : ");
            again = input.nextLine();
        } while (again.equalsIgnoreCase("y"));

        System.out.println("\n=================== ORDER ====================");
        int totalItems;
        do {
            System.out.print("How many items do you want to order? : ");
            totalItems = input.nextInt();
            input.nextLine(); 
            if (totalItems <= 0) {
                System.out.println(">> Number of items must be more than 0.");
```
```
            }
        } while (totalItems <= 0);

        String[] orders = new String[totalItems];   
        int[] orderPrices = new int[totalItems];
        int total = 0;

        for (int i = 0; i < totalItems; i++) {
            int index;
            do {
                System.out.print("Item " + (i + 1) + " : ");
                String name = input.nextLine();

                index = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(name)) {
                        index = j;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println(">> Menu not found. Please enter a name from the menu list.");
                }
            } while (index == -1);

            orders[i] = menu[index];
            orderPrices[i] = prices[index];
            total = total + prices[index];
        }
```

```
        System.out.println("\n==============================================");
        System.out.println("                ORDER RECEIPT");
        System.out.println("==============================================");
        System.out.printf("%-4s %-18s %12s%n", "No", "Item", "Price");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < orders.length; i++) {
            System.out.printf("%-4d %-18s Rp %,9d%n", (i + 1), orders[i], orderPrices[i]);
        }
        System.out.println("----------------------------------------------");
        System.out.printf("%-23s Rp %,9d%n", "TOTAL", total);
        System.out.println("==============================================");
        System.out.println("      Thank you for ordering! Enjoy :)");
        System.out.println("==============================================");

        input.close();
    }
}
```
<font color=557945><b>Output:</b></font>
```
Enter menu name to search : Cappucino
>> Sorry, "Cappucino" is not available on the menu.
Search again? (y/n) : n 

=================== ORDER ====================
How many items do you want to order? : 3
Item 1 : Toast
Item 2 : Cappuccino
Item 3 : fried rise
>> Menu not found. Please enter a name from the menu list.
Item 3 : fried rice

==============================================
                ORDER RECEIPT
==============================================
No   Item                      Price
----------------------------------------------
1    Toast              Rp    10,000
2    Cappuccino         Rp    18,000
3    Fried Rice         Rp    15,000
----------------------------------------------
TOTAL                   Rp    43,000
==============================================
      Thank you for ordering! Enjoy :)
==============================================
```