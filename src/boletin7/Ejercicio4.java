package boletin7;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio4 {

	static Random aleatoritos = new Random();

	public static void main(String[] args) {

		TreeSet<Integer> numeros = new TreeSet<Integer>();

		for (int i = 0; i < 21; i++) {

			numeros.add(aleatoritos.nextInt(0, 10));

		}
		
		for(int num:numeros) {
			
			System.out.print(num + " ");
			
		}

	}

}
