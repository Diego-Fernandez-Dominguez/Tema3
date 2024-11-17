package boletin4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar la longitud
		int longitud;

		// Creo la variable que va a guardar el numero final
		int fin;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Le pido la longitud al usuario
		System.out.println("Introduzca la longitud deseada");
		longitud = sc.nextInt();

		// Le pido el numero final al usuario
		System.out.println("Introduzca el numero final");
		fin = sc.nextInt();

		// Creo la variable tabla y le doy el valor del return de la funcion maximo
		int[] tabla = rellenaPares(longitud, fin);

		// Saco la tabla por pantalla
		System.out.println(Arrays.toString(tabla));

		// Cierro el escaner
		sc.close();

	}

	static int[] rellenaPares(int longitud, int fin) {

		// Creo el randomizador
		Random rand = new Random();

		// Creo la tabla con los valores
		int tabla[] = new int[longitud];

		// Relleno la tabla con los valores aleatorios
		for (int i = 0; i < longitud; i++) {
			tabla[i] = rand.nextInt(2, fin+1);
		}

		// Ordeno la tabla
		Arrays.sort(tabla);

		// Devuelvo la tabla
		return tabla;

	}

}
