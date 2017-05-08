
import java.util.Scanner;


public class Quation2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Entry 1000<num<999999");
        int x = in.nextInt();
        if (x >= 1000 && x <= 999999) {
            String y = x + "";
            String s = y.substring(0, y.length() - 3);
            String v = y.substring(y.length() - 3, y.length());
            System.out.println(s + "," + v);

        } 
        else 
 System.out.println("error");            
        {
          
    }
   
}
}