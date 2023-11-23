package boletin6;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número entero positivo:");
		String numero = sc.nextLine();
		
		System.out.println("Introduzca la posición a partir de la cual quiere partir el número:");
		int partir = sc.nextInt();
		
		concatenar(numero, partir);
		
		sc.close();
	}

	public static void concatenar(String numero, int partir) {
		String primeraMitad = numero.substring(0, partir);
		String segundaMitad = numero.substring(partir);
		
		System.out.println("Los números partidos son el " + primeraMitad + " y el " + segundaMitad);
	}
	
}
