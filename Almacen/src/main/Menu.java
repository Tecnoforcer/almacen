package main;

import java.util.Scanner;

public class Menu {
	public static int pintaMenu() {
		Scanner leer;
		int opc=0;
		do {
			leer = new Scanner(System.in);
			System.out.println("");
			System.out.println("1.        Calcular precio de todos los productos");
			System.out.println("2.   Calcular precio de todas las bebidas de una marca");
			System.out.println("3. Calcular precio de las bebidas de una estanteria (columna)");
			System.out.println("4.                    Agregar producto");
			System.out.println("5.                    Eliminar producto");
			System.out.println("6.                   Mostrar informacion");
			System.out.println("7.                          Salir");
			
			try {
				opc=leer.nextInt();
			} catch (Exception e) {
				System.out.println("Error de lectura");
			}
			
			
			
			
		} while (opc<1||opc>7);
		
		
		
		
		return opc;
	}
}
