/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trycatch;

/**
 *
 * @author Moises
 */
import java.util.*;

public class Guesnum {
    //Encapsulated varibles set to private

    //This sets the random num to 1 to 5
    private static final int randomNum = (int) (Math.random() * 5);
  
    private static Scanner s = new Scanner (System.in);
    private static int total =0;
        
    public static void main (String args[]){
        Guesnum gn = new Guesnum();
        gn.input();
     
    }
    
    public static void input(){
      try{
            do{
            System.out.println("Guess number: ");
            int guess = s.nextInt();

            //Total will count every input done until the number is guessed
            total++;

              //Condition if guess is too low
            if(guess < randomNum){
                System.out.println("Too Low");

              //Condition if guess is too high
            }
            else if (guess > randomNum){
                System.out.println("Too High");
            }

              //Condition for repeating the num guess
            else if (guess == randomNum){
                System.out.println("You have guessed right! \nTry Again Y/N?");
              
               //Prints total tries attempted
                System.out.println("Attempts: "+ total);

                //Update total to 0 again incase if the program is repeated the counter is reset
                total =0;

                char input = s.next().toUpperCase().charAt(0);

                    if(input == 'Y'){
                        continue;
                    }else if (input == 'N'){
                        System.out.println("TY!");
                        break;
                    }
            }
              
            }while(true);

        //Catch for catching unwanted input
        }catch(InputMismatchException e){
            
            System.out.println(e+"Error");
        }
    
     
}
    
}
