/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paule_midexam;

import java.util.*;

class player{
    String name;
    double bet;
    
    public player(){ 
    }
    public player(String name){
        this.name = name;
    }
    public player(String name, double bet){
         this.name = name;
         this.bet = bet;
    }
    
}
    class algo{
        double bet = 2;
        int randomNumber1 = (int) (Math.random() * 5);
        int randomNumber2 = (int) (Math.random() * 5);
        int randomNumber3 = (int) (Math.random() * 5);
        int num = 1;
        
        public void voidPlay(){
            System.out.println(num + "Winner Notif");
        }
}
    class prize extends algo{      
        @Override
        public void voidPlay(){
            System.out.println("Congrats You have Won!");
        }    
    }

public class Paule_midexam {
    public static void main (String[] args){
        algo a1 = new algo();
        Scanner s = new Scanner(System.in);
        int set = 0; 
        
       while (true){
           System.out.println("WELCOME TO 3 DIGITS LOTTO GAME");
           System.out.println("ENTER y TO CONTINUE ( (Any Key) TO EXIT): ");
           char inp = s.next().toLowerCase().charAt(0);
           
           if(inp == 'y'){
               System.out.println("Welcome! ");
               System.out.println("Enter # of Players: ");
               int size = s.nextInt();
               player[] p1 = new player[size];
               
                for(int i = 0; i < p1.length; i++){
                  
                  set++;
                    System.out.println("setNo:"+ (set));
                    System.out.println("Enter Player Name"+"(" + (i+1)+ ")"  +": ");
                    String name = s.next();
                    System.out.println("Enter Bet: ");
                    double bet = s.nextDouble();
                    
                     p1[i] = new player(name, bet);
                    
                    System.out.println("Your Number Combination: ");
                    algo a2 = new algo();

                    System.out.println(a2.randomNumber1 + "-" + a2.randomNumber2 + "-" + a2.randomNumber3);

                    if(a2.randomNumber1 == a1.randomNumber1 && a2.randomNumber2 == a1.randomNumber2 && a2.randomNumber3 == a1.randomNumber3){
                        System.out.println("\nCongrats! " + p1[i].name);
                            prize reward = new prize();                
                            bet *= reward.bet;
                            reward.voidPlay();
                            System.out.println("Prize Money: P" + bet);
                    }
                    else{
                        System.out.println("Bad Luck! You Lose!");
                   }        
                   }                   
                    System.out.println("########################");
                    System.out.print("Winning Combination: ");
                    System.out.print(a1.randomNumber1 +"-"+ a1.randomNumber2 +"-"+ a1.randomNumber3);
                    System.out.println(" ");         
           }
                   else{
                       System.out.println("TY for using my app...");
                       break;
                   }
                    
           System.out.println("Would you like to try again? (y/n) ");
           char inp2 = s.next().toLowerCase().charAt(0);
            if(inp2 == 'n'){
                System.out.println("TY for using my app...");
                break;
            } else if(inp2 == 'y'){
                System.out.println("Restarting...");
            }
            else{
                System.out.println("TY for using my app...");
                break;
            }

       }       
    }       
}
    