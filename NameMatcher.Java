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

                    //an if statement outside the loop returning false once only
              // if the matcher is inside the forloop it will print every false statements
                 if(matcher != true){
                      System.out.println("Names are not Matched!");
                  }
          
               //Ask input for Reinitializing the program 
              System.out.print("Retry? ");
                char set = s.next().toUpperCase().charAt(0);
                if ( set == ('Y')){
                    System.out.println("Okay");
                    continue;
                }
                else if (set == 'N'){
                    System.out.println("End program!");
                    break;
                }
                
          }while(true);
}
}
