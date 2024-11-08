package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Creo las tabla que se va a rellenar con los valores del usuario
		int tabla1[]=new int[10];
		int tabla2[]=new int[10];
		
		boolean igual;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<tabla1.length;i++) {
			System.out.println("Digame un numero de la tabla 1: ");
			tabla1[i]=sc.nextInt();
		}
		
		for(int i=0;i<tabla2.length;i++) {
			System.out.println("Digame un numero de la tabla 2: ");
			tabla2[i]=sc.nextInt();
		}
		
		igual=Arrays.equals(tabla1, tabla2);
		System.out.println(igual ? "Si son iguales" : "No son iguales");

	}
}
