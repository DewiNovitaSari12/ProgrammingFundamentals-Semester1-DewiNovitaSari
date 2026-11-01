<!-- *** -->
> Name : Dewi Novita Sari 
> NIM‎ ‎ ‎ ‎ 	: 264107020002
> Class‎ ‎ : TI-1I
* * *
<h1 style="text-align: center"> JOBSHEET 4 - Selection 1
</h1>

* * *
<br>

## 2.1 Experiment 1:  Using IF and IF-ELSE to Print the KRS

<font color=FF7F11><b>Question:</b></font> 
1. What value must you enter so that both lines inside the IF block are printed? Explain
why only that value is accepted!
2. Run the program, then enter false. Which lines are printed and which lines are not?
Explain the execution flow when the IF condition is false!
3. Run the program, then enter TRUE (in capital letters) and yes. What happens with
each input? If the program stops with an error, explain the cause!
4. The system needs to give information when the user enters the value false, with the
output “Registration rejected. Please pay your UKT first”. Modify the program by
adding an ELSE structure, then show the run results for the inputs true and false!

<font color=#F39399> Documentation</font>
![Screenshot 2026-09-23 082108.png](../_resources/Screenshot%202026-09-23%20082108.png)
<font color=#427AB5><b>Answer:</b></font>
1. The value we need to enter is “True” because a Boolean can only contain two possible values: true or false. The `if (uktPaid)` statement will only be executed when `uktPaid` is true. Since there is no `else` statement, entering true allows both `println` statements to be executed.
2. ![Screenshot 2026-09-30 042242.png](../_resources/Screenshot%202026-09-30%20042242.png)
No lines from the `if` block are printed because the input value is false. Since the condition is false, the program skips the `if` block and directly executes the `else` block or the next line. 
3. The program accepts `TRUE` as a valid Boolean input because `Scanner.nextBoolean()` is not case-sensitive. It is interpreted as true, so the `if` block is executed. ![Screenshot 2026-09-30 041645.png](../_resources/Screenshot%202026-09-30%20041645.png)The program stops with an error because `yes` is not a valid Boolean value. The `Scanner.nextBoolean()` method only accepts `true` or `false` (regardless of capitalization), so entering yes causes an `InputMismatchException`.![Screenshot 2026-09-30 041708.png](../_resources/Screenshot%202026-09-30%20041708.png)
4. Modify
<font color=##F39399> Code</font>![Screenshot 2026-09-23 082108.png](../_resources/Screenshot%202026-09-23%20082108-1.png)
<font color=#F39399> False</font>![Screenshot 2026-09-23 082206.png](../_resources/Screenshot%202026-09-23%20082206.png)
* * *
## 2.2 Experiment 2:  SWITCH-CASE to Print the KRS
<font color=FF7F11><b>Question:</b></font> 
1. Delete the break; statement in case 5, then compile and run the program again with the input 5. Write down the output, then explain the function of break in the SWITCH-CASE structure based on your experiment! Put the code back to how it was when you are done.
2. Run the program with the input 10, then with the input 0. What is the output of these two runs? Based on the results, explain the role of default and what will happen to the program if the default part is deleted!
3. Change the data type of the semester variable to double, then compile the program. Does the program compile successfully? Write down the error message and explain its cause. List the data types that can be used as the expression in a switch!
4. Create a new file named SelectionIfElseAttendanceNo.java. Convert the KRS printing program that uses SWITCH-CASE into an IF - ELSE IF - ELSE form. The program output must be exactly the same as the SWITCH-CASE version, including for invalid input. In your opinion, which one is easier to read for this case, and why?

<font color=#427AB5><b>Answer:</b></font>
1. ![Screenshot 2026-09-30 042916.png](../_resources/Screenshot%202026-09-30%20042916.png)The `break` statement tells Java to stop executing the `switch` case once it reaches the end of case 5. If we remove the `break` from case 5, the program will continue executing the statements in the next case instead of stopping there.
2. ![Screenshot 2026-09-30 043209.png](../_resources/Screenshot%202026-09-30%20043209.png) When we enter 10, the program prints the `default` message because 10 is not included in any of the cases we defined. The same applies to 0, so it also displays “Invalid semester.” The `default` case works similarly to an `else` statement because it runs when none of the cases match the input. If we remove the `default` case and enter a number that does not match any case, the program will not print anything.
3. ![Screenshot 2026-09-30 043340.png](../_resources/Screenshot%202026-09-30%20043340-1.png)After changing the `semester` variable from `int` to `double`, the program does not compile successfully. The compiler shows an error indicating that `double` is not allowed as the type of the `switch` expression. This occurs because Java only allows certain data types to be used in a `switch`, and `double` is not one of them. The data types that can be used in a `switch` expression are byte, short, char, int, String, and enum. Wrapper types such as `Byte`, `Short`, `Character`, and `Integer` are also supported. Data types such as long, float, and double cannot be used directly as a `switch` expression.
4. ![Screenshot 2026-09-30 043340.png](../_resources/Screenshot%202026-09-30%20043340.png)
   The KRS printing program can be converted from `switch-case` into an `if-else if-else` structure while keeping the same output, including the “Invalid semester” message for inputs that do not match any condition.
