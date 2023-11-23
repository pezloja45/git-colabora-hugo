package boletin6;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contraseña = "";
        String intento = "";
        
        
        System.out.print("Jugador 1, introduce la contraseña: ");
        contraseña = sc.nextLine();

        do {
	        System.out.print("Jugador 2, introduce tu contraseña: ");
	        intento = sc.nextLine();
	
	        int comparacion = intento.compareTo(contraseña);
	        
	        comparacion(comparacion, contraseña);
        } while (contraseña != intento);
        
        sc.close();
    }
    
    public static void comparacion(int comparacion, String contraseña) {
    	Scanner sc = new Scanner(System.in);

    	if (comparacion == 0) {
            System.out.println("Acertaste");
        } else if (comparacion < 0) {
            System.out.println("Menor");
            System.out.println("¿Quieres pistas? (1 = si, 2 = no)");
            int pista = sc.nextInt();
            
            pistas(pista, contraseña);
            
        } else {
            System.out.println("Mayor");
            System.out.println("¿Quieres pistas? (1 = si, 2 = no)");
            int pista = sc.nextInt();
            
            pistas(pista, contraseña);
            
        }
    	
    }
    
    public static void pistas(int pista, String contraseña) {
    	if (pista == 1) {
    		System.out.println("Número de caracteres: " + contraseña.length());
            System.out.println("Primera letra: " + contraseña.charAt(0));
            System.out.println("Última letra: " + contraseña.charAt(contraseña.length() - 1));
    	}
    }
}