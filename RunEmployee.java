d/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runemployee;

/**
 *
 * @author Moises
 */
import java.util.*;
public class RunEmployee {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new RunEmployee();
    }

    public RunEmployee(){
        Scanner s = new Scanner(System.in);
        Employee employee = new Employee(); 

        System.out.println("Enter name: ");
            employee.setName(s.nextLine());
        System.out.println("Press F for Full Time or P for Part Time");
            char iFP = s.next().charAt(0);
   
        if (iFP == 'F' || iFP == 'f'){
            System.out.println("Enter Monthly Salary:");

            //Create object FTE that can hold input value
                FullTimeEmployee FTE = new FullTimeEmployee(s.nextDouble());
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Monthly Salary: " + FTE.getMonthlySalary());

        }else if (iFP == 'P' || iFP == 'p'){
            
            System.out.println("Enter rate per hour and no. of hours worked seperated by space:");
            System.out.println("Sample: 107.50 13");
            

            //Create object PTE that can hold input value
                PartTimeEmployee PTE = new PartTimeEmployee(s.nextDouble(), s.nextInt());
                 System.out.println("Name: " + employee.getName());
                 System.out.printf("Wage: %.2f\n" , PTE.getWage());
        
        }else{
            System.out.println("Invalid input, try again! ");
        }

    }       
    }
        //Superclass
        class Employee{
            //Set variables
            String name;

            //Create set and get methods
            public void setName(String newName){
                name = newName;
            }
            public String getName(){
                return name;
            }
        }

        //Subclass FullTimeEmployee inherits sublass Employee
        class FullTimeEmployee extends Employee {
            //Set variables
            double monthlySalary = 0;

            Scanner s = new Scanner(System.in);

            //Create Constructor
            FullTimeEmployee(double MonthlySalary){
                setMonthlySalary(MonthlySalary);
            }

            //Create set and get methods
            public void setMonthlySalary(double MonthlySalary){
                monthlySalary = MonthlySalary;
            }
            public double getMonthlySalary(){
                return monthlySalary;
            }
        }

        //Subclass PartTimeEmployee inherits sublass Employee
        class PartTimeEmployee extends Employee{
            //Set variables
            double ratePerHour = 0;
            double hoursWorked = 0;
            double wage = 0;

            Scanner s = new Scanner(System.in);
            //Create class constructor
            PartTimeEmployee(double ratePerHour, double hoursWorked){
                setWage(ratePerHour, hoursWorked);
            }
            //Create set and get methods
            public void setWage(double rPH, double hW){
                wage = rPH * hW;
            }
            public double getWage(){
                return wage;
            }
        }
   