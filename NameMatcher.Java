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



        //Other ways to create matching sequence
                 
            String[] username = {"Moises", "Mac", "Paule"};
            String locate = "Moises";
            
            for(int x = 0; x < username.length; x++)
                
            if (locate.equals(username[x])){
                System.out.println("Username Found");
            }else{
                System.out.println("USername not found");
            }
            
             String[] names = {"Juan", "Pedro", "Maria", "Rui", "Anna","MICO!"};
        String searchname = "MICO!";
        boolean foundname=false;
        
          for(int i=0; i<names.length; i++){
                if(names[i].equals(searchname)){
                  foundname=true;
                  break;
            }
        }
          
          if(foundname){
                    System.out.println(searchname+ " is found!!!");
                }
                else{
                    System.out.println(searchname+ " is not found!!!");
                }
     

}
}
