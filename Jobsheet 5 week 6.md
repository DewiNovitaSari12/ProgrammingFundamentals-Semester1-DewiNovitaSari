
```text
Name ‎   ‎: Dewi Novita Sari 
NIM‎ ‎ ‎  ‎ ‎: 264107020002
Class‎ ‎‎ ‎ : TI-1I
```
* * *
<h1 style="text-align: center"> JOBSHEET 5 - SELECTION STATEMENTS 2  </h1>

* * *
<br>

## 2.1 Experiment 1: Nested IF to Check Thesis Exam Requirements 
<font color=E11A45><b>Question:</b></font> 
1. What happens if the student answers "No" to the penalty-clearance question? Why? 
2. Explain the meaning of the following code snippet! 
`if (guidanceCount1 >= 8 && guidanceCount2 >= 4) {` 
3. Describe the full flow of checking the student's requirements from start to finish. Explain 
step by step for every condition!

<font color=FF9C4C><b>Answer:</b></font>
1. If the student answers "No", the program immediately executes the else statement of the first if.
The output will be: `Failed! The student still has an outstanding penalty`
2. `if (guidanceCount1 >= 8 && guidanceCount2 >= 4) {`

- This condition checks whether the student has fulfilled both guidance requirements:
- guidanceCount1 >= 8 → the student has attended at least 8 sessions with Supervisor 1.
- guidanceCount2 >= 4 → the student has attended at least 4 sessions with Supervisor 2.
- && means AND, so both conditions must be true.
  Therefore, the condition is true only when:
Supervisor 1 >= 8 AND Supervisor 2 >= 4
3. First, the program checks whether the student has cleared all penalties. If the answer is "No", the student fails immediately. If the answer is "Yes", the program checks the guidance sessions. The student can register if Supervisor 1 has at least 8 sessions and Supervisor 2 has at least 4 sessions. If either requirement is not met, the program displays the corresponding reason for failure.
  
* * *
## 2.2 Experiment 2: Logical Operators to Determine Campus WiFi Access 

<font color=#363199><b>Question:</b></font> 
1. Explain the function of the `||, &&, and !` operators in the condition above. 
2. Why can a lecturer still get access when `isStudent = false`? 
3. Change `|| to &&`. Run the program again using test data 1 and 2. What happens, and why? 
4. In the expression `isStudent || isLecturer`, when does isLecturer not need to be evaluated? Explain using short-circuit evaluation. 
5. In the expression `(isStudent || isLecturer) && !isBlocked`, when does !isBlocked not need to be evaluated? Explain.

<font color=9564DD><b>Answer:</b></font>
1. The `||` operator means `OR`, the `&&` operator means `AND`, and the `!` operator means `NOT`; together, they check whether the user is a student or lecturer and whether the account is not blocked.
2. A lecturer can still get access when `isStudent = false` because the condition uses the `OR` operator, so being a lecturer is enough as long as the account is not blocked.
3. If `||` is changed to `&&`, both `isStudent` and` isLecturer `must be true, so test 1 and test 2 will both be denied because each user has only one of the two statuses.
4.` isLecturer `does not need to be evaluated when `isStudent` is already true because the `OR` expression is already guaranteed to be true.
5.` !isBlocked `does not need to be evaluated when both` isStudent` and `isLecturer` are false because the first part of the `AND` expression is already false
* * *
## Experiment 3: Nested IF and Logical Operators to Determine Laboratory Access 

<font color=FF7F11><b>Question:</b></font> 
1. Why is the check `hasLecturerPermit || isLabAssistan`t placed inside the first IF? 
2. Explain the function of the `&&, ||, and !` operators in this program.
3. Can the access requirement be written as a single condition: `isActiveStudent && !isSanctioned && (hasLecturerPermit || isLabAssistant)`? Explain whether the final access decision stays the same. 
4. What is the advantage of using `Nested IF` in this case, compared to a single IF, if the system needs to show different reasons for denial? 
5. Create one input combination that causes access to be denied at the first level, and one that causes it to be denied at the second level.

<font color=427AB5><b>Answer:</b></font>
1. The `hasLecturerPermit || isLabAssistant` condition is placed inside the first `IF` because the second requirement should only be checked after the student has passed the first requirement of being active and not sanctioned.  
2. The` &&` operator requires both conditions to be true, the `||` operator requires at least one condition to be true, and the` ! `operator reverses a `boolean` value.
3. Yes, the requirements can be written as one condition using `isActiveStudent && !isSanctioned && (hasLecturerPermit || isLabAssistant)`, and the final access decision will remain the same.
4. `Nested IF` is useful because it allows the program to show different reasons for denial depending on which requirement the student fails.
5. An example of first-level denial is `isActiveStudent = false` and `isSanctioned = false`, while an example of second-level denial is `isActiveStudent = true`, `isSanctioned = false`, `hasLecturerPermit = false`, and `isLabAssistant = false.` 
* * *
## ASSIGNMENT

