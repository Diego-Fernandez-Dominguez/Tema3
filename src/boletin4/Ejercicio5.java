package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Creo la tabla
		int t[] = { 1, 2, 3, 4, 1, 2, 3, 4 };

		// Creo la variable que va a guardar el numero que quiere buscar el usuario
		int buscar;

		// Creo el escaner para leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario el numero que quiere buscar, y este lo introduce
		System.out.println("Introduzca el numero que quiere buscar");
		buscar = sc.nextInt();

		// Creo la variable tabla y le doy el valor del return de la funcion maximo
		int indices[] = buscarTodos(t, buscar);

		// Saco los indices por pantalla
		System.out.println(Arrays.toString(indices));

		// Cierro el escaner
		sc.close();

	}

	static int[] buscarTodos(int t[], int buscar) {

		// Creo la tabla que va a guardar los indices
		int t2[];

		// Creo el contador que va a contar el tamaño del array y va a indicar el indice
		// de la segunda tabla
		int cont = 0;

		// Compruebo el tamaño que va a tener la tabla 2
		for (int valor1 : t) {
			if (valor1 == buscar) {
				cont++;
			}
		}

		// Le doy el tamaño a esta
		t2 = new int[cont];

		// Si el contador es 0, significa que el numero que se busca no esta, con lo que
		// esta parte no haria falta hacerla
		if (cont > 0) {
			// Cambio el contador a 0
			cont = 0;

			// Relleno la tabla con los indices del numero que el usuario busca
			for (int i = 0; i < t.length; i++) {
				if (t[i] == buscar) {
					t2[cont] = i;
					cont++;
				}
			}
		}

		// Devuelvo la tabla 2
		return t2;

	}

}
