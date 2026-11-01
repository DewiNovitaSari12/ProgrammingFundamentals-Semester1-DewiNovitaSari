***


> Name : Dewi Novita Sari 
> NIM‎ ‎ ‎ ‎ 	: 264107020002
> Class‎ ‎ : TI-1I
* * *
<h2 style="text-align: center"> JOBSHEET 2 - Variables, Data Types, Operators (Arithmetic) and Input-Output 
</h2>

* * *
<br>

## 2.1 Experiment 1: Use of Variables

<font color=FF7F11><b>Question:</b></font> 
1. Change the variable name so that the variable naming model is good and correct! 
2. What is the function of `%s` in the statement below?
```
System.out.println(String.format("My GPA is %s and my height is %s meters", $gpa, height)) ;
```
 Is there anything you can use instead of `%s`? Name and explain it!

<font color=#427AB5><b>Answer:</b></font> 

###### 1. Change the variable name <br> 
![Screenshot 2026-09-06 222141.png](../_resources/Screenshot%202026-09-06%20222141.png)
###### 2. The function of %s
![Screenshot 2026-09-06 143632.png](../_resources/Screenshot%202026-09-06%20143632.png)
`%s` is a placeholder for a String or text value. We can also use other format specifiers depending on the data type, such as `%d` for integers, `%f` for decimal numbers like in my code (`%.3f` allows you to specify that the number be displayed with 3 decimal places), `%b` for boolean, and `%c` for characters. We can use `println`, but `String.format()` is useful when we want to format the values, such as controlling the number of decimal places.
* * *

## 2.2 Experiment 2: Use of Data Types

<font color=FF7F11><b>Question:</b></font> 
1. Explain why the bloodGroup does not display an `"A"`!
2. Explain the meaning of `byte distance = (byte) 130!` Then, explain why the results change when displayed!
3. In the syntax `float temperature = 60.50F;` remove the `letter F`, then run again. What happened?
4. Why does the result change when displaying weight values?
5. Explain the meaning of initializing 0x10 on number variables! What does it do?

<font color=#F39399><b>Documentation:</b></font> 
![Screenshot 2026-09-06 221815.png](../_resources/Screenshot%202026-09-06%20221815.png)
<font color=#427AB5><b>Answer:</b></font> 

###### 1. Why does bloodGroup not display an `"A"`  <br> 
Because bloodGroup is stored as a `char,` Java treats it as a character, not as a `String`. In ASCII (stands for American Standard Code for Information Interchange), the character `'A'` is represented by the number `65`. Therefore, when Java treats bloodGroup as a number, it displays `65` instead of `"A"`.
###### 2. The meaning of `byte distance = (byte) 130!` Then, explain why the results change when displayed  <br> 
`byte distance = (byte) 130;` means that the value 130 is explicitly converted to the byte data type. Since a byte can only store values from -128 to 127, 130 is outside the allowed range. Therefore, Java converts it using type casting, causing the displayed result to become -126.
###### 3. Syntax `float temperature = 60.50F;` remove the `letter F`, then run again <br>
![Screenshot 2026-09-06 224439.png](../_resources/Screenshot%202026-09-06%20224439.png)
When the letter `F` is removed, the program gives an `error` because Java treats `60.50` as a `double` by default. The `F` is needed to tell Java that the number is a `float`.
###### 4. Why does the result change when displaying weight values? <br>
The result changes because different data types store and display numbers differently. When a decimal weight value is converted to another data type, such as `int`, the decimal part may be removed  or the value may be represented differently.
 ###### 5. The meaning of initializing 0x10 on number variables
Initializing `0x10` means assigning the hexadecimal value `0x10` to a number variable. The `0x` tells Java that the number is written in hexadecimal (base 16). The value `0x10` is equal to 16 in decimal, so the variable will store the value 16. It is simply another way of writing a number.





* * *
## 2.3 Experiment 3: Use of Operators


<font color=FF7F11><b>Question:</b></font> 
1. Explain, in your opinion, the difference between `a + b * c and (a + b) * c.`
2. What is the difference between `a / b` and `a % b`?

<font color=#F39399><b>Documentation:</b></font> 
![Screenshot 2026-09-06 230053.png](../_resources/Screenshot%202026-09-06%20230053.png)
<font color=#427AB5><b>Answer:</b></font> 
###### 1. Difference between `a + b * c` and `(a + b) * c`

The difference is the order in which the calculation is performed. In `a + b * c,` multiplication is done first because multiplication has a higher priority than addition.
So:
```
a + b * c = 10 + (20 × 10) = 210
```

Meanwhile, `(a + b) * c` calculates the addition first because the brackets have priority:
```
(a + b) * c = (10 + 20) × 10 = 300
```

In simple words, the brackets change the order of the calculation, so the results are different.

###### 2. Difference between `a / b` and `a % b`

`/` is used for division, while `%` is used to find the remainder after division.

