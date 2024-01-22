package entorno;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		String frase = sc.next();
		
		System.out.println("La frase con el signo <>  añadido a la mitad es " + espacio(frase));

		sc.close();
		
		System.out.println("la diferencia de frase es de "+ insertar(insertar("Hola")));

	}

	public static String espacio(String frase) {
		int longitud = frase.length();
		int mitad = frase.length() / 2;

		nuevaFrase = frase.substring(0, mitad) + "<>"  + frase.substring(mitad);

		return fraseNueva;

	}
	
	public static String insertar(String insertar) {
		
		String frasefinal =insertar;
		
		System.out.println("La diferencia entre la frase original y finsl es de "+ frasefinal);
		return frasefinal;
		
	}

}