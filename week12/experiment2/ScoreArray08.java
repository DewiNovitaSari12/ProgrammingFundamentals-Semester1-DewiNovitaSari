package week12.experiment2;

import java.util.Scanner;

public class ScoreArray08 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
            int[]finalScores = new int [10];
            for (int i = 0;i< finalScores.length; i++){
                System.out.print("Enter the Score for student #" + ( i + 1 )+ ":");
                finalScores [i] = input.nextInt();       
            }
            for (int i = 0; i< finalScores.length; i++){
                String status = (finalScores[i]> 70)? "PASS" : "FAIL";
                System.out.println("Student #"+ (i+1)+":"+ finalScores [i]+"(" + status + ")");  
            }  

        input.close();
    }
    
}
