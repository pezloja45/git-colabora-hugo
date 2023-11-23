package boletin6;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una palabra:");
		String palabra1 = sc.next();
		
		System.out.println("Escribe otra palabra:");
		String palabra2 = sc.next();
				
		if (palabra1.equals(palabra2)) {
			System.out.println("Las 2 palabras son iguales");
		} else {
			palabras(palabra1, palabra2);
		}

		sc.close();
	}
	
	public static void palabras(String palabra1, String palabra2) {
		
		if (palabra1.length() > palabra2.length()) {
			System.out.println("La primera palabra es mayor que la segunda");
			
		} else {
			System.out.println("La segunda palabra es mayor que la primera");
	
		
	}

}
}