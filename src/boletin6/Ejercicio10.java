package boletin6;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase:");
		String frase = sc.nextLine();
		
		verificarPalindromo(quitarEspacios(frase), invertirOrden(quitarEspacios(frase)));
		
		sc.close();
	}

	public static String quitarEspacios(String frase) {

		String fraseSinEspacios = "";
		int numLetras = frase.length();
		
		for (int i = 0; i < numLetras; i++) {
			if (!(Character.isWhitespace(frase.charAt(i)))) {
				fraseSinEspacios = fraseSinEspacios + "" + frase.charAt(i);
			}
		}
		
		return fraseSinEspacios;
	}
	
	public static String invertirOrden(String frase) {
		
		String fraseInvertida = "";
		int numLetras = frase.length();
		
		for (int posicion = numLetras - 1; posicion >= 0; posicion--) {
			fraseInvertida = fraseInvertida  + "" + frase.charAt(posicion);
		}		
		
		return fraseInvertida;
	}
	
	public static void verificarPalindromo(String frase, String fraseInvertida) {
		
		if (frase.equalsIgnoreCase(fraseInvertida)) {
			System.out.println("Es un palíndromo");
		} else {
			System.out.println("No es un palíndromo");
		}
	
	}
}