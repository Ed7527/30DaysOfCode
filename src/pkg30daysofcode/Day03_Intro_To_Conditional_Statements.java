package pkg30daysofcode;
import java.util.Scanner;

public class Day03_Intro_To_Conditional_Statements {
    
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         // Complete the code
          if ((n <= 20) && (n >= 6)){
              ans = "Weird";
          } else {
              ans = "Not Weird";
          }
      }
      System.out.println(ans);
        
    }
    
}
