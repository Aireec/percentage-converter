

package percentagecalculations;
import java.util.Scanner;

public class Percentagecalculations {

    
    public static void main(String[] args) {
      double x, y, z;
      
      Scanner in = new 
            Scanner(System.in);
      
      System.out.println("Enter numbers you want converted");
      
      x = in.nextDouble();
      y = in.nextDouble();
      z = in.nextDouble();
      
     System.out.println( x / 100 );
     System.out.println(y / 100 );
     System.out.println(z / 100);
     
    }
    
}
