package boletin3;

import java.util.Arrays;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Creo la tabla que va a guardar los numeros en 3 filas y 6 columnas
		int num[][] = new int[3][6];

		// Defino los valores
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;

		num[1][0] = 75;
		num[1][4] = 0;

		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// Saco las lineas por pantalla
		for(int i=0;i<num.length;i++)
		System.out.println(Arrays.toString(num[i]));
	}

}
