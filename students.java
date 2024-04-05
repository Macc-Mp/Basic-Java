package oop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**As
 *
 * @author Moises
 */

import java.util.Arrays;

public class students {
    
    
    //Set Variables
    private String studentName;
    private int prelim, midterm, finals, grade;
    
    public double getGrade() {
        return grade;
    }
    //Initialize Accesors and Mutators
    public String getName(){
        return studentName;
    }
    public void setName(String name){
        this.studentName = name;
    }
    
    public int getPrelim(){
        return prelim;
    }
    public void setPrelim(int prelim){
        this.prelim = prelim;
    }
    
    public int getMidterm(){
        return prelim;
    }
    public void setMidterm(int midterm){
        this.midterm = midterm;
    }
    
    public int getFinals(){
        return finals;
    }
    public void setFinals(int finals){
        this.finals = finals;
    }
     
    //Instantiate objects in the main
    public static void main(String[] args){
        students s1 = new students();
            s1.setName("Angel");
            s1.setPrelim(70);
            s1.setMidterm(90);
            s1.setFinals(85);

        students s2 = new students();
            s2.setName("Joey");
            s2.setPrelim(60);
            s2.setMidterm(85);
            s2.setFinals(90);

        students s3 = new students();
            s3.setName("Katrina");
            s3.setPrelim(79);
            s3.setMidterm(90);
            s3.setFinals(75);

        students s4 = new students();
            s4.setName("Coco");
            s4.setPrelim(75);
            s4.setMidterm(90);
            s4.setFinals(89);

        students s5 = new students();
            s5.setName("Lolit");
            s5.setPrelim(90);
            s5.setMidterm(87);
            s5.setFinals(90);

        //Initialize separate non static obj for getting ave.
        students average = new students();

            //Prints Student Name and term Average.
            double AverageOfAngel = average.AverageGrade(s1.getPrelim(), s1.getMidterm(), s1.getFinals());
                System.out.println("Name: " + s1.getName() + "\nPrelim: " + s1.getPrelim() + "\tMidterm: " + s1.getMidterm() + "\tFinal: " + s1.getFinals() );
                System.out.println("Term Average: " + AverageOfAngel +"\n");

            double AverageOfJoey = average.AverageGrade(s2.getPrelim(), s2.getMidterm(), s2.getFinals());
                System.out.println("Name: " + s2.getName() + "\nPrelim: " + s2.getPrelim() + "\tMidterm: " + s2.getMidterm() + "\tFinal: " + s2.getFinals() );
                System.out.println("Term Average: " + AverageOfJoey +"\n");

            double AverageOfKatrina = average.AverageGrade(s3.getPrelim(), s3.getMidterm(), s3.getFinals());
                System.out.println("Name: " + s3.getName() + "\nPrelim: " + s3.getPrelim() + "\tMidterm: " + s3.getMidterm() + "\tFinal: " + s3.getFinals() );
                System.out.println("Term Average: " + AverageOfKatrina +"\n");

            double AverageOfCoco = average.AverageGrade(s4.getPrelim(), s4.getMidterm(), s4.getFinals());
                System.out.println("Name: " + s4.getName() + "\nPrelim: " + s4.getPrelim() + "\tMidterm: " + s4.getMidterm() + "\tFinal: " + s4.getFinals() );
                System.out.println("Term Average: " + AverageOfCoco +"\n");

            double AverageOfLolit = average.AverageGrade(s5.getPrelim(), s5.getMidterm(), s5.getFinals());
                System.out.println("Name: " + s5.getName() + "\nPrelim: " + s5.getPrelim() + "\tMidterm: " + s5.getMidterm() + "\tFinal: " + s5.getFinals() );
                System.out.println("Term Average: " + AverageOfLolit +"\n");


         
        students sortGrades = new students();
            //String[] names = {s2.getName(), s1.getName(), s3.getName(), s4.getName(), s5.getName()};
            int[] studentGrades = {(int)AverageOfAngel, (int)AverageOfJoey, (int)AverageOfKatrina, (int)AverageOfCoco, (int)AverageOfLolit};
            int[] sortedGrades = sortGrades.identifyHighestToLowest(studentGrades);
            
          

    }
    //Non static method for getting term ave.
    public double AverageGrade(int prelim, int midterms, int finals){
        double average = (prelim * 0.3) + (midterms * 0.3) + (finals * 0.4);
        return average;
    
    }
  
    //Method for sorting grades
    public  int[] identifyHighestToLowest(int[] grades) {
        Arrays.sort(grades);
        System.out.println("\nHighest[1] To Lowest[5]: ");
            
            //
            for(int x = 5-1, y =0; x >= 0; x--, y++){
                System.out.println("");
                System.out.println(  (y+1) + ": "+ grades[x] +", ");              
            }
            
        
        return grades;
}  
    
    
    
}
