package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Creo la tabla que se va a rellenar con el valor del usuario
		int tabla[];

		// Creo la variable que va a guardar el tamaño
		int tamaño;

		// Creo la variable que va a guardar el valor
		int valor;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario el tamaño
		System.out.println("Digame un el tamaño: ");
		tamaño = sc.nextInt();

		// Le pido al usuario el valor
		System.out.println("Digame un el valor: ");
		valor = sc.nextInt();

		// Le pongo el tamaño a la tabla
		tabla = new int[tamaño];

		// Lleno la tabla con el valor dado por el usuario
		Arrays.fill(tabla, valor);

		// Saco la tabla por pantalla
		System.out.println(Arrays.toString(tabla));

		// Cierro el escaner
		sc.close();

	}

}
