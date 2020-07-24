import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals Lab 3 Exercise 3
		// Brent Harshbarger

		// -------------------------------------------------------------------------------------------------
		// This program will read a string typed by a user and then determines the
		// number of each
		// lower case vowel (a, e, i, o, u) is in the given string.
		// -------------------------------------------------------------------------------------------------

		String phrase;
		int acount = 0, ecount = 0, icount = 0, ocount = 0, ucount = 0, noncount;

		Scanner scan = new Scanner(System.in);

		System.out.print("Please type a phrase: ");
		phrase = scan.nextLine();

		noncount = phrase.length();

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == 'a') {
				acount++;

			}

		}

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == 'e') {
				ecount++;

			}
		}

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == 'i') {
				icount++;

			}
		}

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == 'o') {
				ocount++;

			}
		}

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == 'u') {
				ucount++;

			}

		}

		int totalVowels = acount + ecount + icount + ocount + ucount;
		int nonVowels = noncount - totalVowels;

		System.out.print("Your phrase had a length of " + noncount + " characters and spaces, " + acount + " a's,  "
				+ ecount + " e's, ");
		System.out.print(+icount + " i's,  " + ocount + " o's,  " + ucount + " u's, ");
		System.out.print("leaving " + nonVowels + " character and spaces.");

		scan.close();

	}

}
