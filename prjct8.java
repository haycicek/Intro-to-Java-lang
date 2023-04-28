/* (Assign grades) Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme:

Grade is A if score is >= best - 10
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.

The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores as whole numbers (i.e. integers), and concludes by displaying the integer scores and the corresponding grades.
Here is a sample run:

Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B 
*/
import java.util.Scanner;
public class AssignGrades {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int student_numbers = scan.nextInt();
		
		System.out.print("Enter "+student_numbers + " scores: ");
		
		int[] scores = new int[student_numbers];
		int best = 0;
		for (int i = 0;i < student_numbers; i++) {
			scores[i] = scan.nextInt();
			if (scores[i] > best) {
				best = scores[i];
			}
			else
				continue;
		}
		for (int i = 0; i < student_numbers ; i++ ) {
			if (scores[i] >= (best - 10)) {
				System.out.println("Student "+ i +" score is "+ scores[i] + " and grade is A");
			}
			else if (scores[i] >= (best - 20)) {
				System.out.println("Student "+ i +" score is "+ scores[i] + " and grade is B");
			}
			else if (scores[i] >= (best - 30)) {
				System.out.println("Student "+ i +" score is "+ scores[i] + " and grade is C");
			}
			else if (scores[i] >= (best - 40)) {
				System.out.println("Student "+ i +" score is "+ scores[i] + " and grade is D");
			}
			else 
				System.out.println("Student "+ i +" score is "+ scores[i] + " and grade is F");
		}
	}
	}