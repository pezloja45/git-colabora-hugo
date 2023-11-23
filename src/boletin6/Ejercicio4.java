package boletin6;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase:");
		String frase = sc.nextLine();
		
		concatenar(frase);
		
		sc.close();
	}

	public static void concatenar(String frase) {
		int mitad = frase.length() / 2;
		
		String fraseFinal = frase.substring(0, mitad) + "<>" + frase.substring(mitad);
		
		System.out.println(fraseFinal);
	}
	
}
