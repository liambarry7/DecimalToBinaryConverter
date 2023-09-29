package binarycalculator;
import java.util.*;

public class BinaryCalculator {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] conversion = new int[8];

        
        System.out.println("Enter Denary number");
        int userNumber = input.nextInt();
        
        for (int i = 0; i < 8; i++) {
            int binaryNumber = userNumber % 2;
            //System.out.println(binaryNumber);
            userNumber = userNumber / 2;
            conversion[i] = binaryNumber;
        }
        
        
        for (int i = 7; i >= 0; i--) {
            System.out.print(conversion[i]);
        }
        
    }
    
}

