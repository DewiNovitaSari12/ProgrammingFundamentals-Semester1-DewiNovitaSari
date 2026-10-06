package week5.assignments.task2;

import java.util.Scanner;

public class Assignment2Selection08 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          int credits;
        
          System.out.println( "---  validates  the  number  of  credits  (SKS)---" );
          System.out.println("Input Your Total Credits");
          credits = input.nextInt();
          input.close();

          if (credits >24 )
            System.out.println("Exceeds the limit" );
          else
            System.out.println("KRS is valid");

          

    }
}

