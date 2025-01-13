package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {

		// Creo el array que va a guardar la palabra dividida
		String sucesion[];

		// Creo el array que va a guardar la palabra dada por el usuario
		String palabra;

		// Creo la variable que va a guardar el numero dado por el usuario
		int num;

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// El usuario introduce la frase
		System.out.println("Digame la palabra");
		palabra = sc.nextLine();

		// El usuario introduce la frase
		System.out.println("Digame el numero");
		num = sc.nextInt();

		// Llamo a la funcion
		sucesion = secuencia(palabra, num);

		// Saco el array por pantalla
		System.out.println(Arrays.toString(sucesion));

		// Cierro el escaner
		sc.close();

	}

	static String[] secuencia(String palabra, int num) {

		// Creo el array que va a guardar la palabra dividida
		String sucesion[];

		// Creo los contadores
		int cont = 0;
		int cont2 = 0;

		// Este while sirve para calcular el tamanyo de la tabla
		while (cont < palabra.length() && cont2 < palabra.length()) {

			// Compruebo si todavia es posible dividir la palabra por el numero dado con el
			// usuario
			if (palabra.length() - cont < num) {

				cont = palabra.length();
				cont2++;

			} else {

				cont = cont + num;
				cont2++;
			}
		}

		// Le doy el tamanyo a la tabla
		sucesion = new String[cont2];

		// Vacio los contadores
		cont = 0;
		cont2 = 0;

		while (cont < palabra.length()) {

			// Compruebo si todavia es posible dividir la palabra por el numero dado con el
			// usuario
			if (palabra.length() - cont < num) {

				sucesion[cont2] = palabra.substring(cont, cont + palabra.length() - cont);
				cont2 = palabra.length();

			} else {
				sucesion[cont2] = palabra.substring(cont, cont + num);
			}

			cont = cont + num;
			cont2++;
		}

		// Devuelvo la tabla
		return sucesion;

	}

}
