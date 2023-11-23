package boletin6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase:");
		String frase = sc.nextLine();
		
		System.out.println("Escribe la palabra que quieres buscar");
		String palabra = sc.nextLine();
		
		System.out.println("Hay " + buscar(frase, palabra) + " palabras que buscas");
		
		sc.close();
	}

	public static int buscar(String frase, String palabra) {
		int contador = 0;
		
		while (frase.indexOf(palabra) > -1) {
			frase = frase.substring(frase.indexOf(palabra) + palabra.length(), frase.length());
			contador++;
		}		
		
		return contador;
	}
	
}