In my opinion, the `switch-case` is easier to read for this particular program because the program only needs to compare one variable, semester, with several fixed values. Each semester has its own case, making the structure clear and easy to follow. The `if-else if-else` version works in the same way, but it requires writing semester `==` repeatedly for every condition.
* * *
## 3. Assigments
<font color=FF7F11><b>Question/Task:</b></font> 
1. Open the file SelectionIfAttendanceNo.java again. Change the IF-ELSE selection
structure in the program into a Ternary Operator, with the following rules:
a. The  decision  result  is  first  stored  in  a  String  variable  named  message,  then  printed using a single System.out.println() statement
b. The program output must be exactly the same as the original program
c. Save it with the file name Assignment1SelectionAttendanceNo.java
In  your  opinion,  when  is  the  Ternary  Operator  better  to  use  than  IF-ELSE,  and  when should it not be used
2. Look at the following flowchart.![Screenshot 2026-09-30 044352.png](../_resources/Screenshot%202026-09-30%20044352.png)A  KRS  system  validates  the  number  of  credits  (SKS)  taken  by  a  student,  where  the maximum  number  allowed  is  24  credits.  Implement  the  flowchart  above  as  a  Java program using an IF-ELSE selection structure, then save it with the file name Assignment2SelectionAttendanceNo.java
3. In the Basic Programming class, you made flowcharts and pseudocode for two cases on
the  Exercise  slides  (page  33).  Now  implement  both  of  them  in  Java,  with  the following rules.
a. For Problem 1 — Parking System, use an IF-ELSE selection structure and name the file AssignmentParkingAttendanceNo.java
b. For Problem 2 — Academic Queue Machine, use a SWITCH-CASE selection structure and  name  the  file:  AssignmentQueueAttendanceNo.java.  In  addition,  the  program must  include  a  default  part  to  handle  codes  outside  1–4  with  the  message  "Service code is not available"

<font color=#427AB5><b>Answer:</b></font>
1. ![Screenshot 2026-09-30 050044.png](../_resources/Screenshot%202026-09-30%20050044.png)
In my opinion, the Ternary Operator is better to use when there are only two possible outcomes and the condition is simple. It makes the code shorter and more concise. However, `IF-ELSE` is more suitable when the condition or the statements are complicated because it is easier to read and understand.
2. When the input is 24, the program displays “KRS is valid” because 24 credits are within the allowed limit. When the input is 25, the program displays “Exceeds the limit” because the number of credits is above the maximum allowed limit. This shows that the selection condition correctly distinguishes between valid and excessive credit amounts.
3. a. Parking System![Screenshot 2026-09-30 051321.png](../_resources/Screenshot%202026-09-30%20051321.png)
   b. Academic Queue Machine![Screenshot 2026-09-30 051721.png](../_resources/Screenshot%202026-09-30%20051721.png)![Screenshot 2026-09-30 052119.png](../_resources/Screenshot%202026-09-30%20052119.png)
* * *

## Study Case
1. Nusantara Pay — Transaction Security System
You are tasked with building an automated module for the Nusantara Pay app to evaluate user transactions instantly. The system must assign a single final status based on the following strict order of security priority:
- REJECTED_BLACKLIST: Account status is marked as "BLACK-LISTED".
- REJECTED_SALDO: Transaction amount exceeds available balance.
- REJECTED_LIMIT: Transaction amount exceeds the daily limit ($10,000).
- FLAGGED_FRAUD: Transaction originates from abroad (isBedaNegara == true) and the amount is over $2,000.
- REQUIRE_OTP_NIGHT: Transaction occurs between 00:00 and 04:00 AM and the amount is over $1,000.
- REQUIRE_OTP_SUSPICIOUS: Account status is "SUSPICIOUS" and the transaction amount is over $500.
- APPROVED: The transaction is safe and triggers none of the above conditions.

