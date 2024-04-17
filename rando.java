/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Moises
 */
import java.util.Scanner;
public class rando {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
        int random = (int)(Math.random()*5 + 1);
        int x = 0;
        
        
        while(true){
            System.out.println("Guess the Num! ");
            
            int input = s.nextInt();
                if(input == random){
                    System.out.println("Correct Guess!");
                    System.out.println("Wrong Attempts: " + x);
                    
                    System.out.println("Try Again? ");
                    char tries = s.next().toUpperCase().charAt(0);
                        if(tries == 'Y'){
                            x =0;
                        }
                        else if (tries == 'N'){
                            System.out.println("Done");
                            break;
                        }
                }
                else if(input != random){
                    System.out.println("Try Again!");
                    x++;
                }

                
                
        }               
    }
}
