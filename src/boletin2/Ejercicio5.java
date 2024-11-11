package boletin2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Creo el array que va a guardar los numeros aleatorios
		int tabla[] = new int[1000];

		// Creo la variable que va a guardar el numero que va a buscar el usuario
		int numero;

		// Creo la variable que va a guardar el total de veces que aparece un numero
		int cont = 0;

		// Creo el randomizador
		Random rand = new Random();

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Guardo numeros aleatorios en el array
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = rand.nextInt(0, 100);
		}

		// Le pido al usuario que me introduzca un numero
		System.out.println("Dime un numero");
		numero = sc.nextInt();

		// Cuento las veces que aparece el numero en el array
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == numero) {
				cont++;
			}
		}

		// Si el contador es mayor que cero, significa que el numero apaarece en el
		// array
		if (cont > 0) {
			System.out.println("El numero se encuentra un total de " + cont + " veces");

			// Si llega aqui significa que el numero no aparece en el array
		} else {
			System.out.println("El numero no se encuentra en el array");
		}

		// Cierro el escaner
		sc.close();

	}

}