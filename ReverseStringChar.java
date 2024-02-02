public class reverse{
  public static void main(String[] args){
       Scanner s = new Scanner(System.in);
        
        System.out.println("Simpler way to reverse: ");
    char[] name = {'M', 'O', 'I', 'S', 'E', 'S'}; 
    
        System.out.println("Array Size: "+name.length);
        //Checks char lenght
        
            //Loop for original
            System.out.println("Name: ");
                for(int i = 0; i< name.length; i++){
                    System.out.print(name[i] +", ");
                }
            //Loop for reversed
            System.out.println("\nReversed Name: ");
            for(int x = name.length-1; x>=0; x--){
                System.out.print(name[x]+ ", ");
            }
           
            
        //Another way to reverse characters;
        System.out.println(" ");
        StringBuilder reversedName = new StringBuilder();

            for (char ch : name) {
                reversedName.insert(0, ch); // Insert at the beginning
            }

            System.out.println("\nReversed name: " + reversedName);

        
        char[] reversedName2 = new String(name).toCharArray(); // Create a String and convert back to char array
        System.out.print("Reversed name: ");
        for (char ch : reversedName2) {
            System.out.print(ch);
        }
        System.out.println("");
        
        
        System.out.println("\nEasiest way to reverse: ");
        
        String myString = "World";
            char[] charArray = myString.toCharArray();
            
            System.out.print("String: ");
                for(int x = 0; x< charArray.length; x++){
                    System.out.print( charArray[x]);
                }
            System.out.println(" ");
            
            System.out.print("Reversed String: ");
                for (int x = charArray.length-1; x>= 0; x-- ){
                    System.out.print( charArray[x]);

                }
            System.out.println(" ");

 
  }
}
