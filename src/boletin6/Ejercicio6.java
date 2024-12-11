package boletin6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar la frase
		String frase = "";

		// Creo la variable que va a guardar la frase
		boolean esPali;

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame la frase");
		frase = sc.nextLine().toLowerCase();

		// Llamo a la funcion
		esPali = esPalindroma(frase);

		// Saco el resultado por pantalla
		System.out.println(esPali ? "Es palindroma" : "No es palindroma");

		// Cierro el escaner
		sc.close();

	}

	static boolean esPalindroma(String frase) {

		// Creo la variable que va a guardar si la frase es palindroma
		boolean esPali;

		// Creo la variable que va a guardar la frase invertida
		String fraseInver = "";

		// Le quito los espacios a la frase
		frase = frase.replace(" ", "");

		for (int i = frase.length() - 1; i >= 0; i--) {

			// Concateno el caracter a la frase
			fraseInver = fraseInver + frase.charAt(i);

		}

		// Compruebo si las frases son iguales
		if (frase.equals(fraseInver)) {
			esPali = true;
		} else {
			esPali = false;
		}

		return esPali;

	}

}
