package entorno;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero si es preferible del 1 al 10");
		int cantidad = sc.nextInt();

		int[] numeros = new int[cantidad];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce " + cantidad + " numeros");
			numeros[i] = sc.nextInt();

		}

		System.out.println("La media de los numeros positivos son " + mediaPositivos(numeros));
		System.out.println("La media de los numeros negativos son " + mediaNegativos(numeros));
		System.out.println("Las veces que se han introducido cero son " + contadorCeros(numeros));

		sc.close();

	}

	public static int mediaPositivos(int numeros[]) {
		int suma = 0;
		int contador = 0;
		int media = suma / contador;
		for (int i = 0; i < ar.length; i++) {
			if (numeros[i] > 0) {
				suma += numeros[i];
				contador++;
			}
		}
		return media;
	}

	public static int mediaNegativos(int numeros[]) {
		int suma = 0;
		int contador = 0;
		int media = suma / contador;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				suma += matrix[i];
				contador++;
			}
		}
		return media;
	}

	public static int contadorCeros(int numeros[]) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (numeros[i] == 0) {
				suma++;
			}
		}
		return contador;
	}

}
