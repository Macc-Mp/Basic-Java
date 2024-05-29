/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfinal;

/**
 *
 * @author Moises
 */
import java.util.Scanner;

class Employee {
    
    private String name;
    private double wage;
    
    Employee(String name, double wage){
        this.name = name;
        this.wage = wage;
    }
    

       
}
   
class FullTime extends Employee{
            double wage;
            String name;

            FullTime(String name, double wage){
                super(name, wage);
            

            }
            
            public String getName(){
                return name;
            }
            public void setName(String name){
                this.name = name;
            }
                     
            public double getWage(){
                double results = wage * 2;
                return results;
            }
            
            public void setWage(double wage){
                this.wage = wage;
            }
            
            
}
            
  class PartTime extends Employee{
            double wage;
            String Name;
  
            PartTime(String Name, double wage){
                super(Name, wage);

            }
            
            public String getName(){
                return Name;
            }
            public void setName(String Name){
                this.Name = Name;
            }
                     
            public double getWage(){
                double results = wage * 2;
                return results;
            }
             
            public void setWage(double wage){
                this.wage = wage;
            }
           

  }       
       
public class EmployeeBatch{

       
    public static void main (String[] args){
        Scanner s = new Scanner (System.in);
        
        
//        FullTime e1 = new FullTime( );
//        e1.setName("Moises");
//        e1.setWage(50);
//        System.out.println(e1.getName() +" " + e1.getWage());

       while(true){
        System.out.print("Enter Employee List: ");
        int size = s.nextInt();
        
        System.out.print("Full time{F} or Part time(P)? ");
        char FP= s.next().toUpperCase().charAt(0);
            if(FP == 'F'){
          
                    FullTime[] e1 = new FullTime[size];
                    
                    for (int x = 0; x < size; x++) {
            System.out.println("Enter name for employee " + (x + 1) + ": ");
            String name = s.next();
            
            
            System.out.println("Enter wage for employee " + (x + 1) + ": ");
            double wage = s.nextDouble();
            

            e1[x] = new FullTime(name, wage);
            
            e1[x].setName(name);
            e1[x].setWage(wage);
        }

        System.out.println("\nFull Time Employee information:");
        for (FullTime employee : e1) {
            System.out.println(employee.getName() + ": " + employee.getWage());
        }

     
                        
                
                
            }
            else if(FP == 'P'){
            
                    PartTime[] e2 = new PartTime[size];
                    
                        for(int y = 0; y < size; y++){
                            
                        System.out.println("Enter name for employee " + (y + 1) + ": ");
                        String name = s.next();
            
            
                        System.out.println("Enter wage for employee " + (y + 1) + ": ");
                        double wage = s.nextDouble();
                            
                        
                            

                    e2[y] = new PartTime( name, wage);
                    e2[y].setName(name);
                    e2[y].setWage(wage);
        
                        }

                    //Prints to console
                     System.out.println("\nFull Time Employee information:");
                for (PartTime employee : e2) {
                 System.out.println(employee.getName() + ": " + employee.getWage());
            }           
                }
            
            //Option to recur program
            System.out.println("y/n");
            char tries = s.next().toLowerCase().charAt(0);
                if (tries == 'y'){
                    System.out.println("Okay");
                }
                else if (tries == 'n'){
                    System.out.println("Exiting...");
                    break;
                }
            
}
}}
       



 
