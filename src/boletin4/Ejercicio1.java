package boletin4;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Creo la tabla con los valores
		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Creo la variable tabla y le doy el valor del return de la funcion sumaTabla
		int suma = sumaTabla(tabla);

		// Saco la suma por pantalla
		System.out.println(suma);
	}

	static int sumaTabla(int tabla[]) {

		// Inicializo suma como 0
		int suma = 0;

		// Hago un for-each para sumar los valores de la tabla
		for (int valor : tabla) {
			suma += valor;
		}

		// Devuelvo el valor de la suma
		return (suma);

	}

}
