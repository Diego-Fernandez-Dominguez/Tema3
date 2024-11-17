package boletin4;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Creo la tabla con los valores
		int tabla[] = { 1, 2, 3, 4, 5, 10, 7, 8, 9, 6 };

		// Creo la variable tabla y le doy el valor del return de la funcion maximo
		int maximo = maximo(tabla);

		// Saco el maximo por pantalla
		System.out.println(maximo);
	}

	static int maximo(int tabla[]) {

		// Inicializo suma como 0
		int maximo = 0;

		// Hago un for para comprobar cual es el valor maximo de la tabla
		for (int i=0;i<tabla.length;i++) {
			
			//Si i es 0 significa que es el primer numero de la, con lo que es el maximo
			if (i==0){
				maximo=tabla[i];
			}
			
			//Si el numero que esta en la tabla es mayor que el numero maximo, este se convierte en el nuevo maximo
			if(tabla[i]>maximo) {
				maximo=tabla[i];
			}

		}

		// Devuelvo el valor maximo
		return (maximo);

	}

}
