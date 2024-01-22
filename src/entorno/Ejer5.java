package entorno;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
	      var sc = new Scanner(System.in);
	        System.out.println("Introduce tu nombre completo: ");
	        String nombre = sc.nextLine();

	        System.out.println("Nombre sin vocales: " + suprimirVocales(nombre));
	        
	        sc.close();
	        
	    }

	    public static String suprimirVocales(String nombre) {
	        nombre = nombre.toLowerCase();
	        String vocales = "aeiouAEIOU";
	        String resultado = "";
	        for (int i = 0; i < vocales.length(); i++) {
	            char caracter = nombre.charAt(i);
	            if (vocales.indexOf(caracter) == -1) {
	                resultado += caracter;
	            }
	        }
	        return resultado;
	    }
	}
