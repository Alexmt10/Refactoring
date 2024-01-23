package entorno;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		
		

		System.out.println("Escrribe una frase");

		String frase = sc.next();

		String caracter = introducirSimbolos(frase);

		System.out.println("La frase con el signo <>  añadido a la mitad es " + caracter);

		sc.close();
		
		System.out.println("la diferencia de frase es de "+ insertar(insertar("Hola")));

	}

	public static String introducirSimbolos(String frase) {

		int mitad;
		String respuesta;

		String separador = "<>";
		mitad = frase.length() / 2;

		respuesta = frase.substring(0, mitad) + separador + frase.substring(mitad);

		return respuesta;

	}
	
	public static String insertar(String insertar) {
		
		String fraseFinal =insertar;
		
		System.out.println("La diferencia entre la frase original y final es de "+ fraseFinal);
		return fraseFinal;
		
	}

}