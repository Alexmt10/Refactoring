package entorno;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		System.out.println("Introduce un número (0 para salir):");

		int numeroIntroducido = sc.nextInt();

		int num2 = 0;

		while (numeroIntroducido != num2) {

			if (numeroIntroducido == 0) {

				System.out.println("Terminar");

			}

			if (numeroIntroducido % 2 == 0) {

				System.out.println(numeroIntroducido + " es múltiplo de 2.");

			} else {

				System.out.println(numeroIntroducido + " no es múltiplo de 2.");

			}

			if (numeroIntroducido > 0) {

				System.out.println(numeroIntroducido + " es positivo.");

			}else if (numeroIntroducido < 0) {

				System.out.println(numeroIntroducido + " es un número negativo.");

			} else {

				System.out.println(numeroIntroducido + " es cero.");

			}

			int productoCuadrado = numeroIntroducido * numeroIntroducido;

			System.out.println("El cuadrado de " + numeroIntroducido + " es " + productoCuadrado);

			System.out.println("Introduce un número (0 para salir):");

			numeroIntroducido = sc.nextInt();

		}

		sc.close();

	}
}