2. ER Harapan Kita Hospital — Emergency Room Allocation
An Emergency Room (ER) needs an automated system to allocate patient care rooms based on health indicators entered by triage nurses. Create a module to determine the destination room using the following criteria:
- ICU: Oxygen saturation ($SpO_2$) < 85% and ICU beds are available (sisaBedICU > 0).
- UGD_VENTILATOR_MOBIL: $SpO_2$ < 85% but ICU beds are full (sisaBedICU == 0).
- RESUSITASI_UGD: $SpO_2$ is between 85%–89%, or systolic blood pressure is abnormal (under 90 / over 180 mmHg), or the patient is not fully conscious.
- HCU_ISOLASI: ($SpO_2$ is between 90%–94% or body temperature > $39^\circ\text{C}$) and the patient has comorbidities and is aged $\ge 65$.
- RAWAT_INAP_UMUM: $SpO_2$ is between 90%–94% or respiratory rate exceeds 24 breaths/min.
- RAWAT_JALAN: Patient is stable and meets none of the criteria above.

3. Tax Consultant — Progressive Income Tax Calculator
Help the finance team calculate annual Progressive Income Tax (PPh 21) based on an employee's Taxable Income (PKP) across tiered tax brackets:
- PKP $\le$ 0: Tax-free (Rp 0).
- PKP up to Rp 60 Million: 5% tax on total PKP.
- PKP > Rp 60 Million to Rp 250 Million: Maximum tax from the first bracket (5% $\times$ 60 Million) plus 15% on the remaining PKP above 60 Million.
- PKP > Rp 250 Million to Rp 500 Million: Accumulated tax from previous brackets plus 25% on the remaining PKP above 250 Million.
- PKP above Rp 500 Million: Accumulated tax from previous brackets plus 30% on the remaining PKP above 500 Million

 <font color=#427AB5><b>Code:</b></font>
1. Nusantara Pay — Transaction Security System
```
package week5.taskweek5;

import java.util.Scanner;

public class Praud {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare Variable
        String accountStatus;
```
```
        double balance;
        double amount;
        boolean isBedaNegara;
        int transactionHour;
        int transactionMinute;
        String transactionStatus;

        // Input Data
        System.out.print("Enter Account Status (NORMAL / SUSPICIOUS / BLACK-LISTED): ");
        accountStatus = input.nextLine();
```
```

        System.out.print("Enter Available Balance: ");
        balance = input.nextDouble();

        System.out.print("Enter Transaction Amount: ");
        amount = input.nextDouble();

        System.out.print("Transaction From Abroad? (true/false): ");
        isBedaNegara = input.nextBoolean();

        System.out.print("Enter Transaction Hour (0-23): ");
        transactionHour = input.nextInt();

        System.out.print("Enter Transaction Minute (0-59): ");
        transactionMinute = input.nextInt();

        // Transaction Security Evaluation
        if (accountStatus.equalsIgnoreCase("BLACK-LISTED")) {
            transactionStatus = "REJECTED_BLACKLIST";
```
```
        } else if (amount > balance) {
            transactionStatus = "REJECTED_SALDO";
        } else if (amount > 10000) {
            transactionStatus = "REJECTED_LIMIT";
        } else if (isBedaNegara && amount > 2000) {
            transactionStatus = "FLAGGED_FRAUD";
        } else if (((transactionHour >= 0 && transactionHour < 4) || (transactionHour == 4 && transactionMinute == 0)) && amount > 1000) {
            transactionStatus = "REQUIRE_OTP_NIGHT";
        } else if (accountStatus.equalsIgnoreCase("SUSPICIOUS") && amount > 500) {
```
```
            transactionStatus = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            transactionStatus = "APPROVED";
        }

        // Display Output
        System.out.println();
        System.out.println("==================================================");
        System.out.println("              NUSANTARA PAY");
        System.out.println("        Transaction Security System");
        System.out.println("==================================================");
        System.out.println();

        System.out.println("TRANSACTION INFORMATION");
```
```
        System.out.println("  Account Status              : " + accountStatus);
        System.out.println("  Available Balance           : " + balance);
        System.out.println("  Transaction Amount          : " + amount);
        System.out.println("  Transaction From Abroad     : " + isBedaNegara);
        System.out.println("  Transaction Time            : "
                + transactionHour + ":" + transactionMinute);
        System.out.println();

        System.out.println("TRANSACTION SECURITY RESULT");
        System.out.println("  Final Transaction Status    : " + transactionStatus);
        System.out.println();

        System.out.println("==================================================");

        input.close();
    }
}
```

***

2. ER Harapan Kita Hospital — Emergency Room Allocation

