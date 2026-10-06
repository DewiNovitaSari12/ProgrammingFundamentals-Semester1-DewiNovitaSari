package assigment.studycase1;

public class MrsJesiStudyCase264107020002 {
    public static void main(String[] args) {

        // Declare variables
        int basic_salary = 3000000;
        int number_of_children = 3;
        double child_allowance = 150000;
        double pension;
        double net_salary;

        // Calculate pension contribution
        pension = basic_salary * 0.05;

        // Calculate net monthly salary
        net_salary = basic_salary+ (child_allowance * number_of_children)- pension;

        // Show the output
        System.out.println("The basic salary is: Rp " + basic_salary);
        System.out.println("The child allowance is: Rp " + (child_allowance * number_of_children));
        System.out.println("The pension contribution is: Rp " + pension);
        System.out.println("The net monthly salary is: Rp " + net_salary);
    }
}