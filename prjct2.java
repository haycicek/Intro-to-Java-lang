/*Chapter 2 Exercise 3

Going METRIC.

(Convert feet into meters) Write a program that reads a number in feet, converts it to meters, and displays the result. One foot is 0.305 meters.

INPUT and PROMPTS.The program prompts for the feet with the message "Enter a value for feet: ".

OUTPUT. The output is of the form "x feet is y meters" where x is the number read in and y is the number of meters computed by the program.

CLASS NAMES. Your program class should be called FeetToMeters
*/
public class FeetToMeters{
	public static void main(String[]args){
		java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.print("Enter a value for feet: ");
		double feet =input.nextDouble();
		double meter=feet*0.305;
		System.out.println(feet+" feet is "+meter+" meters");
	}
}