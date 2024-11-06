package boletin1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Creo la tabla que va a almacenart los numeros introducidos por el usuario
		double numeros[] = new double[5];
		
		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Este for va a ir pidiendo al usuario que introduzca un numero, el cual se va
		// a ir añadiendo a la tabla hasta que i sea del mismo valor que el tamaño de la
		// tabla.
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digame un numero");
			numeros[i] = sc.nextInt();
		}

		// Creo una linea vacia para que el programa se vea mas entendible en la consola
		System.out.println();

		// Saco por pantalla la tabla completa
		for (double valor : numeros) {
			System.out.println(valor);
		}

		// Cierro el escaner
		sc.close();
	}

}
