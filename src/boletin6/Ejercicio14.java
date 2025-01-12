package boletin6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {

		// Creo el array que va a guardar los caracteres de la frase
		char letras[];

		// Creo el array que va a guardar las veces que se repiten los caracteres de la
		// frase
		int veces[];

		// Creo la variable que va a guardar la letra
		char letra = ' ';

		// Creo un contador
		int cont = 0;

		// Creo la variable que va a guardar la frase
		String frase;

		// Creo la variable que va a guardar una copia de la frase para poder
		// modificarla sin perder la original
		String frase2;

		// Creo el escaner
		Scanner esnavidad = new Scanner(System.in);

		// Le pido la frase al usuaroi y este la introduce
		System.out.println("Digame la frase");
		frase = esnavidad.nextLine().replace(" ", "");

		// Copio la frase original a la frase 2
		frase2 = frase;

		// Este while sirve para comprobar cuantas letras distintas tiene la frase, para
		// poder ponerle un tamaño a los dos arrays creados anteriormente
		while (!frase2.equals("")) {
			letra = frase2.charAt(0);
			cont++;
			frase2 = frase2.replace(String.valueOf(letra), "");
		}

		// Le pongo el tamaño a los dos arrays
		letras = new char[cont];
		veces = new int[cont];

		// Lleno el array de "veces" de ceros
		Arrays.fill(veces, 0);

		// Pongo el contador a 0
		cont = 0;

		// Copio la frase original a la frase 2
		frase2 = frase;

		for (int i = 0; i < veces.length; i++) {

			// Saco el primer caracter de la frase
			letra = frase2.charAt(0);

			// Lo coloco en la posicion i del array que guarda las letras
			letras[i] = letra;

			// Este while recorre la frase comprobando si la letra que esta en la posicion
			// del contador es la misma que hemos recogido anteriormente, si es asi le suma
			// uno al numero correspondiente en el array de veces
			while (frase2.length() > cont) {

				if (frase2.charAt(cont) == letra) {
					veces[i] = veces[i] + 1;
				}

				cont++;

			}

			// Remplazo el caracter ya comprobado por vacio para que no se repita
			frase2 = frase2.replace(String.valueOf(letra), "");

			// Pongo el contador a 0
			cont = 0;

		}

		// Saco el resultado por pantalla
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i] + ": " + veces[i] + " veces");
		}

		// Vacio el contador
		esnavidad.close();

	}

}
