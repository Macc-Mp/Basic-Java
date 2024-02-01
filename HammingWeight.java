/**
 *
 * @author Moises
 */
public class HammingWeight {

    /**
     * @param args the command line arguments
     */    
        public static void main(String[] args) {    
        //Example of binary to count
        int weight = hammingWeight(01010101);
            System.out.println("1 Bits Present: " + weight);
        }

        public static int hammingWeight(int n) {
        //the will hold n as 1
        int counter = 0;
        while (n != 0) {
            counter += n & 1; // Check the least significant bit
            n >>= 1;      // Right shift to examine the next bit
            
            //>>>: Converts to positive (or zero) by filling with 0s.
            //>>: Preserves sign by filling with the original sign bit.
        }
        return counter;
    }

}
