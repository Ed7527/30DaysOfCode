package pkg30daysofcode;
import java.util.Scanner;

public class Day01_DataTypes {
    
    public static void main(String[] args){
        
        
        Scanner scan = new Scanner(System.in);
        int i = 3;
        double d = 3.1;
        String s = "HackerRank";
        
        /* Declare second integer, double, and String variables. */
        int myInt;
        double myDouble;
        String myString;

        /* Read and save an integer, double, and String to your variables.*/
        myInt = scan.nextInt();
        myDouble = scan.nextDouble();
        scan.nextLine();
        myString = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + myInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + myDouble);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + myString);
        
    }
    
}
