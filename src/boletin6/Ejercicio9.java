package boletin6;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe tu nombre y apellidos:");
		String nombre = sc.nextLine();
		
		System.out.println(quitarVocales(nombre));
		
		sc.close();
	}
	
	public static String quitarVocales(String nombre) {
		
		int longitud = nombre.length();
		nombre = nombre.toLowerCase();
		String resultado = "";
		
		for (int i = 0; i < longitud; i++) {
			if (!(nombre.charAt(i) == 'a' ||
				nombre.charAt(i) == 'e' ||
				nombre.charAt(i) == 'i' ||
				nombre.charAt(i) == 'o' ||
				nombre.charAt(i) == 'u' ||
				nombre.charAt(i) == 'á' ||
				nombre.charAt(i) == 'é' ||
				nombre.charAt(i) == 'í' ||
				nombre.charAt(i) == 'ó' ||
				nombre.charAt(i) == 'ú')) {
				resultado = resultado + "" + nombre.charAt(i);
			}
		}	
		
		return resultado;
	}

}
