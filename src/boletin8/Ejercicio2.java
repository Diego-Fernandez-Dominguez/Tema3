package boletin8;

import java.util.HashSet;
import java.util.Random;

public class Ejercicio2 {
	public static void main(String[] args) {

		HashSet<Integer> numeros = new HashSet<Integer>();

		int numero;
		
		Random rand = new Random();
		
		for (int i = 0; i < 11; i++) {

			numero = rand.nextInt(0, 21);
			
			while(!numeros.add(numero)) {
				
				numero = rand.nextInt(0, 21);
				
			}
			
			numeros.add(numero);

		}
		
		System.out.println(numeros);

	}

}
