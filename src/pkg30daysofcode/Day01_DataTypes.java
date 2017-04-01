package pkg30daysofcode;
import java.util.Scanner;

public class Day01_DataTypes {

    public static void main(String[] args) {
        int i = 7;
        double d = 3.2;
        String s = "Not exacly the same as HackerRank....";
        
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int myInt;
        double myDouble;
        String myString;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        myInt = scan.nextInt();
        myDouble = scan.nextDouble();
        scan.nextLine();
        myString = scan.nextLine();
        // Note: there is no exception handling, it's covered later in the 30 days

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + myInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + myDouble);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + myString);
    }
    
}
