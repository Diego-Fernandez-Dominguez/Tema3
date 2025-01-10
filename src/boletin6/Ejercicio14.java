package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {

		char letras[];

		int veces[];

		char letra = ' ';

		int cont = 0;

		String frase;

		String frase2;

		Scanner esnavidad = new Scanner(System.in);

		System.out.println("Digame la frase");
		frase = esnavidad.nextLine().replace(" ", "");

		frase2 = frase;

		while (!frase2.equals("")) {
			letra = frase2.charAt(0);
			cont++;
			frase2 = frase2.replace(String.valueOf(letra), "");
		}

		letras = new char[cont];
		veces = new int[cont];
		Arrays.fill(veces, 0);
		cont=0;

		frase2 = frase;

		for (int i = 0; i < veces.length; i++) {

			letra = frase2.charAt(0);

			letras[i] = letra;

			while (frase2.length() > cont) {

				if (frase2.charAt(cont) == letra) {
					veces[i] = veces[i] + 1;
				}

				cont++;

			}

			frase2 = frase2.replace(String.valueOf(letra), "");
			cont = 0;

		}
		
		for(int i=0;i<letras.length;i++) {
			System.out.println(letras[i] + ": " + veces[i] + " veces");
		}
		
		esnavidad.close();

	}

}
