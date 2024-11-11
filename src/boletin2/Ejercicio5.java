package boletin2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int tabla[]=new int[100];
		
		int numero;
		
		Random rand=new Random();
		
		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<tabla.length;i++) {
			tabla[i]=rand.nextInt(0,100);
		}
		
		System.out.println("Dime un numero");
		numero=sc.nextInt();
		
		
	}

}
