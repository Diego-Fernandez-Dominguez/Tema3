package boletin6;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Creo la variable que va a guardar la primera frase
		String frase1;

		// Creo la variable que va a guardar la segunda frase
		String frase2;

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame la primera frase");
		frase1 = sc.nextLine();

		// Le pido la segunda frase al usuario y este la introduce
		System.out.println("Digame la segunda frase");
		frase2 = sc.nextLine();

		// Compruebo si la primera frase es mayor
		if (frase1.length() > frase2.length()) {
			System.out.println("La primera frase es mayor");

			// Compruebo si la segunda frase es mayor
		} else if (frase2.length() > frase1.length()) {
			System.out.println("La segunda frase es mayor");

			// Si llega aqui significa que las dos frases tienen la misma longitud
		} else {
			System.out.println("Las dos frases son iguales");
		}

		// Cierro el escaner
		sc.close();

	}

}
