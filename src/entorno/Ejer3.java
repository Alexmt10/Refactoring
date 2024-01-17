package entorno;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		String frase;
		

		System.out.println("Escrribe una frase");

		frase = sc.next();

		String caracter = cosas(frase);

		System.out.println("La frase con el signo <>  añadido a la mitad es " + caracter);

		sc.close();
		
		System.out.println("la diferencia de frase es de "+ insertar(insertar("Hola")));

	}

	public static String cosas(String frase) {

		int mitad;
		String respuesta;

		String cosa = "<>";
		mitad = frase.length() / 2;

		respuesta = frase.substring(0, mitad) + cosa + frase.substring(mitad);

		return respuesta;

	}
	
	public static String insertar(String insertar) {
		
		String frasefinal =insertar;
		
		System.out.println("La diferencia entre la frase original y finsl es de "+ frasefinal);
		return frasefinal;
		
	}

}