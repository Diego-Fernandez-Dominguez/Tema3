package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar las palabras
		String palabras[];
		
		// Creo la variable que va a guardar la frase
		String frase = "";

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame la frase");
		frase = sc.nextLine().toLowerCase();

		// Divido las palabras a traves del separador " "
		palabras = frase.split(" ");

		// Ordeno la tabla alfabeticamente
		Arrays.sort(palabras);

		//Saco la tabla por pantalla
		System.out.println(Arrays.toString(palabras));
		
		//Cierro el escaner
		sc.close();

	}

}
