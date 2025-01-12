package boletin6;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {

		// Creo los arrays con las letrasa que se van a intercambiar entre si
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Creo la variable que va a guardar el caracter
		char c;

		// Creo la variable que va a guardar la frase
		String frase;
		String fraseCod = "";

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame una frase");
		frase = sc.nextLine().toLowerCase();

		for (int i = 0; i < frase.length(); i++) {

			// Cojo el caracte que esta en la posicion i de la frase
			c = frase.charAt(i);

			// Llamo a la funcion codifica
			c = codifica(conjunto1, conjunto2, c);

			// A la frase codificada le pongo el caracter proveniente de la funcion
			fraseCod = fraseCod + c;

		}

		// Saco la frase codificada por pantalla
		System.out.println(fraseCod);

		// Cierro el escaner
		sc.close();

	}

	static char codifica(char conjunto1[], char conjunto2[], char c) {

		// Creo un contador
		int cont = 0;

		// Creo la variable que va a guardar el caracter por el que se va a cambiar
		char c2 = c;

		// Este while reccore los arrays comprobando las posiciones para saber por que
		// caracter cambiarlo
		while (cont < conjunto1.length) {
			if (c == conjunto2[cont]) {
				c2 = conjunto1[cont];
			}
			cont++;
		}

		// Devuelvo el caracter
		return c2;

	}

}
