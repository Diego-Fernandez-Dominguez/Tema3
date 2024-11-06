package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Creo la tabla que va a guardar los numeros introducidos por el usuario
		double numeros[] = new double[10];

		// Creo la variable que va a guardar la suma de los numeros
		double suma = 0;

		// Creo la variable que va a guardar el numero maximo
		double max = 0;

		// Creo la variable que va a guardar el numero minimo
		double min = 0;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Este for va a ir pidiendo al usuario que introduzca un numero, el cual se va
		// a ir añadiendo a la tabla hasta que i sea del mismo valor que el tamaño de la
		// tabla.
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un numeros");
			numeros[i] = sc.nextInt();
		}

		// Creo una linea vacia para que el programa se vea mas entendible en la consola
		System.out.println();

		// Este for va a ir sacando los numeros introducidos por el usuario a hasta que
		// i sea del mismo tamaño que la tabla
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];

			// Si i==0 significa que es el primer numero, con lo que es el maximo y el
			// minimo a la vez
			if (i == 0) {
				max = numeros[i];
				min = numeros[i];
			}

			// Si el numero es mayor que el maximo, significa que es mayor con lo que se
			// convierte en el nuevo maximo.
			if (numeros[i] > max) {
				max = numeros[i];

				// Si el numero es menor que el minimo, significa que es menor con lo que se
				// convierte en el nuevo minino.
			} else if (numeros[i] < min) {
				min = numeros[i];
			}

		}

		// Saco los resultados por pantalla
		System.out.println("La suma es: " + suma);
		System.out.println("El maximo es: " + max);
		System.out.println("El minimo es: " + min);

		// Cierro el escaner
		sc.close();

	}

}
