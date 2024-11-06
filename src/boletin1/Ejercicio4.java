package boletin1;

public class Ejercicio4 {
	public static void main(String[] args) {

		//
		// Los valores que no inicializamos, se ponen en 0 de forma predeterminada
		//

		// Creo la tabla que va a guardar los numeros que definamos
		int num[] = new int[12];

		// Defino el valor de las casillas de la tabla poniendoles un numero
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// Saco por pantalla la tabla completa
		for (int valor : num) {
			System.out.println(valor);
		}

	}

}
