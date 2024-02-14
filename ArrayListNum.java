/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author Moises
 */
import java.util.*;
import java.util.ArrayList;
public class ArrayListNum {
    public static void main (String[]   args){

        
        ArrayList<Integer> numListOne = new ArrayList<>();
    
        for(int x = 1; x <= 5; x++){
            numListOne.add(x); 
        }
            System.out.println(numListOne);
            
        
        System.out.println("*******************************************************");
        
        ArrayList<Integer> numListTwo = new ArrayList<>();
        
        for(int y = 6;  y <= 10; y++){
            numListTwo.add(y);
        }
            System.out.println(numListTwo);
            
        System.out.println("*******************************************************");
        
        numListOne.addAll(numListTwo); 
        System.out.println(numListOne);
        
//        System.out.println(numListOne.addAll(numListTwo)); //Output is true
        
       
//        numListOne.addAll(0, numListTwo);
//        System.out.println(numListOne); //The Output will make numListTwo start at index 0 of numListOne
    }
}

