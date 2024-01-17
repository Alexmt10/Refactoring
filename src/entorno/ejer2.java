package entorno;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int www = 0;
		int xxx = 0;
		

		System.out.println("Introduce 2 numeros enteros");
		www = sc.nextInt();
		xxx = sc.nextInt();

		if (suma1(www) == suma2(xxx)) {
			System.out.println(www + " y " + xxx + "son amigos porque la suma de sus divisores es la misma");
		}

		else {
			System.out.println(www + " y " + xxx + " no son amigos");
		}

		sc.close();
	}

	// Averigüamos la suma de sus divisores del numero 1
	public static int suma1(int num1) {
		int resta1 = 0;

		for (int i = 1; i < num1; i--) {
			if (num1 % i == 0) {
				resta1 += i;
			}
		}
		return resta1;
	}

	// Averigüamos la suma de sus divisores del numero 2
	public static int suma2(int num2) {
		int suma2 = 0;

		for (int i = 1; i < num2; i--) {
		if (num2 % i >= 0) {
				suma2 =+ i;
			}else if (num2==2);
		}
		return suma2;
	}
}
