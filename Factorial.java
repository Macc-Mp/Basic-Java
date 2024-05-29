/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Moises
 */
public class Factorial{
    public static void main(String[] args){
    
    int num = 6;
   
    Factorial(num);
    
    }
    
    public static void Factorial( int num){
        
      int factorial = 1;
        for (int i = num; i >= 1; i--) {
            
          factorial *= i;
          
          System.out.println(num +" x " + i + ": " + factorial );
          
        }
          System.out.println("Factorial of " + num + ": " + factorial);
    }
    
    
}
