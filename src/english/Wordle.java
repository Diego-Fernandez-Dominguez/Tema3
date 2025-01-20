package english;

import java.util.Random;
import java.util.Scanner;

public class Wordle {

	static Random rand = new Random();

	static Scanner sc = new Scanner(System.in);

	static String[] words = { "bitch", "drugs", "hello", "dandy", "trick", "treat" };

	static String secretWord;

	public static void main(String[] args) {

		secretWord = words[rand.nextInt(words.length)];

		char[] guessArray;

		String guess;

		String clue;

		int ATTEMPTS = 6;

		System.out.println(secretWord);

		System.out.println("Guess");
		guess = sc.nextLine();

		guessArray = guess.toCharArray();

		for (int i = 0; i < guessArray.length; i++) {
	/*		if (secretWord.contains(guessArray[i])) {

			}*/
		}
	}
}
