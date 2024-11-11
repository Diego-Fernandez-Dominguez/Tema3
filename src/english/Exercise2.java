package english;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		// I create the array
		int sequence[];

		// I create the variable that is going to save the value
		int value;

		// I create the variable that is going to save the increment
		int increment;

		// I create the variable that is going to save the number of values that the
		// user wants
		int numberValues;

		Scanner sc = new Scanner(System.in);

		// I ask the user for how many values do you want to create
		System.out.println("How many values do you want to create?");
		numberValues = sc.nextInt();

		// I put the number of values in the array
		sequence = new int[numberValues];

		// I ask the user for the first value
		System.out.println("Tell me the first value");
		value = sc.nextInt();

		// I ask the user for the increment
		System.out.println("Tell me the increment");
		increment = sc.nextInt();

		for (int i = 0; i < sequence.length; i++) {
			
			//I put the value in the position
			sequence[i] = value;
			
			//I sum the value to the increment
			value += increment;

		}

		// I
		System.out.println(Arrays.toString(sequence));

		// I close the scanner
		sc.close();

	}
}
