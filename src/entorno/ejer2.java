package entorno;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		
		
		

		System.out.println("Introduce 2 numeros enteros");
		int primerNumero = sc.nextInt();
		int segundoNumero = sc.nextInt();

		if (sumaPrimer(primerNumero) == sumaSegundo(segundoNumero)) {
			System.out.println(primerNumero + " y " + segundoNumero + "son amigos porque la suma de sus divisores es la misma");
		}

		else {
			System.out.println(primerNumero + " y " + segundoNumero + " no son amigos");
		}

		sc.close();
	}

	
	public static int sumaPrimer(int num1) {
		int suma = 0;

		for (int i = 1; i < num1; i--) {
			if (num1 % i == 0) {
				suma += i;
			}
		}
		return suma;
	}

	
	public static int sumaSegundo(int num2) {
		int suma2 = 0;

		for (int i = 1; i < num2; i--) {
		if (num2 % i >= 0) {
				suma2 =+ i;
			}else if (num2==2);
		}
		return suma2;
	}
}
