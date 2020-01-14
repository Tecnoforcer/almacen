package main;

import java.util.Scanner;

import productos.*;

public class Main {

	public static void main(String[] args) {
		Scanner leerS = new Scanner(System.in);
		Scanner leerI = new Scanner(System.in);
		int filas = 10;// 10 por simplificar
		int columnas = 10;// 10 por simplificar
		int opc = 0;
		int opcAUX = 0;
		Almacen al = new Almacen(filas, columnas);

		do {
			opc = Menu.pintaMenu();
			switch (opc) {
			case 1:
				al.precioDeTodo();
				break;
			case 2:
				al.precioPorMarca();
				break;
			case 3:
				al.precioEstanteria();
				break;
			case 4:
				do {
					opcAUX = Menu.tipoProducto();
					if (opcAUX == 1) {
						al.agregarProductoAgua();
					} else if (opcAUX == 2) {
						al.agregarProductoAzucar();
					}
				} while (opcAUX != 3);

				break;
			case 5:
				al.eliminarProducto();
				break;
			case 6:
				al.mostrarInformacion();
				break;
			default:
				System.out.println("ADIOS");
				break;
			}

		} while (opc != 7);

	}

}
