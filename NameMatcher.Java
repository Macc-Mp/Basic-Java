/**
 *
 * @author Moises
 */
import java.util.*;
public class string {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
         
          //Program for matching Names from User Input
          String arraynames[] = new String [4];// holds 3 values since forloop x starts at 1
          boolean matcher = false;
          
          //using doWhile loop
          do{
                System.out.println("Enter Three Names: ");
                  for(int x =1; x<arraynames.length; x++){
                      System.out.print(x+ ": ");
                    arraynames[x] = s.next();
                  }

                System.out.println("Choose Name: ");
                String check = s.next();

                //Condition for matching equal user input
              for (int y =1; y< arraynames.length; y++) {
                  if (arraynames[y].equals(check)) {
                      matcher = true;
                      System.out.println("Names Paired!");
                  }

              }
}
}
