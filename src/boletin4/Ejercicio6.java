package boletin4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		// Creo la tabla
		int t[] = { 10, 1, 5, 8, 9, 2 };

		// Llamo a la funcion pedirDatos para pedir los datos
		int numElementos = pedirDatos("numero de elementos");

		// Llamo a la funcion suma con la tabla con los numeros y el numero de elementos
		int sumas[] = suma(t, numElementos);

		// Saco las sumas por pantalla
		System.out.println(Arrays.toString(sumas));

	}

	static int[] suma(int t[], int numElementos) {

		// Creo la tabla que va a guardar las sumas con el tamaño correspondiente
		int[] t2 = new int[t.length-numElementos+1];

		// De la misma forma que hemos calculado el tamaño, calculamos la suma de los
		// numeros
		for (int i = 0; i < t2.length; i++) {
				for (int j = i; j < i + numElementos; j++) {
					t2[i] = t2[i] + t[j];
				}
			
		}

		// Devuelvo la tabla 2
		return t2;
	}
	
	static int pedirDatos(String datos) {

		// Creo la variable que va a guardar si ha dado un error o no
		boolean error = true;

		// Creo la variable que va a guardar el numero dado por el usuario
		int num = 0;

		// Creo el escaner para leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("Digame el " + datos);
				num = sc.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.err.println("El numero debe ser un entero");
				sc.nextLine();
				error = true;
			}

		} while (error);

		// Cierro el escaner
		sc.close();

		// Devuelvo el numero
		return num;

	}

}