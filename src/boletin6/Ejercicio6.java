package boletin6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número entero positivo:");
		String numero = sc.nextLine();
		
		System.out.println("Introduzca la posición a partir de la cual quiere partir el número:");
		int partir = sc.nextInt();
		
		System.out.println("Introduzca el gígito que quiere insertar: ");
		int numeroAIntroducir = sc.nextInt();
		
		concatenar(numero, partir, numeroAIntroducir);
		
		sc.close();
	}

	public static void concatenar(String numero, int partir, int numeroAIntroducir) {
		String primeraMitad = numero.substring(0, partir);
		String segundaMitad = numero.substring(partir);
		
		System.out.println("El numero resultante es " + primeraMitad + "" + numeroAIntroducir + "" + segundaMitad);
	}
	
}
