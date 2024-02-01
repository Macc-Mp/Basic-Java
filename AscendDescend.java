/**
 *
 * @author Moises
 */

public class Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
              do{
            System.out.print("Enter How Many Numbers To Arrange: ");
            int amount = s.nextInt();
            
            int [] arrange = new int [amount];
            
            for(int x = 0; x < arrange.length; x++){
                System.out.print("Enter Number " + (x+1) +": ");
                arrange[x] = s.nextInt();
               
            }
            
            //Sort Ascending
            Arrays.sort(arrange);
            System.out.print("Ascending: ");
            for(int y = 0; y < arrange.length; y++){
                System.out.print( arrange[y] +", ");
                
                
            }
            System.out.println("Ascending Done");
            
            //Sort Descending
            Arrays.sort(arrange);
            System.out.print("Descending");
            for(int z = arrange.length -1; z >= 0; z--){
                System.out.print( arrange[z] + ", ");
                
                
            }
            System.out.print("Descending Done");
            
            
                System.out.println("\nRetry? Y/N");
                     char r =s.next().toUpperCase().charAt(0);
                if(r=='Y'){
                    continue;
                }else if(r=='N'){
                    System.out.println("Thank You!");
                    break;
                }else{
                    System.out.println("Error");
                     
                  }     break;
        }while(true);
         
//        }
    }
    
}
