package pkg30daysofcode;
import java.util.Scanner;

public class Day06_Lets_Review {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String[] stringArr = new String[testCases];
        scan.nextLine();
    
        for (int i =0; i < testCases; i++){
            stringArr[i] = scan.nextLine();
    	}
    	
        char[] charArray;
        for (String s: stringArr){
            charArray = s.toCharArray();
            int sLength = s.length();
            //Print evens
            for(int j = 0; j < sLength; j +=2){
    	
    		System.out.print(charArray[j]);
            }
            System.out.print(" ");
    	
            //Print odds
            for(int k =1; k < sLength; k += 2){
    		System.out.print(charArray[k]);
            }
            
    	System.out.println();
        }
    }
}
