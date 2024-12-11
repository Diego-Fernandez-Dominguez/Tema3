package boletin6;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Creo la variable que va a guardar la frase
		String frase = "";

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame una frase");
		frase = sc.nextLine();

		// Cierro el escaner
		sc.close();
	}

}
