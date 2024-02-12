/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author Moises
 */
import java.util.ArrayList;
public class NameList {
    public static void main(String[] args) {
        
        //Name is a wrapper class that can hold multiple datatype if required
        Name A;
        
        ArrayList<Name> Student = new ArrayList<>();
            Student.add( new Name("Moises", 20) );
            Student.add(new Name("Mac", 18));
            Student.add(new Name ("Mark", 16));
            

//To call a certain index and call a method if it is existing            
//            Student.get(0).introduce();

//.remove deletes specified index, which is replaced by the next index
//            Student.remove(0);  

            
            System.out.println("ForEach Loop");
            for(Name s1 : Student ){
                s1.introduce();
            }
            
            System.out.println("\n ForLoop: ");
            for(int x = 0; x<Student.size(); x++){
                Student.get(x).introduce();
            
            }
        
    }
}
