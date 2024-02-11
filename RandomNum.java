/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trycatch;

/**
 *
 * @author Moises
 */
    //import java.util.Random;

public class RandomNum {
    //Random random = new Random();
    //private final int rr = random.nextInt(51);
    
    int randomNumber1 = (int) (Math.random() * 2);
    int randomNumber2 = (int) (Math.random() * 2);
    int randomNumber3 = (int) (Math.random() * 2);
    int num = 1;
    
    public static void main (String[] args){
            RandomNum go = new RandomNum();
            go.input();  
            
            RandomNum stop = new RandomNum();
            stop.input2();
            //C:\Users\Moises\Documents\Netbeans\Trycatch\src\trycatch\RandomNum.java
    }
    public void input(){ 
    
            System.out.print(randomNumber1 +", "+ randomNumber2 +", "+ randomNumber3);
            
            if(randomNumber1 == randomNumber2 && randomNumber2 == randomNumber3){
                System.out.println("\nThree in a Row!!\n");
                    if(num == 2){
                        num++;
                    }
            }
            else{
                System.out.println("Bad Luck");
            }
            System.out.println(" ");
            
}
    public void input2(){
        System.out.println("N: "+ num);
    
    }
}
