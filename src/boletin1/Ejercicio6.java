package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		// Creo la tabla que va a guardar los numeros introducidos por el usuario
		int numeros[] = new int[8];

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
			
			System.out.println(numeros[i]%2==0 ? numeros[i] + " es par" : numeros[i] +" es impar");
		}

		//Cierro el escaner
		sc.close();
	}
}
