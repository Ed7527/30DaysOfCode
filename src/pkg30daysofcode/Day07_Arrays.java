package pkg30daysofcode;
import java.util.Scanner;

public class Day07_Arrays {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        for (int j = n-1; j > -1; j--){
        
            System.out.print(arr[j] + " ");
        }
    }
}