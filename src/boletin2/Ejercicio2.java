package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Creo las tabla que se va a rellenar con los valores del usuario
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];

		// Creo la variable que va a guardar si las tablas son o no iguales
		boolean igual;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// El usuario introduce los numeros a la tabla 1
		for (int i = 0; i < tabla1.length; i++) {
			System.out.println("Digame un numero de la tabla 1: ");
			tabla1[i] = sc.nextInt();
		}

		// El usuario introduce los numeros a la tabla 2
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println("Digame un numero de la tabla 2: ");
			tabla2[i] = sc.nextInt();
		}

		// Compruebo si las tablas son iguales, si es asi saldra true, si no sera false
		igual = Arrays.equals(tabla1, tabla2);

		// Saco el resultado por pantalla a traves de un ternario
		System.out.println(igual ? "Si son iguales" : "No son iguales");

		// Cierro el escaner
		sc.close();
	}
}
