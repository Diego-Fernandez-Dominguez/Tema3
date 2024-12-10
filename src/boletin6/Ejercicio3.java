package boletin6;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Creo la variable que va a guardar la frase
		String frase;
		
		int numEspacios;

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame la frase");
		frase = sc.nextLine();
		
		numEspacios=comprobarEspacios(frase);
		
		// Cierro el escaner
		sc.close();

	}
	
	static int comprobarEspacios(String frase) {
		
		return 0;
		
	}

}
