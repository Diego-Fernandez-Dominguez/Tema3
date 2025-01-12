package boletin6;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el titulo
		String titulo;
		
		// Creo la variable que va a guardar el contenido
		String contenido;

		// Crear el escáner
		Scanner scanner = new Scanner(System.in);

		// Le pido el titulo al usuario y este la da
		System.out.println("Dígame el titulo:");
		titulo = scanner.nextLine();
		
		// Le pido el contenido al usuario y este la da
		System.out.println("Dígame el contenido:");
		contenido = scanner.nextLine();
		
		// Saco por pantalla el resultado de la funcion
		System.out.println(convertirHTML(titulo, contenido));
		
		// Cierro el escaner
		scanner.close();

	}
	
	static String convertirHTML(String titulo, String contenido) {
		
		// Devuelvo el codigo HTML 
		return "<!DOCTYPE html>" +
	               "\n" + "<html>" +
	               "\n" + "<head>" +
	               "\n" + "<meta charset=\"UTF-8\">" +
	               "\n" + "<title>" + titulo + "</title>" +
	               "\n" + "</head>" +
	               "\n" + "<body>" +
	               "\n" + "<h1>" + titulo + "</h1>" +
	               "\n" + "<p>" + contenido + "</p>" +
	               "\n" + "</body>" +
	               "\n" + "</html>";
		
	}

}
