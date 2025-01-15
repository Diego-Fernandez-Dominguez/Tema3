package boletin7;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio9 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//
		TreeMap<Integer, Integer> numeros = new TreeMap<Integer, Integer>();

		TreeMap<Integer, Integer> estrellas = new TreeMap<Integer, Integer>();

		int numero = 0;

		System.out.println("Digame los primeros cinco numeros");
		comprobarNum(numeros, 5);

		System.out.println("Digame las dos estrellas");
		comprobarNum(estrellas, 2);

		System.out.println("Compruebe numeros, introduzca un negativo para salirte");
		numero = sc.nextInt();

		while (numero > 0) {

			System.out.println(numeros.get(numero));

			System.out.println("Compruebe numeros, introduzca un negativo para salirte");
			numero = sc.nextInt();

		}

		sc.close();

	}

	static void comprobarNum(TreeMap<Integer, Integer> numeros, int repeticion) {

		int num;

		int valor;

		for (int i = 0; i < repeticion; i++) {

			num = sc.nextInt();

			if (numeros.containsKey(num)) {

				valor = numeros.get(num);

				numeros.replace(num, valor, valor + 1);

			} else {

				numeros.put(num, 1);

			}

		}

	}

}
