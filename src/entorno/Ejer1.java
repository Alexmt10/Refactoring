package entorno;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		System.out.println("Introduce un numero (0 para salir):");
		int numero = sc.nextInt();

		if (numero != 0) {

			if (numero % 2 == 0) {
				System.out.println(numero + " es multiplo de 2.");
			} else {
				System.out.println(numero + " no es multiplo de 2.");
			}

			if (numero > 0) {
				System.out.println(numero + " es positivo.");
			}else{
				System.out.println(numero + " es negativo.");
			}
			
		}else {
			System.out.println("Ha salido del programa");
		}

			int cuadrado = numero * numero;

			System.out.println("El cuadrado de " + numero + " es " + cuadrado);

			System.out.println("Introduce un numero (0 para salir):");

			numero = sc.nextInt();
		}

		sc.close();
	}
}
