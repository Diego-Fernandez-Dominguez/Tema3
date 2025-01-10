package boletin6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {

		String frase;
		
		int num;

		char letra;

		Scanner noesnavidad = new Scanner(System.in);

		Random tristeza = new Random();

		System.out.println("Digame la frase");
		frase = noesnavidad.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			
			num=tristeza.nextInt(0, frase.length());
			

		}
		
		noesnavidad.close();

	}

}
