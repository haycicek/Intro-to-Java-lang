/*Write the bin2Dec(String binaryString) method to convert a binary string into a decimal number (your method should return an integer). Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.

Test your method in a program that prompts the user to input a binary string and uses your bin2Dec method to print out the decimal equivalent of that string. If the method throws an error, have your program catch it and print "Not a binary string." before terminating. */
import java.util.*;

public class  NumberFormat 

{

 

   public static int bin2Dec(String binaryString) throws NumberFormatException 

   {

       int t = 0,i;

       for(i = 0; i < binaryString.length(); ++i)

       {

           if(binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1')

           {

               throw new NumberFormatException();

           }

           t += Math.pow(2, binaryString.length() - i - 1) * (binaryString.charAt(i) - '0');

       }

       return t;

   }

   public static void main(String[] a) 

   {

       Scanner inxv = new Scanner(System.in);

       System.out.print("Enter a binary string:");

       String str = inxv.nextLine();

       try

       {

           System.out.println(bin2Dec(str));

       }  

       catch (NumberFormatException e)

       {

           System.out.println("Not a binary string.");

       }

   }

}