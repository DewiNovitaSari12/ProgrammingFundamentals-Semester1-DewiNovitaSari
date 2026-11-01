***
> Name  : Dewi Novita Sari 
>
> NIM	: 264107020002
>
> Class : TI-1I
* * *
<h2 style="text-align: center"> JOBSHEET 3 - Operator, Sequence, Flowchart and Pseudocode
</h2>

* * *
<br>

## 2.1 Experiment 1:  The Use of Operators

<font color=FF7F11><b>Question:</b></font> 
1. Explain the difference between `x++` and `++x.`
2. What is the result of `int z = x ^ y;`? Please calculate it manually
   
<font color=#F39399><b>Documentation:</b></font>
![Screenshot 2026-09-09 090435.png](../_resources/Screenshot%202026-09-09%20090435.png)
<font color=#427AB5><b>Answer:</b></font>
1. The difference between `x++` and `++x` 
`x++` means that the current value of x is used first, and then x is incremented by 1.
Whereas `++x` increments x by 1 first, and then the updated value is used.
2. The result of `int z = x ^ y;`
	x = 11 = 1011
	y = 12 = 1100

	1011
	1100
	____XOR
	0111
   z = x ^ y = 0111= 7 So, the result is z = 7.


* * *
## 2.2 xperiment 2: Case Study
<font color=FF7F11><b>Question:</b></font> 
1. Explain why it is necessary to declare a Scanner in experiment 2 above!
2. Explain the purpose of the following program snippet.
```
length = input.nextDouble();
width = input.nextDouble();
```
<font color=#F39399><b>Documentation:</b></font>
![Screenshot 2026-09-09 091409.png](../_resources/Screenshot%202026-09-09%20091409.png)
<font color=#427AB5><b>Answer:</b></font> 
1.We need to declare a `Scanner` because this program needs to accept user input. In this program, the `Scanner` is used to read the length and width of a rectangle entered via the keyboard. In the previous program, the user wasn’t asked to enter any data, so there was no need to use a `Scanner`.

2. These statements are used to read integer values entered by the user. The first value is stored in the length variable, while the second value is stored in the width variable. These values are then used to calculate the area of the rectangle.
* * *
## 2.3 Experiment 3: Case Study
<font color=FF7F11><b>Question:</b></font> 
1. Modify the program above by changing the data type of price to double, then run the program and fix any `errors` until it executes correctly and produces the expected output.
2. If, in the program above, the total payment is calculated first and then the discount is computed afterward, will the program still run and produce the expected output?Explain your answer.

<font color=#F39399><b>Documentation:</b></font>
1. First
![Screenshot 2026-09-09 102137.png](../_resources/Screenshot%202026-09-09%20102137.png)

<font color=#427AB5><b>Answer:</b></font> 
1. Modify the program by changing the data type of price to double
 ![Screenshot 2026-09-09 210141.png](../_resources/Screenshot%202026-09-09%20210141.png)
2. No, the program will not produce the expected output if `totalPayment` is calculated before the discount. 
<font color=#FFC349><b>Explanation:</b></font>
This is because `totalPayment` requires the discount value to calculate the final price. If we calculate `totalPayment` first, Java will have trouble finding the discount value because it hasn't been calculated yet, so it will display an error message because the `discount` variable does not yet have a value.
* * *
## 2.4 Experiment 4: Case Study
<font color=FF7F11><b>Question:</b></font> 
1. In the following code snippet, what will happen if the parentheses `()` are removed, and does it affect the output result? Explain your answer!
```
totalSalary = basicSalary + transportAllowance + mealAllowance +bonus-
(0.1* basicSalary);
```
2. Modify the program above so that the total salary output is displayed as an integer value!
   
<font color=#F39399><b>Documentation:</b></font>
![Screenshot 2026-09-09 105253.png](../_resources/Screenshot%202026-09-09%20105253.png)
<font color=#427AB5><b>Answer:</b></font> 
1. If the parentheses are removed, the result will remain the same. This is because the multiplication operator `(*)` has higher precedence than addition `(+)` and subtraction `(-)` in the Java programming language. Therefore, `0.1 * basicSalary` will still be evaluated first even without parentheses.
2. Modify the program above so that the total salary output is displayed as an integer value!
   ![Screenshot 2026-09-10 125254.png](../_resources/Screenshot%202026-09-10%20125254.png)

* * *
## Assignments
<font color=FF7F11><b>Taks:</b></font> 
1. Mr Ali buys a motorcycle on credit for Rp. x. He makes a down payment of Rp. y, and the remaining amount is paid in installments over z months with a fixed interest rate of `1%` per month on the outstanding balance. Write a program to calculate the monthly installment amount that Mr. Ali must pay.
2. A car travels from Malang to Surabaya, covering x km. The car consumes an average of 1 liter of fuel every 2 km. If the fuel price is Rp. 10,000 per liter, write a program to calculate the total fuel cost required for the trip.
   
<font color=#427AB5><b>Code:</b></font>
1. Motorcycle Credits
![Screenshot 2026-09-10 181710.png](../_resources/Screenshot%202026-09-10%20181710.png)

2. Total Fuel Cost To Trip
 ![Screenshot 2026-09-10 182936.png](../_resources/Screenshot%202026-09-10%20182936.png)

<font color=#FFC349><b>Output:</b></font>
1. Motorcycle Credits
   ![Screenshot 2026-09-10 181648.png](../_resources/Screenshot%202026-09-10%20181648.png)

2. Total Fuel Cost To Trip
   ![Screenshot 2026-09-10 182922.png](../_resources/Screenshot%202026-09-10%20182922.png)