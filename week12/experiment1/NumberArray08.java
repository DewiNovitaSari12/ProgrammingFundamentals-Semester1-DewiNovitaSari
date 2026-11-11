package week12.experiment1;
import java.util.Arrays;
public class NumberArray08 {
    public static void main(String[] args) {
        int[] numbers = new int [4];
        numbers [0] = 5.0;
        numbers [1] = 12867;
        numbers [2] = 7.5;
        numbers [3] = 2000000;

        for (int i =0 ; i < numbers.length; i++){
            System.out.println("numbers [" + i + "] = "+ numbers [i]);
        }
        for (int number: numbers){
            System.out.println(number);
        }
        
        System.out.println(Arrays.toString(numbers));
    }
}
