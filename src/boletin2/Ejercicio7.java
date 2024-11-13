package boletin2;

import java.util.Arrays;

public class Ejercicio7 {
	public static void main(String[] args) {

	// Creo la tabla que va a guardar los numeros
		int tabla[];
		// Creo la variable que va a guardar el tamaño que va a tener la tabla
		int tamaño = 0;

		// Calculo el tamaño necesario que va a tener la tabla
		for (int i = 1; i <= 10; i++) {
			tamaño += i;
		}
		
		// Le adjudico el tamaño necesario a la tabla
		tabla = new int[tamaño];
		
		// Relleno la tabla con los numeros, los cuales se repiten el mismo numero de
		// veces que su valor
		for (int i = 1, j = 0; i <= 10; i++) {
			Arrays.fill(tabla, j, j + i, i);
			j += i;
		}
		// Saco la tabla por pantalla
		System.out.println(Arrays.toString(tabla));	
	}
}
