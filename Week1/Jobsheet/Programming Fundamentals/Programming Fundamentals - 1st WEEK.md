***


> Name : Dewi Novita Sari 
> NIM‎ ‎ ‎ ‎ 	: 264107020002
> Class‎ ‎ : TI-1I
* * *
<h2 style="text-align: center"> JOBSHEET 1 - Programming Language (Java Development Kit/JDK Installation)
</h2>

* * *
<br>

## 2.1 Experiment 1: Installing the Java Development Kit/JDK

<font color=FF7F11><b>Question:</b></font>
1. Explain the purpose of adding the location of Java's bin folder to the PATH variable!
2. Explain the purpose of the javac command when entered in the command prompt!
   
<font color=#427AB5><b>Answer:</b></font> 

###### 1. The purpose of adding the location of Java's bin folder to the PATH variable <br> 
Adding the Java bin folder to the PATH variable allows Windows to find Java commands and programs more easily. It acts as a link between the operating system and the Java tools, so commands such as java and javac can be used directly in the Command Prompt without typing the full Java folder location.
###### 2.  The purpose of the javac command when entered in the command prompt
The purpose of the javac command is to compile (translate) Java source code written in a `.java file`. It checks the code for errors and converts it into a `.class` file so that it can be executed by the Java Virtual Machine (JVM).
<font color=#F39399><b>Documentation:</b></font> 
![Screenshot 2026-08-26 091454.png](../_resources/Screenshot%202026-08-26%20091454.png)

* * *
## 2.2 Experiment 2 : Basic Java Structure

<font color=FF7F11><b>Question:</b></font>
1. Explain the function of the command `javac MyFirstJava00.java` in the experiment
above!
2. Explain the function of the command `java MyFirstJava00` in the experiment above!
   
<font color=#427AB5><b>Answer:</b></font> 
###### 1.  The function of the command javac `MyFirstJava00.java` in the experiment
  The `javac MyFirstJava00.java` command is used to compile the Java source code in the `MyFirstJava00.java` file. It checks the code for errors and, if there are no errors, converts the source code into a `MyFirstJava00.class` file that can be executed by the Java Virtual Machine(JVM).
###### 2. The function of the command java `MyFirstJava00` in the experiment
The `java MyFirstJava00` command is used to run the `Java` program that has already been compiled. The java command tells the JVM to read and execute the `MyFirstJava00.class` file. Therefore, the program can run and display the output in the terminal if there is an output command such as `System.out.println().`

<font color=#F39399><b>Documentation:</b></font> 
![Screenshot 2026-08-27 220417.png](../_resources/Screenshot%202026-08-27%20220417.png)

* * *

## 2.3 Experiment 3 : Adding an Extension in Visual Studio Code
<font color=FF7F11><b>Question:</b></font>
1. Change the `System.out.println` command to `System.out.print` on lines 6 and 7, then
run the program!
2. What is the difference between `System.out.println("...")`; and
`System.out.print("...");`? Explain!
3. Change the commands on lines 6 and 7 to the following :
```
System.out.print("\nLearning Java is easy!");
System.out.print("\nThe more often you practise, the better you get.");
```
4. Explain the function of the `\n` command on lines 6 and 7!
5. On line 7, add the characters `//` so that the line becomes
```
 `//System.out.print("\nThe more often you practise, the better you get.");`

```
6. Run the program and observe what happens! Explain the function of the // characters
<font color=#427AB5><b>Answer:</b></font> 
1.  Change the System.out.println command to System.out.print
   ![Screenshot 2026-08-27 224405.png](../_resources/Screenshot%202026-08-27%20224405.png)
2. What is the difference between `System.out.println("...");` and
`System.out.print("...");`
The difference between `System.out.println()` and `System.out.print() is that println()` moves to a new line after displaying the text, while print() keeps the output on the same line.
3. Change the commands on lines 6 and 7 `System.out.print("\n...");`
   ![Screenshot 2026-08-27 225430.png](../_resources/Screenshot%202026-08-27%20225430.png)
4. Explain the function of the `\n` command on lines 6 and 7!
   The `\n` command is used to create a new line in the output. When `\n` is used in`System.out.print(...),` the text after `\n` will be displayed on the next line.
5. added the characters `//`
   ![Screenshot 2026-08-27 230045.png](../_resources/Screenshot%202026-08-27%20230045.png)
   6. The function of the `//` characters
      The `//` characters are used to make the line a comment. When `//` is placed at the beginning of a line, the Java compiler ignores everything after `//`, so the command is not executed and its output will not appear in the program.
	  
* * *

<h1 style = "color: #66A3BF; text-align: Center"> Assignment </h1> 

<font color=FF7F11><b>Question:</b></font> After the 3 steps above have been executed, which of the statements below are correct (more than one may apply)?

<font color=#427AB5><b>Answer:</b></font>  (a) The two balls have swapped places
 ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎ ‎   (e) tray C is empty
 
<font color=BFC9D1><b> Why?</b></font>  Because after the three steps were executed, the two balls successfully swapped places. Tray C is also empty because it was only used as a temporary tray during the process. Therefore, the correct statements are (a) The two balls have swapped places and (e) Tray C is empty.

<font color=FF7F11><b>Question:</b></font> Write a Java program (for example named RobotArm00.java, replacing 00 with your student/roll number) that prints the contents of trays A, B, and C after EVERY step (Step 1, Step 2, Step 3), ending with a conclusion line that prints which statement is correct according to your own analysis. Example output format (the dots are to be filled in based on your own analysis, not a ready-made answer):
```
Mamluatuls-MacBook-Air:~ mamluatulhaniah$ java RobotArm00
After Step 1: Tray A = ..., Tray B = ..., Tray C = ...
After Step 2: Tray A = ..., Tray B = ..., Tray C = ...
After Step 3: Tray A = ..., Tray B = ..., Tray C = ...
Conclusion: The correct statement is "..."
Mamluatuls-MacBook-Air:~ mamluatulhaniah$
```
<font color=#427AB5><b>Answer:</b></font> 
![Screenshot 2026-08-28 211506.png](../_resources/Screenshot%202026-08-28%20211506.png)

<font color=F39399><b> How?</b></font>

```
public class RobotArm08 {

    public static void main(String[] args) {
        System.out.println("After Step 1: Tray A = Empty, Tray B = Moon ball, Tray C = Star ball");
        System.out.println("After Step 2: Tray A = Moon ball, Tray B = Empty, Tray C = Star ball");
        System.out.println("After Step 3: Tray A = Moon ball, Tray B = Star ball, Tray C = Empty");
        System.out.println("Conclusion: The correct statements are After the three steps were executed, the two balls successfully swapped places. Tray C is also empty because it was only used as a temporary tray during the process. Therefore, the correct statements are (a) The two balls have swapped places and (e) Tray C is empty.");
}
}
```