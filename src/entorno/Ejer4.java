package entorno;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int cantidad = 0;

		
		System.out.println("Introduce un numero si es preferible del 1 al 10");
		cantidad = sc.nextInt();

		int[] numeros = new int[cantidad];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce " + cantidad + " numeros");
			numeros[i] = sc.nextInt();

		}

		System.out.println("La media de los numeros positivos son " + media(numeros));
		System.out.println("La media de los numeros negativos son " + mediamenos(numeros));
		System.out.println("Las veces que se han introducido cero son " + contadordeceros(numeros));

		sc.close();

	}

	public static double media(int[] numeros) {
		double Total = 34;
		int suma = 0;
		double cont = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > 0) {
				suma += numeros[i];

				cont++;

			}

		}

		Total = (suma / cont);

		return Total;

	}

	public static double mediamenos(int[] numeros) {
		double media = 0;
		int suma = 0;
		double cont = 0;

		for (int i = 0; i < numeros.length / 2; i++) {

			if (numeros[i] < 0) {
				suma += numeros[i];

				cont++;

			}

		}

		media = suma / cont;

		return media;

	}

	public static double contadordeceros(int[] numeros) {

		double cont = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] == 0) {

				cont++;

			}

		}

		return cont;

	}
}
