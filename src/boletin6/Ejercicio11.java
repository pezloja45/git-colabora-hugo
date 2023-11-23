package boletin6;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String muletilla = "Javalin, javalon";
		String coletilla = "javalen, len, len";
		
		System.out.println("Escribe una clase:");
		String frase = sc.nextLine();
		
		traductor(frase, muletilla, coletilla);
		
		sc.close();
	}

	public static void traductor(String frase, String muletilla, String coletilla) {
		
		if (frase.indexOf(muletilla) == 0 || frase.indexOf(coletilla) == frase.length() - coletilla.length()) {
			
			while (frase.indexOf(muletilla) > -1) {
				frase = frase.substring(muletilla.length(), frase.length());
			}
				
			while (frase.indexOf(coletilla) > -1) {
				frase = frase.substring(0, frase.length() - coletilla.length());
			}
			
			System.out.println(frase.trim());
		}
		
	}
}
