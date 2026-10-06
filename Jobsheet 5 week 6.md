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

* * *
## 2.2 Experiment 2: Logical Operators to Determine Campus WiFi Access 

<font color=#363199><b>Question:</b></font> 
1. Explain the function of the `||, &&, and !` operators in the condition above. 
2. Why can a lecturer still get access when `isStudent = false`? 
3. Change `|| to &&`. Run the program again using test data 1 and 2. What happens, and why? 
4. In the expression `isStudent || isLecturer`, when does isLecturer not need to be evaluated? Explain using short-circuit evaluation. 
5. In the expression `(isStudent || isLecturer) && !isBlocked`, when does !isBlocked not need to be evaluated? Explain.

<font color=9564DD><b>Answer:</b></font>
* * *
## Experiment 3: Nested IF and Logical Operators to Determine Laboratory Access 

<font color=FF7F11><b>Question:</b></font> 
1. Why is the check `hasLecturerPermit || isLabAssistan`t placed inside the first IF? 
2. Explain the function of the `&&, ||, and !` operators in this program.
3. Can the access requirement be written as a single condition: `isActiveStudent && !isSanctioned && (hasLecturerPermit || isLabAssistant)`? Explain whether the final access decision stays the same. 
4. What is the advantage of using `Nested IF` in this case, compared to a single IF, if the system needs to show different reasons for denial? 
5. Create one input combination that causes access to be denied at the first level, and one that causes it to be denied at the second level.

<font color=427AB5><b>Answer:</b></font>
   
* * *
## ASSIGNMENT

<font color=#DF301C> Task</font>
1. Implement the flowchart you created in Exercise 2 of Week 6 for the bookstore discount 
system as a Java program. The program must use nested selection statements (`Nested IF`). 
Use logical operators where needed.
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

<font color=FFC349><b>Answer:</b></font>
