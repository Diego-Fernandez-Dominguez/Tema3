package boletin7;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio9 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creo la coleccion que va a guardar los numeros
		TreeMap<Integer, Integer> numeros = new TreeMap<Integer, Integer>();

		// Creo la coleccion que va a guardar las estrellas
		TreeMap<Integer, Integer> estrellas = new TreeMap<Integer, Integer>();

		// Creo la variable que va a guardar el numero dado por el usuario
		int numero = 0;

		// Le pido al usuario los datos
		System.out.println("Digame los primeros cinco numeros");
		comprobarNum(numeros, 5);

		System.out.println("Digame las dos estrellas");
		comprobarNum(estrellas, 2);

		System.out.println("Compruebe numeros, introduzca un negativo para salirte");
		numero = sc.nextInt();

		// Mientras el numero sea mayo que cero
		while (numero > 0) {

			// Añado los numeros a la coleccion
			System.out.println(numeros.get(numero));

			// Le pido al usuario los datos
			System.out.println("Compruebe numeros, introduzca un negativo para salirte");
			numero = sc.nextInt();

		}

		// Cierro el escaner
		sc.close();

	}

	static void comprobarNum(TreeMap<Integer, Integer> numeros, int repeticion) {

		// Creo la variable que va a guardar el numero dado por el usuario
		int num;

		// Creo la variable que va a guardar el valor
		int valor;

		// Mientras que i sea menor a repeticion se va a ejecutar el siguiente for
		for (int i = 0; i < repeticion; i++) {

			// El usuario introduce el usuario
			num = sc.nextInt();

			// Si el numero esta como clave en la tabla numero le da el valor a numero
			if (numeros.containsKey(num)) {

				valor = numeros.get(num);

				numeros.replace(num, valor, valor + 1);

				// Si no esta lo mete en la lista
			} else {

				numeros.put(num, 1);

			}

		}

	}

}
