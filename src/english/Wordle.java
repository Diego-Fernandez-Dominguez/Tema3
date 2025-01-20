package english;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Wordle {

	static Random rand = new Random();

	static Scanner sc = new Scanner(System.in);

	static String[] words = { "bitch", "drugs", "hello", "dandy", "trick", "treat" };

	static String secretWord;

	public static void main(String[] args) {

		secretWord = words[rand.nextInt(words.length)];

		char[] help = new char[5];

		String guess = "";

		String clue;

		final int ATTEMPTS = 6;

		int cont = 0;

		boolean acertado = false;

		System.out.println(secretWord);

		while (!secretWord.equals(guess) && cont <= 6) {
			System.out.println("Guess");
			guess = sc.nextLine().toLowerCase();

			if (secretWord.equals(guess)) {
				System.out.println("You win");
			} else {
				help = letterFinder(guess);

				System.out.println(Arrays.toString(help));

			}
		}

		if (!secretWord.equals(guess)) {
			System.out.println("You lost");
		}

	}

	static char[] letterFinder(String guess) {

		char[] help = new char[5];

		char letter;

		for (int i = 0; i < guess.length(); i++) {

			letter = guess.charAt(i);

			if (letter == secretWord.charAt(i)) {

				help[i] = letter;

			} else if (secretWord.contains(String.valueOf(letter))) {
				help[i] = '*';
			} else {
				help[i] = '_';
			}

		}

		return help;

	}

}
