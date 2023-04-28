/* Write a program that prompts the user to enter three cities and displays them in ascending order. Here is a sample run:
Enter the first city: Chicago
Enter the second city: Los Angeles
Enter the third city: Atlanta
The three cities in alphabetical order are Atlanta Chicago Los Angeles 
*/
import java.util.Scanner;

public class SortCities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three cities
		System.out.print("Enter the first city:");
		String city1 = input.nextLine();
		System.out.print("Enter the second city:");
		String city2 = input.nextLine();
		System.out.print("Enter the third city:");
		String city3 = input.nextLine();

		String temp;
		if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0))
		{
			temp = city1;
			city1 = city2;
			city2 = temp;	
		}
		else if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0))
		{
			temp = city1;
			city1 = city3;
			city3 = temp;
			
		}
		if (city3.compareTo(city2) < 0)
		{
			temp = city2;
			city2 = city3;
			city3 = temp;
		}

		// Display cities in ascending order
		System.out.println("The three cities in alphabetical order are " +
			city1 + " " + city2 + " " + city3);
	}
}