/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Moises
 */
import java.util.*;

public class Act6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        name p1 = new person("Ivana", "Adam", "Lexie");
        
        System.out.println("Enter their Age: ");
        System.out.print(p1.n1 +": ");
            int age1 = s.nextInt();
        System.out.print(p1.n2 +": ");
            int age2 = s.nextInt();
        System.out.print(p1.n3 +": ");
            int age3 = s.nextInt();
         
         System.out.println("");
         p1.call(age1, age2, age3);
        
        
    }
}


abstract class name{
    String n1, n2, n3;
    name(String n1, String n2, String n3 ){
        this.n1 = n1;
        this.n2 =n2;
        this.n3 = n3;
    }
    //Abstract Method
    abstract void call(int a, int b, int c);
}

class person extends name{
    String n1, n2, n3;
    //Constructor for the names
    person(String n1, String n2, String n3){
        super(n1, n2, n3);
    }
    
    @Override
    public void call(int a, int b, int c){
             
        if ((a > b && a > c) ) {
            if(b < c){
                 System.out.println("Ivana " + a + " is Oldest," + " Adam "+ b +" is the youngest!" );
            }
            else if (c < b) {
                 System.out.println("Ivana " + a + " is Oldest," +" Lexie "+ c +" is the youngest!" );
            }
           
        }

        else if ((b > a && b > c)) {
            if(a < c){
                System.out.println("Adam " + b + " is Oldest," +" Ivana "+ a +" is the youngest!" );
            }
            else if (c < a){
                 System.out.println("Adam " + b + " is Oldest," +" Lexie "+ c +" is the youngest!" );
            }
             
        }    

        else if (c > b && c > a) {
             if(b < a){
                 System.out.println("Lexie " + c + " is Oldest," +" Adam "+ b +" is the youngest!" );
             } 
             else if (a < b){
                 System.out.println("Lexie " + c + " is Oldest," +" Ivana "+ a +" is the youngest!" );
             }
             
}
    }
}
