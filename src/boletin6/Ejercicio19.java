package boletin6;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {

		// Variable que va a guardar la frase dada por el usuario
		String frase;

		// Variable que va a guardar la frase con la nomenclatura camel
		String fraseCamel;

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// El usuario introduce la frase
		System.out.println("Digame la frase");
		frase = sc.nextLine();

		// Llamo a la funcion
		fraseCamel = nomenclaturaCamel(frase);

		//Saco la frase con nomenclatura camel por pantalla
		System.out.println(fraseCamel);

		// Cierro el escaner
		sc.close();

	}

	static String nomenclaturaCamel(String frase) {

		// Creo un array dividiendo las palabras con el separador " "
		String[] palabras = frase.toLowerCase().split(" ");

		// Variable que va a guardar la frase con la nomenclatura camel
		String fraseCamel = "";

		// Creo la variable que va a guardar la letra que se va a poner en mayusculas
		char letra;

		for (int i = 0; i < palabras.length; i++) {

			// Guardo la primera letra de la palabra
			letra = palabras[i].charAt(0);

			// Pongo la letra en mayusculas y lo concateno con el resto de la palabra
			palabras[i] = Character.toUpperCase(letra) + palabras[i].substring(1);

		}

		// Concateno la frase completa
		for (int i = 0; i < palabras.length; i++) {

			fraseCamel += palabras[i];

		}

		// Devuelvo la frase
		return fraseCamel;

	}

}
