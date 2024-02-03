
/**
 *
 * @author Moises
 */
import java.util.*;

public class NewEmployee {
    static Scanner s = new Scanner( System.in);
    public static void main(String[] args){
    
    //Instantiating several objects manually uses too mych time and effort
    NewEmployee Batch1 = new NewEmployee("Moises", 156);
       Batch1.Introduction();
       
    //A solution for this is to put the objects in array format. This makes it more organized
        //Prompt for employee batch size
        System.out.print("Enter Employee Size: ");
        int num = s.nextInt();
        
               //Create an object that can hold the array size
              NewEmployee[] Batch2 =  new NewEmployee[num];   
              
              // create a loop for every input required
              for(int i = 0; i < Batch2.length; i++){
                  
                  System.out.print("Enter Name: ");
                    String Name = s.next();
                  System.out.print("Enter Age: ");
                    int Age = s.nextInt();
                    
                    //The object is required to be inside the loop
                    //So it can iterate every object
                     Batch2[i] = new NewEmployee(Name, Age);
              
              }
              
              //create a loop to print each employee object
              int count = 1;
              //For every NewEmployee each one in Batch2 is iterated 
              for(NewEmployee eachOne : Batch2){
                                
                  System.out.println("Employee" + count +": ");
                  eachOne.Introduction();
                  count++;
                  
              }
    }
    
    //Create Global variables
    String NAME;
    int AGE;
    
    //Create a constructor
    NewEmployee(String N, int A){
        this.NAME = N;
         this.AGE = A;
    }
    
    //Constructor Method
    void Introduction(){
         System.out.println("Employee: " + NAME + " Age: " + AGE);   
    } 
}
