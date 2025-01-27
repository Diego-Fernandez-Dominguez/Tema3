package english;

import java.net.ContentHandler;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCounter {
	public static void main(String[] args) {
		// We create a map to storage the words & their values
		TreeMap<String, String> pete = new TreeMap<String, String>();

		// Scanner Objet
		Scanner rd = new Scanner(System.in);

		// Users phrase
		String sentence;

		String words[];

		int counter = 1;

		int found = 0;

		// Ask the user the phrase
		System.out.println("Introduce the first phrase:");
		sentence = rd.nextLine().toLowerCase();

		// Loop until the user types "end"
		while (!sentence.equals("end")) {

			words = sentence.split(" ");

			// Split the sentence in words

			for (int i = 0; i < words.length; i++) {
				
				if(pete.get(words[i]).equals(null)) {
					pete.put(words[i], " " + counter);
				}else {
					//pete.
				}

			}
			counter++;

			// Ask the user the phrase
			System.out.println("Introduce the phrase:");
			sentence = rd.nextLine();
		}
		;
	}
}
