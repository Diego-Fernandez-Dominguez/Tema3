package boletin1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		// Creo la tabla que va a guardar los numeros introducidos por el usuario
		int numeros[] = new int[12];

		// Creo la tabla meses para poder imprimir los meses por pantalla
		String meses[] = new String[12];

		// Le doy el valor de los meses a la tabla meses
		meses[0] = "Enero";
		meses[1] = "Febrero";
		meses[2] = "Marzo";
		meses[3] = "Abril";
		meses[4] = "Mayo";
		meses[5] = "Junio";
		meses[6] = "Julio";
		meses[7] = "Agosto";
		meses[8] = "Septiembre";
		meses[9] = "Octubre";
		meses[10] = "Noviembre";
		meses[11] = "Diciembre";

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Este for va a ir pidiendo al usuario que introduzca un numero, el cual se va
		// a ir añadiendo a la tabla hasta que i sea del mismo valor que el tamaño de la
		// tabla.
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca un numeros");
			numeros[i] = sc.nextInt();
		}

		// Este for va a realizar lo siguiente hasta que el tamaño de la tabla numeros
		// sea menor que linea
		for (int linea = 0; linea < numeros.length; linea++) {
			System.out.println();

			// Imprimo por pantalla el mes correspondiente al numero de linea
			System.out.print(meses[linea] + ": ");

			// Es for va a colocar los guiones dependiendo del numero que se haya
			// introducido en la tabla numeros
			for (int barra = 1; barra <= numeros[linea]; barra++) {
				System.out.print("-");
			}
		}

		// Cierro el escaner
		sc.close();
	}

}
