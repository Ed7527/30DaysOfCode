package pkg30daysofcode;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Day08_Dictionaries_And_Maps {
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, String> phoneMap = new HashMap<String, String>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneMap.put(name, String.valueOf(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneMap.get(s) == null) {
                
            	System.out.println("Not found");
            } else {
            
            	System.out.println(s + "=" + phoneMap.get(s));
            }
        }
        in.close();
    }
}