package boletin3;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Creo el array con el tamaño indicado
		int tabla[][] = new int[4][5];

		// Creo la variable que va a guardar la suma de los numeros
		int suma = 0;

		// Creo la variable que va a guardar la suma de la columna
		int sumaTotal = 0;

		// Creo el randomizador
		Random rand = new Random();

		// Relleno la tabla con numeros aleatorios
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				tabla[fila][columna] = rand.nextInt(100, 1000);
			}
		}

		// Hago la suma de las filas y las saco por pantalla
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				suma += tabla[fila][columna];
			}
			System.out.println(Arrays.toString(tabla[fila]) + " " + suma);
			suma = 0;
		}

		// Hago la suma de las columnas y las saco por pantalla
		for (int columna = 0; columna < tabla[0].length; columna++) {
			suma = 0;
			for (int fila = 0; fila < tabla.length; fila++) {
				suma += tabla[fila][columna];
				sumaTotal = sumaTotal + suma;
			}

			// Saco la suma de la columna seguida de un espacio, para que no se choquen los
			// numeros
			System.out.print(suma + " ");
		}

		// Saco la suma total por pantalla
		System.out.print(sumaTotal);

	}

}
