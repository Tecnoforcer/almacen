package main;

import java.util.Scanner;

import productos.*;

public class Main {

	public static void main(String[] args) {
		Scanner leerS = new Scanner(System.in);
		Scanner leerI = new Scanner(System.in);
		int filas = 10;//10 por simplificar
		int columnas = 10;//10 por simplificar
		int opc = 0;

		Producto alamcen[][] =new Producto[filas][columnas];
		
		
		
		do {
			opc=Menu.pintaMenu();
			switch (opc) {
			case 1:
				Gestion.precioDeTodo(alamcen);
				break;
			case 2:
				Gestion.precioPorMarca(alamcen);
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			default:
				System.out.println("ADIOS");
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} while (opc!=7);
		
		
		
	}

}
