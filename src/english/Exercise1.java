package english;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {

		// I create the array that is goint to collect the numbers
		int numbers[] = new int[10];

		// I create the variable that is going to save the position that the user chooses
		int position;

		// I create the variable that is going to save the option that the user chooses
		String option;

		// I create the scanner
		Scanner sc = new Scanner(System.in);

		// While the option is different than c, this program is goint to repeat itself
		do {

			// I put the menu on screen
			System.out.println("a. Show values.");
			System.out.println("b. Introduce a value.");
			System.out.println("c. Exit");

			System.out.println("Introduce an option");
			option = sc.next();
			System.out.println();

			switch (option.toLowerCase()) {

			// Put the array on screen
			case "a" -> {
				System.out.println(Arrays.toString(numbers));
			}

			// I ask the user for the position
			case "b" -> {
				System.out.println("Introduce the position");
				position = sc.nextInt();

				// I ask the user for the value
				System.out.println("Introduce the value");
				numbers[position] = sc.nextInt();
			}

			// The user wants to get out of the program
			case "c" -> {
				System.out.println("Exiting the program");
			}

			// The option is not correct
			default -> {
				System.out.println("Incorrect Option");
			}
			}

		} while (!option.equalsIgnoreCase("c"));

		// Close the scanner
		sc.close();

	}

}