<font color=#DF301C> Task</font>
1. Implement the flowchart you created in Exercise 2 of Week 6 for the bookstore discount 
system as a Java program. The program must use nested selection statements (`Nested IF`). 
Use logical operators where needed.
![Screenshot 2026-10-06 194736.png](:/6f1296aa9cf24259868d02365ea99719) 
3. Write a Java program for a lab-assistant candidate selection system based on the following 
rules: 
a. A student may take part in the selection if their status is active and they are not 
currently under academic sanction. 
b. If this requirement is met, the student must also meet the next requirement: a minimum 
grade of 80 in Basic Programming, or a programming competency certificate. 
c. If both requirements are met, the student will be called for an interview. The student is 
accepted as an assistant if the interview score is at least 75. 
d. The program must show the reason if the student fails at any stage of the selection. 
e. Use nested selection and logical operators. Save the file as 
Task2AssistantSelectionAttendanceNo.jav

<font color=FFC349><b>Code:</b></font>
1. Book store discount
```
package week6.assignment;

import java.util.Scanner;

public class BookstoreDiscount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String type;
        int quantity;
        double price;
        double discountRate = 0;
        double discountAmount;
        double totalAmount;

        //declare variables and get user input
        System.out.print("Enter book type (dictionary/novel/other): ");
```
```
        type = input.nextLine();
        System.out.print("Enter number of books: ");
        quantity = input.nextInt();
        System.out.print("Enter price per book: ");
        price = input.nextDouble();
        double subtotal = price * quantity;

        // Nested IF for discount
        if (type.equalsIgnoreCase("dictionary")) {
            discountRate = 0.10;
            if (quantity > 2) {
                discountRate = discountRate + 0.02;
            }
        } else if (type.equalsIgnoreCase("novel")) {
            discountRate = 0.07;
            if (quantity > 3) {
                discountRate = discountRate + 0.02;
            } else if (quantity <= 3) {
                discountRate = discountRate + 0.01;
            }
```
```
        } else {
            if (quantity > 3) {
                discountRate = 0.05;
            } else {
                discountRate = 0;
            }
        }

        //calculate discount amount and total amount

        discountAmount = subtotal * discountRate;
        totalAmount = subtotal - discountAmount;

        //output receipt
        System.out.println("================================");
        System.out.println("\n--- Bookstore Receipt ---");
```
```
        System.out.println("================================");
        System.out.println("Book Type       : " + type);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Price per Book  : " + price);
        System.out.println("Subtotal        : " + subtotal);
        System.out.println("Discount Rate   : " + (discountRate * 100) + "%");
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Total to Pay    : " + totalAmount);
        System.out.println("================================");

        input.close();
    }
}
```

2. Task 2 Assistant
```
package week6.assignment;
import java.util.Scanner;

public class Task2AssistantSelection08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String status;
        String sanction;
        String certificate;
        double programmingGrade;
        double interviewScore;
        String message;

        System.out.print("Enter student status (Active/Inactive): ");
```
```
        status = input.nextLine();
        System.out.print("Is the student under academic sanction? (Yes/No): ");
        sanction = input.nextLine();
        System.out.print("Enter Basic Programming grade: ");
        programmingGrade = input.nextDouble();
        input.nextLine();
        System.out.print("Does the student have a programming competency certificate? (Yes/No): ");
        certificate = input.nextLine();

        // First requirement
        if (status.equalsIgnoreCase("Active") && sanction.equalsIgnoreCase("No")) {
            // Second requirement
            if (programmingGrade >= 80 || certificate.equalsIgnoreCase("Yes")) {
                System.out.print("Enter interview score: ");
                interviewScore = input.nextDouble();
                // Third requirement
                if (interviewScore >= 75) {
                    message = "Accepted! The student is selected as a lab assistant.";
```
```
                } else {
                    message = "Failed! The interview score is below 75.";
                }
            } else {
                message = "Failed! The student must have a Basic Programming grade " + "of at least 80 or a programming competency certificate.";
            }

        } else {

            if (!status.equalsIgnoreCase("Active") && sanction.equalsIgnoreCase("Yes")) {
                message = "Failed! The student's status is inactive " + "and they are under academic sanction.";
            } else if (!status.equalsIgnoreCase("Active")) {
                message = "Failed! The student's status is not active.";
            } else {
                message = "Failed! The student is currently under academic sanction.";
            }
        }
```
```

        System.out.println("\n--- SELECTION RESULT ---");
        System.out.println(message);

        input.close();
    }
}
```

