package boletin6;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Creo la variable que va a guardar la frase
		String frase;

		// Creo la variable que va a guardar la frase invertida
		String fraseInver;

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame la frase");
		frase = sc.nextLine();

		// Llamo a la funcion
		fraseInver = invertirCadena(frase);

		// Saco la frase invertida
		System.out.println(fraseInver);

		// Cierro el escaner
		sc.close();

	}

	static String invertirCadena(String frase) {

		// Creo la variable que va a guardar la frase invertida
		String inver = "";

		for (int i = frase.length() - 1; i >= 0; i--) {

			// Concateno el caracter a la frase
			inver = inver + frase.charAt(i);;

		}

		return inver;

	}

}