For example:
```
a / b= 10 / 20= 0

```
Because a and b are integers `in`t, Java gives the whole-number result and ignores the decimal part.

While:
```
a % b= 10 % 20= 10
```
because 10 cannot be divided by 20 completely, so the remainder is 10.

In simple words, `/` gives the result of division, while `%` gives the remainder of the division.
* * *
## 2.4 Experiment 4: Case Study
<font color=FF7F11><b>Question:</b></font>
1. Explain why you have to declare `Scanner` in Experiment 4?
2. Explain the use of the program snippets below!
```
base=sc.nextInt();
height = sc.nextInt();   
```
<font color=#F39399><b>Documentation:</b></font> 
![Screenshot 2026-09-06 231153.png](../_resources/Screenshot%202026-09-06%20231153.png)
<font color=#427AB5><b>Answer:</b></font> 
###### 1. Why do you have to declare Scanner in Experiment 4?

We need to declare `Scanner` because the program needs to receive input from the user through the keyboard.

In the program, this line:
```
Scanner sc = new Scanner(System.in);
```

creates a `Scanner` object called `sc`. The `Scanner` allows the program to read the values that the user enters, such as the base and height of the triangle.

###### 2. Explain the use of these program snippets
`base = sc.nextInt();` reads an integer entered by the user and stores it in the `base` variable. `height = sc.nextInt();` does the same thing for the height variable. These commands allow the program to get the base and height values from the user.
* * *
## 2.5 Experiment 5: Case Study
<font color=FF7F11><b>Question:</b></font>
Run the program code that you have written, then observe the results

<font color=#F39399><b>Documentation:</b></font> 
![Screenshot 2026-09-07 000108.png](../_resources/Screenshot%202026-09-07%20000108.png)
<font color=#427AB5><b>Answer:</b></font>

The program uses `Scanner` to receive the initial savings amount and savings period from the user. The int data type is used for the initial savings amount and savings period because both values are entered as whole numbers. The `double` data type is used for the interest, interest percentage, and final savings amount because the calculation can produce decimal values. The value `0.02` represents the 2% annual interest rate provided by the bank, while `nextInt()` is used to read the integer values entered by the user. After the user enters the required values, the program calculates the interest by multiplying the savings period, interest rate, and initial savings amount. Finally, the interest is added to the initial savings amount to calculate the final savings amount.
* * *
## 3 Assignment
<font color=FF7F11><b>Question:</b></font>
###### 1. Case Study 1:
Mrs. Jesi is an employee at PT. ABCD with a basic salary of Rp. 3,000,000 per month.
At PT. ABCD, every employee receives a child allowance based on the number of
children they have. The allowance is Rp. 150,000 per child per month. In addition,
employees are required to contribute 5% of their basic salary each month to a
mandatory pension fund.
Task: Write a program to calculate Mrs. Jesi’s net monthly salary if she has 3 children.

###### 2. Modify the program from Case Study 1 
by making the basic salary, child allowance, and number of children dynamic inputs.

###### 3. Case Study 2:
Mr. Jaka owns a piece of land with a width of 50 meters and a length of 100 meters.
He plans to build two fish ponds: one circular pond with a diameter of 2 meters and
one square pond with a side length of 2 meters. The remaining land will be planted
with garden grass.
Task: Write a program to calculate the total area of land that will be planted with grass.

###### 4. Modify the program from Case Study 2 
by making the width, length, diameter, and side length dynamic inputs.

<font color=#427AB5><b>Answer:</b></font>
###### 1. Case Study 1:
![Screenshot 2026-09-07 000906.png](../_resources/Screenshot%202026-09-07%20000906.png)

The program uses the basic salary, child allowance, and number of children provided in the case study. First, it calculates the child allowance by multiplying the number of children by Rp150,000. Then, the pension contribution is calculated as 5% of the basic salary. Finally, the net monthly salary is calculated by adding the child allowance to the basic salary and subtracting the pension contribution.

###### 2.The program is modified by making the basic salary
![Screenshot 2026-09-06 233715.png](../_resources/Screenshot%202026-09-06%20233715.png)

The program is modified by making the basic salary, child allowance per child, and number of children as dynamic inputs. The user can enter different values when the program runs, and the program will calculate the child allowance, pension contribution, and net monthly salary based on the given inputs.

###### 3. Study Case 2

![Screenshot 2026-09-06 234132.png](../_resources/Screenshot%202026-09-06%20234132.png)

The program successfully calculates the total area of land planted with grass. Based on the input values, the total land area is 5,000 m², while the circular and square ponds use 3.14 m² and 4 m². Therefore, the remaining area for garden grass is 4,992.86 m².

###### 4. Modify the program from Case Study 2 
![Screenshot 2026-09-06 235143.png](../_resources/Screenshot%202026-09-06%20235143.png)

The program was modified by making the width, length, diameter, and side length as dynamic inputs. This allows the user to enter different values when the program runs. The program then calculates the total land area, the area of each pond, and the remaining area that can be planted with grass based on the input values.