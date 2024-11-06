package boletin1;

import java.util.Random;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Creo la tabla que va a almacenar los numeros aleatorios
		int numeros[] = new int[10];

		// Creamos la utilidad random para generar los numeros aleatorios
		Random rand = new Random();

		// Este for va a ir rellenando cada espacio de la tabla con un numero aleatorio,
		// hasta que i sea del mismo valor que el tamaño de la tabla
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(1, 101);
		}

		// Saco por pantalla la tabla completa
		for (int valor : numeros) {
			System.out.println(valor);
		}
	}
}
