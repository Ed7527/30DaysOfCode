package pkg30daysofcode;
import java.util.Scanner;

public class Day09_Recursion {
    
    private static int factorial(int number) {
        if (number > 2){
		
            number = number * factorial(number - 1);
            return number;
		
	} else {
            return number;
	}	
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int myNum = scan.nextInt();
        System.out.println(factorial(myNum));
    }
    
}
