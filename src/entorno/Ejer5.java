package entorno;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
	      var sc = new Scanner(System.in);
	        String perro;
	        System.out.println("Introduce tu nombre completo");
	        perro = sc.nextLine();

	        String resultado = subsistir(perro);
	        System.out.println("Nombre sin vocales: " + resultado);
	        
	        sc.close();
	        
	    }

	    public static String subsistir(String nombre) {
	        nombre = nombre.toLowerCase();

	        String vocales = "aeiouáéíóú";

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
