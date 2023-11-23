package boletin6;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase:");
		String frase = sc.nextLine();

		System.out.println("La frase tiene " + contarEspacios(frase) + " espacios en blanco");
		
		sc.close();
	}

	public static int contarEspacios(String frase) {
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isWhitespace(frase.charAt(i))) {
				contador++;
			}
		}
			
		return contador;
		
	}
	
}
