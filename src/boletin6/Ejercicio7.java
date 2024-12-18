package boletin6;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar la frase
		String frase = "";

		// Creo la variable que va a guardar las palabras
		String palabra = "";

		// Creo la variable que va a guardar el numero de veces que aparece una palabra
		// en la frase
		int cont;

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame una frase");
		frase = sc.nextLine();

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame una palabra");
		palabra = sc.nextLine();

		// Llamo a la funcion
		cont = contPalabras(frase, palabra);

		// Saco el resultado por pantalla
		System.out.println("La palabra " + palabra + " se repite " + cont + "vez/veces");

		// Cierro el escaner
		sc.close();

	}

	static int contPalabras(String frase, String palabra) {

		// Creo la variable que va a guardar el numero de veces que aparece una palabra
		// en la frase
		int cont = 0;

		// Guardo la variable que guarda la posicion de la ultima letra
		int pos;

		// Guardo la variable que guarda la posicion de la primera letra
		int posInicio;

		// Busca la palabra dada en la frase desde la posicion cero y devuelve la
		// posicion de la primera letra de esa misma
		pos = frase.indexOf(palabra, 0);

		// Mientras la posicion sea mayor o igual a 0 se va a repetir el bucle
		while (pos >= 0) {

			// Le sumo 1 al contador
			cont++;

			// Calculo la posicion de la ultima letra de la palabra dada
			posInicio = pos + palabra.length();

			// Busca la palabra dada en la frase desde la ultima posicion guardada y
			// devuelve la  posicion de la primera letra de esa misma
			pos = frase.indexOf(palabra, posInicio);

		}

		// Devuelvo el valor
		return cont;
	}

}
