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
import java.util.Scanner;

public class Alias {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("CODENAME RECORD");
        OUTER:
         
        do {
            Alias_ArrayList Code;
            ArrayList<Alias_ArrayList> CodeName = new ArrayList<>();
            
                       System.out.println("Enter OPTION?");
            System.out.println("""
                                           Y : ADD CODENAME
                                           N : EXIT PROGRAM
                                           = : CLEARS PREVIOS ARRAYLIST
                                                    """);
            
            char input = s.next().toUpperCase().charAt(0);
            switch (input) {
                
                case 'Y':
                     System.out.print("ENTER HOW MANY: ");
                        int num = s.nextInt();
                     
                     System.out.println("ENTER ALIAS: ");
                        for(int y = 0; y < num; y++ ){
                            CodeName.add(new Alias_ArrayList(s.next(), s.nextInt()));
                        }
               
                        System.out.println("\nAlias list:");
                        for( Alias_ArrayList C1 : CodeName){
                            C1.printList();
                        }   
                        System.out.println("");
                        
                    break;
                    
                case 'N':
                    System.out.println("Program End!");
                    break OUTER;
                    
                case '=':
                    CodeName.clear();
                    System.out.println("ARRAYLIST CLEARED");
                    break;
                    
                default:
                    System.out.println("INPUT ERROR");
                    break;
            }
            
        } while (true);
      
    }
}

    //Can be written to a separate java file
     class Alias_ArrayList {
        String Alias;
        int Code;


        Alias_ArrayList(String A, int C){
        this.Alias = A;
        this.Code = C; 
        }

        // Update function
        public static void updateAliasList(ArrayList<Alias_ArrayList> CodeName, Scanner s) {
        System.out.println("ENTER NEW NAME AND CODE: ");
        CodeName.add(new Alias_ArrayList(s.next(), s.nextInt()));
        System.out.println("List Updated!");

    }

        // Method to print the contents of the list
        public void printList() {
            String line = Alias + ": "+ Code;
                    System.out.println(line);

        }




    }
