package pkg30daysofcode;
import java.util.Scanner;

public class Day10_Binary_Numbers {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int baseTen = scan.nextInt();
        scan.close();
        int remainder;
        int countOnes = 0;
        int maxOnes = 0;
        String binaryNumber = ("");
        
        while (baseTen > 0){
            remainder = baseTen%2;
            baseTen = baseTen/2;
            
            binaryNumber = (remainder + binaryNumber);
            
        }
        
        System.out.println(binaryNumber);
        
        for (int i = 0; i < binaryNumber.length(); i++){
            if (binaryNumber.charAt(i) == '1'){
                countOnes++;
                
                if (countOnes > maxOnes){
                    
                    maxOnes = countOnes;         
                }
            } else {
                
                countOnes = 0;   
            }   
        }   
        System.out.println(maxOnes);
    }
}