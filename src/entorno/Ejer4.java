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

		System.out.println("La media de los numeros positivos son " + calculoMedia(numeros));
		System.out.println("La media de los numeros negativos son " + calculoMediaNegativos(numeros));
		System.out.println("Las veces que se han introducido cero son " + contadorDeCeros(numeros));

		sc.close();

	}

	public static double calculoMedia(int[] numeros) {
		double total;
		int suma = 0;
		double cont = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > 0) {
				suma += numeros[i];

				cont++;

			}

		}

		total = (suma / cont);

		return total;

	}

	public static double calculoMediaNegativos(int[] numeros) {
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

	public static double contadorDeCeros(int[] numeros) {

		double cont = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] == 0) {

				cont++;

			}

		}

		return cont;

	}
}
