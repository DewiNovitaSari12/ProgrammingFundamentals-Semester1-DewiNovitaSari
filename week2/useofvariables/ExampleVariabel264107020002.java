package useofvariables;

public class ExampleVariabel264107020002 {
    public static void main(String[]args){
        String myWishList = " I want to go to the hiking ";
        boolean isThatArjuno = true;
        String tackingRoute = "Sumberbrantas";
        char levelOfDifficulty = '4';
        byte numberOfHikers = 10;
        double $masl = 3.339, mileage = 7.5;

        System.out.println( myWishList);
        System.out.println(" Which route will you choose? " + tackingRoute);
        System.out.println(" Is Arjuno on one of your wish list? " + isThatArjuno);
        System.out.println(" What abaout the difficulty grade? " + levelOfDifficulty);
        System.out.println(" How many hikers will join? " + numberOfHikers);
        System.out.println(String.format(" The height of the mountain is %.3f masl and the distance is %.1f km", $masl, mileage));


    }
    
}