```
package week5.taskweek5;
import java.util.Scanner;

public class ERHarapanKitaHospital {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declare Variable

        double spo2;
        double systolicBloodPressure;
        double bodyTemperature;

        int sisaBedICU;
        int age;
        int respiratoryRate;

        boolean isFullyConscious;
        boolean hasComorbidities;
```
```
        String destinationRoom;

        //Input Patient Information

        System.out.println("Please Write Down Patient Information");
        System.out.print("Enter Patient SpO2 (%): ");
        spo2 = input.nextDouble();
        System.out.print("Enter Systolic Blood Pressure (mmHg): ");
        systolicBloodPressure = input.nextDouble();
        System.out.print("Enter Body Temperature (C): ");
        bodyTemperature = input.nextDouble();
        System.out.print("Enter Remaining ICU Beds: ");
```
```
        sisaBedICU = input.nextInt();
        System.out.print("Enter Patient Age: ");
        age = input.nextInt();
        System.out.print("Enter Respiratory Rate (breaths/min): ");
        respiratoryRate = input.nextInt();
        System.out.print("Is The Patient Fully Conscious? (true/false): ");
        isFullyConscious = input.nextBoolean();
        System.out.print("Does The Patient Have Comorbidities? (true/false): ");
        hasComorbidities = input.nextBoolean();

        //Emergency Room Allocation
```

```
        if (spo2 < 85 && sisaBedICU > 0) {
            destinationRoom = "ICU";
        } else if (spo2 < 85 && sisaBedICU == 0) {
            destinationRoom = "UGD_VENTILATOR_MOBIL";
        } else if ((spo2 >= 85 && spo2 <= 89) || systolicBloodPressure < 90 || systolicBloodPressure > 180 || isFullyConscious == false) {
            destinationRoom = "RESUSITASI_UGD";
        } else if (((spo2 >= 90 && spo2 <= 94) || bodyTemperature > 39) && hasComorbidities == true && age >= 65) {
            destinationRoom = "HCU_ISOLASI";
        } else if ((spo2 >= 90 && spo2 <= 94) || respiratoryRate > 24) {
            destinationRoom = "RAWAT_INAP_UMUM";
        } else {
```
```
            destinationRoom = "RAWAT_JALAN";
        }


        //Output Display

        System.out.println();

        System.out.println("==================================================");

        System.out.println("          HARAPAN KITA HOSPITAL");

        System.out.println("        Emergency Room Allocation");

        System.out.println("==================================================");

        System.out.println();

        System.out.println("PATIENT INFORMATION");

        System.out.println("  SpO2                         : " + spo2 + "%");

        System.out.println("  Systolic Blood Pressure     : "
                + systolicBloodPressure + " mmHg");

        System.out.println("  Body Temperature            : "
                + bodyTemperature + " C");
```
```

        System.out.println("  Remaining ICU Beds          : " + sisaBedICU);

        System.out.println("  Patient Age                : " + age);

        System.out.println("  Respiratory Rate            : "
                + respiratoryRate + " breaths/min");

        System.out.println("  Fully Conscious             : " + isFullyConscious);

        System.out.println("  Has Comorbidities           : " + hasComorbidities);

        System.out.println();

        System.out.println("EMERGENCY ROOM RESULT");

        System.out.println("  Destination Room            : " + destinationRoom);

        System.out.println();

        System.out.println("==================================================");

        input.close();

    }

}
```
* * *
3.  Tax Consultant — Progressive Income Tax Calculator
```
package week5.taskweek5;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double income;
        double tax;

        // Input Income
        System.out.print("Write your income: ");
        income = input.nextDouble();
```
```

        // Tax Calculation
        if (income <= 0) {

            tax = 0;

        } else if (income > 0 && income <= 60000000) {

            tax = 0.05 * income;

        } else if (income > 60000000 && income <= 25000000) {

            tax = (0.05 * 60000000) + (0.15 * (income - 60000000));

        } else if (income > 25000000 && income <= 50000000) {
```

```
            tax = (0.05 * 60000000) + (0.15 * 25000000) + (0.25 * (income - 25000000 - 60000000));

        } else {

            tax = (0.05 * 60000000) + (0.15 * 25000000) + (0.25 * 50000000) + (0.30 * (income - 500000000));
        }

        // Output Display
        System.out.println();
        System.out.println("==========================================");
        System.out.println("             TAX CALCULATOR");
        System.out.println("==========================================");
        System.out.println();

        System.out.println("Write your income : " + income);
        System.out.println("This is your tax  : " + tax);

        System.out.println();
```
```
        System.out.println("==========================================");

        input.close();
    }
}
```
<font color=#427AB5><b>Output:</b></font>

1.
![Screenshot 2026-10-03 211321.png](../_resources/Screenshot%202026-10-03%20211321.png) ![Screenshot 2026-10-03 211425.png](../_resources/Screenshot%202026-10-03%20211425.png)
2.
![Screenshot 2026-10-03 211813.png](../_resources/Screenshot%202026-10-03%20211813.png)
3.
[![Screenshot 2026-10-03 213007.png](../_resources/Screenshot%202026-10-03%20213007.png)