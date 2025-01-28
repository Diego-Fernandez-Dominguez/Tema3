package boletin8;

import java.util.HashMap;

public class Ejercicio3 {

	static String frase = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, "
			+ "con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada "
			+ "en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

	public static void main(String[] args) {

		HashMap<Character, Integer> apariciones = new HashMap<Character, Integer>();

		char caracter = ' ';
		
		int valor = 0;

		for (int i = 0; i < frase.length(); i++) {

			caracter = frase.toLowerCase().charAt(i);

			if (Character.isLetter(caracter)) {

				if (apariciones.containsKey(caracter)) {
					
					valor=apariciones.get(caracter);

					apariciones.replace(caracter, valor+1);

				} else {
					apariciones.put(caracter, valor+1);
				}

			}

		}

		System.out.println(apariciones);

	}

}
