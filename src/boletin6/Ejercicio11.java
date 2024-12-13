package boletin6;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {

		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		char c;

		// Creo la variable que va a guardar la frase
		String frase;
		String fraseCod="";

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame una frase");
		frase = sc.nextLine().toLowerCase();

		for (int i = 0; i < frase.length(); i++) {

			c = frase.charAt(i);

			c = codifica(conjunto1, conjunto2, c);
			
			fraseCod=fraseCod+c;

		}
		
		System.out.println(fraseCod);

		// Cierro el escaner
		sc.close();

	}

	static char codifica(char conjunto1[], char conjunto2[], char c) {

		int cont=0;
		
		char c2=c;
		
		while(cont<conjunto1.length) {

			if(c==conjunto1[cont]) {
				c2=conjunto2[cont];
				
				
			}
			cont++;

			}
			
		

		return c2;

	}

}
