package ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Moises
 */
public class Name {
    String Name;
    int Age;
    
    Name(String N, int A){
        this.Name = N;
        this.Age = A;
    }
    
    public void introduce(){
        System.out.println("My name is " + Name + ", I am " + Age);
    
    }
}
