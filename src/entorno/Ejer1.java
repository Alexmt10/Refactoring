package entorno;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		System.out.println("Introduce un número (0 para salir):");

		int a = sc.nextInt();

		int num2 = 0;

		while (a != num2) {

			if (a == 0) {

				System.out.println("Terminar");

			}

			if (a % 2 == 0) {

				System.out.println(a + " es múltiplo de 2.");

			} else {

				System.out.println(a + " no es múltiplo de 2.");

			}

			if (a > 0) {

				System.out.println(a + " es positivo.");

			} if (a < 0) {

				System.out.println(a + " es un número negativo.");

			} else {

				System.out.println(a + " es cero.");

			}

			int Triangulo = a * a;

			System.out.println("El cuadrado de " + a + " es " + Triangulo);

			System.out.println("Introduce un número (0 para salir):");

			a = sc.nextInt();

		}

		sc.close();

	}
}
