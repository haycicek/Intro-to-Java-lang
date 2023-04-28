/*(Palindrome number) Write a program that prompts the user to enter a three-digit
 integer and determines whether it is a palindrome number. A number is a palindrome if it
 reads the same from right to left and fro:rm left to right.
 */
import java.io.*;
import java.util.Scanner;


public class Palindrome {

    public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int threeDigit;
       
        System.out.print("Enter a three-digit integer:");
        threeDigit=input.nextInt();
        if(isPalindrome(threeDigit))
            System.out.println(threeDigit + " is a palindrome");
        else
            System.out.println(threeDigit + " is not a palindrome");
    }

    private static boolean isPalindrome(int threeDigit) {
        int digit100;
		int digit1;

		digit1=threeDigit%10;
		digit100=threeDigit/100;

		if (digit1==digit100)
			return true;
		else
			return false;
    }

}