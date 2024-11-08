package boletin1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		// Creo la tabla que va a guardar los enteros aleatorios
		int numeros[] = new int[100];

		// Creo la variable que va a guardar el numero que se va a buscar en la tabla
		int numEleccion;

		// Creo el generador de numeros aleatorios
		Random rand = new Random();

		// Creo el escaner que va a pertmitir leer lo que pone el usuario por pantalla
		Scanner sc = new Scanner(System.in);

		// Le pongo numeros aleatorios a la tabla
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(1, 11);
		}

		// Pido al usuario un numero
		System.out.println("Digame un numero: ");
		numEleccion = sc.nextInt();

		// Compruebo si el numero elegido por el usuario esta en la posicion i, si es
		// asi la saca por pantalla seguida de una coma
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numEleccion) {
				System.out.print(i + ", ");
				;
			}
		}

		// Cierro el escaner
		sc.close();

	}

}
