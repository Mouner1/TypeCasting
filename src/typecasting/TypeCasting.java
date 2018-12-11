/*
Mouner Dabjan
December 11 2018
This program prompts the user to enter a specific values then convert them 
 */

package typecasting;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyBoard = new Scanner(System.in);
        int whole;
        double decimal; 
        char single;
        String name;
        String wholenumber;
        String decimalnumber;
        
        System.out.println("Enter a whole number: ");
        whole = keyBoard.nextInt();
        
        System.out.println("Enter a decimal number: ");
        decimal = keyBoard.nextDouble();
        
        System.out.println("Enter a single character: ");
        single = keyBoard.next().charAt(0); 
            
        System.out.println("Enter a string: ");
        name = keyBoard.next();
        
        System.out.println("Enter a whole number: ");
        wholenumber = keyBoard.next(); 
       
        System.out.println("Enter a decimal number: ");
        decimalnumber = keyBoard.next();
        
        
        System.out.println("The whole integer value you entered is casted to double and is " + (double)whole);
        System.out.println("The decimal value you entered is casted into an integer and is " + (int)decimal);
        System.out.println("The single character that you entered is casted into a string and is " + String.valueOf(single));
        System.out.println("The first letter of your string will be outputted and is " + name.charAt(0));
        System.out.println("The second whole number you entered is " + Integer.parseInt(wholenumber));
        System.out.println("The second decimal number you entered is " + Double.parseDouble(decimalnumber));
        
    }
    
}
