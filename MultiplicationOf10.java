/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Moises
 */
public class MultiplicationOf10 {
    public static void main(String[] args){
    
    int num = 9;
   
    int result = ProductTableOf10(num);
        System.out.println("");
        
        
    }
    
    public static int ProductTableOf10( int num){
        
        for(int i = num; i >= num; i--){
            
            for(int x = 1; x <= 10; x++){
                
                System.out.println(i + " x " + x);
                int result = i * x;
                
                    System.out.println(result);
            }
        }
        return num;
    }
    
    
}
