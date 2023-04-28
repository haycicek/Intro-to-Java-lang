/* (Display four patterns using loops) Ask the user to enter an integer to
set a limit for nested loops and generate the following four patterns:

Enter an integer to be a limit of the pattern:6
Pattern A:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

Pattern B:
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

Pattern C:
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1

Pattern D:
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
import java.util.Scanner;
public class LoopPattern {
public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer to be a limit of the pattern:");
	int lim = input.nextInt();
	System.out.println("Pattern A:");
	for(int i=1;i<=lim;i++){
		for(int j=1;j<=i;j++)
			System.out.print(j+" ");
			System.out.println();
	}
	System.out.println();
	System.out.println("Pattern B:");
	
	for(int i=lim; i>=1; i--){
		for(int j=1; j<=i; j++)
			System.out.print(j+" ");
		System.out.println();
	}
	System.out.println();
	System.out.println("Pattern C:");
	for (int i = 1; i <= lim; i++) {

		for (int j  = lim; j >= 1; j--) {
			if (j > i)
				System.out.print("  ");
			else
				System.out.print(j + " ");
		}
	System.out.println();
	}
	System.out.println();
	System.out.println("Pattern D:");
	for (int i = 0; i < lim; i++) {

		for (int j = 1 - i; j <= lim - i; j++) {

			if (j < 1)
				System.out.print("  ");
			else
				System.out.print(j + " ");
}
		System.out.println();
	}
}
}