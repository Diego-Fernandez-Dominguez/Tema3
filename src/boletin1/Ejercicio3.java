package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Creo la tabla que va a guardar los numeros introducidos por el usuario
		int numeros[] = new int[10];

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

		// Este for va a ir sacanado los numeros introducidos por el usuario al reves,
		// el primero introducido es el ultimo
		for (int i = 9; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

		// Cierro el escaner
		sc.close();
	}

}
