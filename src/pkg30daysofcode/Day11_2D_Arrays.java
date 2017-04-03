package pkg30daysofcode;
import java.util.Scanner;

public class Day11_2D_Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                //arr[i][j] = in.nextInt(); 
                arr[i][j] = i + j;
            }
        }
        
        
        int hourGlassSum;
        int maxHourGlassSum =0;
        for (int row = 0; row < 4; row++) {
            
            hourGlassSum = 0;
            
            for (int column = 1; column < 5; column++){
                hourGlassSum = 
                        arr[row]     [column - 1] +
                        arr[row]     [column] +
                        arr[row]     [column +1] +
                        arr[row + 1] [column +1] +
                        arr[row+2]   [column - 1] +
                        arr[row+2]   [column] +
                        arr[row+2]   [column + 1] ;
                System.out.println(hourGlassSum);
                
                if (hourGlassSum > maxHourGlassSum){
                    maxHourGlassSum = hourGlassSum;
                }
           
            }
        } 
        System.out.println("Max is: " +maxHourGlassSum);
        
    }    
}
