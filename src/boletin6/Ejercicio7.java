package boletin6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase:");
		String frase = sc.nextLine();
		
		System.out.println(invertirOrden(frase));
		
		sc.close();
	}

	public static String invertirOrden(String frase) {
		String fraseInvertida = "";
		int numLetras = frase.length();
		
		for (int posicion = numLetras - 1; posicion >= 0; posicion--) {
			fraseInvertida = fraseInvertida  + "" + frase.charAt(posicion);
		}		
		
		return fraseInvertida;
	}
	
}
