package week5.assignments.task3.case2;

import java.util.Scanner;

public class AssignmentQueue08 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int serviceCode;

        System.out.println( "--- Digital Academic Service Queue System ---" );
        System.out.println("Input your Service Code");
        serviceCode=input.nextInt(); 
        input.close();

        if(serviceCode==1){
            System.out.println("=====This is your Queue=====");
            System.out.println("Service: Degree Legalization");
            System.out.println("Counter: A");
            System.out.println("=========Thank You==========");
        }
        else if (serviceCode==2){
            System.out.println("==========This is your Queue========="); 
            System.out.println("Service: Student Certificate Active");
            System.out.println("Counter: B");
            System.out.println("==============Thank You==============");
        }

        else if (serviceCode==3){
            System.out.println("=====This is your Queue=====");
            System.out.println("Service: Tuition Payment(UKT)");
            System.out.println("Counter: C");
            System.out.println("=========Thank You==========");
        }

        else if (serviceCode==4){
            System.out.println("==========This is your Queue===========");
            System.out.println("Service: Application for Academic Leave");
            System.out.println("Counter: D");
            System.out.println("===============Thank You===============");
        }

        else{
            System.out.println( "Service code is not available");
            
        }
    }
}
