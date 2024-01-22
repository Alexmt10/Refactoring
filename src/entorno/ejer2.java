package entorno;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		System.out.println("Introduce 2 numeros enteros");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();

		if (sumaDivisores(numero1) == sumaDivisores(numero2)) {
			System.out.println(numero1 + " y " + numero2 + "son amigos porque la suma de sus divisores es la misma");
		}

		else {
			System.out.println(numero1 + " y " + numero2 + " no son amigos");
		}
		sc.close();
	}

	
	public static int sumaDivisores(int numero) {
		int suma = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				suma += i;
			}
		}
		return suma;
	}
}
