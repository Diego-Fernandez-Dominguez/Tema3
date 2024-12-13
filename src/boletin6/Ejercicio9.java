package boletin6;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Creo la variable que va a guardar la frase
		String frase;

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Le pido la primera frase al usuario y este la introduce
		System.out.println("Digame una frase");
		frase = sc.nextLine();

		if (frase.startsWith("Javalín, javalón") && frase.endsWith("javalén, len, len") ){
			
			System.out.println("No esta hablando en Javalandia");

		} else if (frase.startsWith("Javalín, javalón")) {
			System.out.println("Esta hablando en el primer dialecto de Javalandia");

			// Te traduce la frase
			frase = frase.substring(17);

			// Le quito los espacios
			frase = frase.trim();

			// Saco la frase por pantalla
			System.out.println(frase);

		} else if (frase.endsWith("javalén, len, len")) {
			System.out.println("Esta hablando en el segundo dialecto de Javalandia");

			// Te traduce la frase
			frase = frase.substring(0, frase.length() - 17);

			// Le quito los espacios
			frase = frase.trim();

			// Saco la frase por pantalla
			System.out.println(frase);

		} else {
			System.out.println("No esta hablando en Javalandia");
		}

		// Cierro el escaner
		sc.close();
	}

}
