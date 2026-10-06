package week5.experiment2;

import java.util.Scanner;

public class SelectionIfElse08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("--- Print KRS SIAKAD ---" );
        System.out.println("Enter your current semester");
        int semester = sc.nextInt();

        if (semester==1){
            System.out.println("KRS for Semester 1 is displayed");
        }
        else if (semester==2){
            System.out.println("KRS for Semester 2 is displayed");
        }
        else if (semester==3){
            System.out.println("KRS for Semester 3 is displayed");
        }
        else if (semester==4){
            System.out.println("KRS for Semester 4 is displayed");
        }
        else if (semester==5){
            System.out.println("KRS for Semester 5 is displayed");
        }
        else if (semester==6){
            System.out.println("KRS for Semester 6 is displayed");
        }
        else if (semester==7){
            System.out.println("KRS for Semester 7 is displayed");
        }
        else if (semester==8){
            System.out.println("KRS for Semester 8 is displayed");
        }
        else{
            System.out.println("Invalid Semester");
        }
    }
}
