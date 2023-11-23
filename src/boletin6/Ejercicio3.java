package boletin6;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase:");
		String frase = sc.nextLine();
		
		posicionCentral(frase);
		
		sc.close();
	}

	public static void posicionCentral(String frase) {
		int longitud = frase.length();
		boolean espacio = false;

		if (longitud % 2 == 0 && frase.charAt(longitud / 2 - 1) == ' ') {
			espacio = true;
		} else if (longitud % 2 != 0 && frase.charAt(longitud / 2) == ' ') {
			espacio = true;
		}
			
		System.out.println("¿Tiene espacios en el centro?");
		System.out.println(espacio);
	}
	
}
