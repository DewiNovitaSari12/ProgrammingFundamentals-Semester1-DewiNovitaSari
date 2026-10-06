//Name : Dewi Novita Sari
//Nim : 264107020002

package quiz;

import java.util.Scanner;

public class TotalCaloriesBurned {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declare Variable
        int duration;
        int bodyweight;
        int targetCalories;
        double altitude;
        double averageSpeed;
        double running= 0.05;
        double swimming=0.04;
        double cycling= 0.03;
        double activity_running;
        double activity_swimming;
        double activity_cycling;
        double total_calories;
        double average_calories;
        double precentage_Calories;


        //Input Athletactivity_swimminge Activity
        
        System.out.println ("Please Write Down Your Information");
        System.out.print("Enter Your Body Weight in Kg:");
        bodyweight = input.nextInt();
        System.out.print("Enter Your Target Calories:");
        targetCalories = input.nextInt();
        System.out.print("Enter duration Your Activity in Minutes: ");
        duration = input.nextInt();
        System.out.print("Enter Your Altitude in Meter:");
        altitude = input.nextDouble();
        System.out.print("Enter Your Average Speed in Km/h:");
        averageSpeed = input.nextDouble();

        //Calories Burn Each Activity(Running)
        activity_running =(duration*running*bodyweight)+(averageSpeed*0.5)+(altitude*0.01);
        //Calories Burn Each Activity(swimming)
         activity_swimming=(duration*swimming*bodyweight)+(averageSpeed*0.5)+(altitude*0.01);
        //Calories Burn Each Activity(Cycling)
        activity_cycling=(duration*cycling*bodyweight)+(averageSpeed*0.5)+(altitude*0.01);
        // total calories 
        total_calories= activity_cycling+activity_running+activity_swimming;
        //average calories burned per minute
        average_calories= total_calories/duration;
        //average precentage of the athlete's daily calories achieved
        precentage_Calories  = total_calories/targetCalories*100;

        
        // Display output
        System.out.println();
        System.out.println("==================================================");
        System.out.println("               Total Calories Burned" );
        System.out.println("==================================================");
        System.out.println();
        System.out.println("ATHELTE INFORMATION");

        System.out.println("  Target Calories               : " + targetCalories);
        System.out.println("  Body weight                   : " + bodyweight);
        System.out.println("  Duration Your Activity        : " + duration);
        System.out.println("  Your Altitude                 : " + altitude);

        System.out.println();
        System.out.println("Calories burned for each activities");
        System.out.println("    Running                         : " + activity_running);
        System.out.println("    Swimming                        : " + activity_swimming);
        System.out.println("    Cycling                         : " + activity_cycling);
       
        System.out.println(); 
        System.out.println("Calories burned for Total activities");
        System.out.println("    Total Calories                              : " + total_calories);
        System.out.println("    Percentage of the athlete's Daily Calories  : " + precentage_Calories);
        System.out.println("    Average Calories per Minutes                : " + average_calories);
        System.out.println();
        System.out.println("==================================================");

        input.close();






        

    
    } 
}
