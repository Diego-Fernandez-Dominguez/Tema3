package boletin6;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar la frase
		String frase = "";

		// Creo la variable que va a guardar las palabras
		String palabra = "";

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame una palabra");
		palabra = sc.nextLine();

		// Mientras que la palabra sea distinta a fin va a repetir el bucle
		while (!palabra.equalsIgnoreCase("fin")) {

			// La frase es igual a la frase mas la palabra mas un espacio
			frase = frase + palabra + " ";

			// Le pido la primera frase al usuario y este la introduce
			System.out.println("Digame una palabra");
			palabra = sc.nextLine();
		}

		// Saco la frase por pantalla
		System.out.println(frase);

		// Cierro el escaner
		sc.close();

	}

}
