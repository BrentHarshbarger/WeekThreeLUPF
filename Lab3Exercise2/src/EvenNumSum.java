import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		// Lewis University - Prorgramming Fundamentals - Lab 3 Exercise 2
		// Brent Harshbarger

		// ----------------------------------------------------------------------------------------------------------------
		// This program ask the user to select a number 2 or above. The program then
		// identifies all the even numbers
		// in the range between 2 and the selected number and then sums all of the even
		// numbers in the selected range.
		// ----------------------------------------------------------------------------------------------------------------

		int number;
		int evenSum;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number 2 or greater: ");
		number = scan.nextInt();

		while (number < 2) {
			System.out.print("ERROR - Your number is less than 2, please try again: ");
			number = scan.nextInt();

		}

		evenSum = calcEvenAndSum(number);

		System.out.println("The sum of the even numbers between 2 and " + number + " is " + evenSum + ".");

		scan.close();

	}

	public static int calcEvenAndSum(int num) {
		int i, sum = 0;
		for (i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

		}
		return sum;
	}

}