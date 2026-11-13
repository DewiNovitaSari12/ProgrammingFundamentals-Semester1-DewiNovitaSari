package week12.experiment1;
import java.util.Arrays;
public class NumberArray08 {
    public static void main(String[] args) {
        int numbers[]={5, 13, -7, 17};

        for (int i =0 ; i < numbers.length; i++){
            System.out.println("numbers[" + i + "] = " + numbers[i]  +  ",  doubled  =  "  +  (numbers[i]  *  2)); 
        }
        for (int number: numbers){
            System.out.println(number);
        }
        
        System.out.println(Arrays.toString(numbers));
    }
}
