package main;

import java.util.Scanner;

import productos.*;

public class Almacen {
	private Producto almacen[][];

	public Almacen(int fila, int estanteria) {

		almacen = new Producto[fila][estanteria];
	}

	public void precioDeTodo() {
		double total = 0;
		for (int i = 0; i < almacen.length; i++) {
			for (int j = 0; j < almacen[i].length; j++) {
				if (almacen[i][j] != null) {
					total += almacen[i][j].getPrecio();
				}
			}
		}

		System.out.println(total);

	}

	public void precioPorMarca() {
		Scanner leerS = new Scanner(System.in);
		boolean correcto = false;
		String buscar = "";
		double total = 0;
		do {
			leerS = new Scanner(System.in);
			try {
				correcto = true;
				buscar = leerS.nextLine();
				buscar = buscar.toLowerCase();
			} catch (Exception e) {
				System.err.println("Error de lectura");
				correcto = false;
			}
		} while (!correcto);
		for (int i = 0; i < almacen.length; i++) {
			for (int j = 0; j < almacen.length; j++) {
				if ((almacen[i][j] != null) && (almacen[i][j].getMarca().equalsIgnoreCase(buscar))) {
					total += almacen[i][j].getPrecio();

				}

			}
		}
		System.out.println(total);

	}

	public void precioEstanteria() {
		Scanner leerI = new Scanner(System.in);
		int numMAX = almacen.length - 1;
		int estanteria = 0;
		boolean correcto = false;
		double total = 0;

		do {
			leerI = new Scanner(System.in);
			System.out.println("numero de estanteria:");
			try {
				correcto = true;
				estanteria = leerI.nextInt();
				if (estanteria > numMAX) {
					correcto = false;
					System.out.println("escoje un numero en el esiguiente rango [0-" + (almacen.length - 1) + "]");
				}
			} catch (Exception e) {
				System.err.println("Error de lectura");
				correcto = false;
			}
		} while (!correcto);

		for (int i = 0; i < almacen[estanteria].length; i++) {
			if (almacen[estanteria][i] != null) {
				total += almacen[estanteria][i].getPrecio();
			}
		}

		System.out.println(total);

	}

	public void agregarProductoAgua() {
		Scanner leerS;
		Scanner leerD;

		String identificador = "";
		String identificadorAUX = "";
		String nombre = "";
		String marca = "";
		double litros = 0;
		double precio = 0;
		String origen = "";
		boolean correcto = false;

		do {
			leerS = new Scanner(System.in);
			leerD = new Scanner(System.in);
			System.out.println("Introduzca: nombre del producto NO azucarado, marca, origen,litros y precio");
			try {
				correcto = true;
				nombre = leerS.nextLine();
				marca = leerS.nextLine();
				origen = leerS.nextLine();
				litros = leerD.nextDouble();
				precio = leerD.nextDouble();
			} catch (Exception e) {
				// TODO: handle exception
			}

		} while (!correcto);

		rotura: while (true) {
			for (int i = 0; i < almacen.length; i++) {
				for (int j = 0; j < almacen[i].length; j++) {
					if (almacen[i][j] == null) {
						identificador = i + j + "";
						identificadorAUX = identificador.hashCode() + "";
						identificador = nombre + marca + identificadorAUX;
						System.out.println("el identificador de este producto es " + identificador);
						almacen[i][j] = new Agua(identificador, litros, precio, marca, origen, nombre);
					} else {
						System.out.println("almacen lleno");
					}

					break rotura;
				}
			}
		}

	}

	public void agregarProductoAzucar() {
		Scanner leerS;
		Scanner leerD;

		String identificador = "";
		String identificadorAUX = "";
		String nombre = "";
		String marca = "";
		double litros = 0;
		double precio = 0;
		String ofer = "";
		boolean oferta = false;
		boolean correcto = false;

		do {
			leerS = new Scanner(System.in);
			leerD = new Scanner(System.in);
			System.out.println(
					"Introduzca: nombre del producto azucarado, marca,litros, precioy si esta en oferta escriba 'oferta'");
			try {
				correcto = true;
				nombre = leerS.nextLine();
				marca = leerS.nextLine();
				litros = leerD.nextDouble();
				precio = leerD.nextDouble();
				ofer = leerS.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
			}

		} while (!correcto);

		if (ofer.equalsIgnoreCase("oferta"))
			oferta = true;

		rotura: while (true) {
			for (int i = 0; i < almacen.length; i++) {
				for (int j = 0; j < almacen[i].length; j++) {
					if (almacen[i][j] == null) {
						identificador = i + j + "";
						identificadorAUX = identificador.hashCode() + "";
						identificador = nombre + marca + identificadorAUX;
						System.out.println("el identificador de este producto es " + identificador);
						almacen[i][j] = new Bebida_Azucarada(identificador, litros, precio, marca, oferta, nombre);
					} else {
						System.out.println("almacen lleno");
					}

					break rotura;
				}
			}
		}

	}
	public void eliminarProducto() {
		Scanner leer;
		String buscado="";
		boolean correcto =false;
		
		do {
			leer=new Scanner(System.in);
			
			try {
				correcto=true;
			System.out.println("introduzca el id del producto que se quiere eliminar");
			buscado=leer.nextLine();
			} catch (Exception e) {
				System.out.println("error de lectura");
			}
			
			for (int i = 0; i < almacen.length; i++) {
				for (int j = 0; j < almacen[i].length; j++) {
					if ((almacen[i][j]!=null)&&(almacen[i][j].getNombre().equalsIgnoreCase(buscado))) {
						//ni idea 
					}
				}
			}
			
			
			
			
		} while (!correcto);
		
		
		
	}
	
	
	
	
	
	
	public void mostrarInformacion() {
		for (int i = 0; i < almacen.length; i++) {
			for (int j = 0; j < almacen[i].length; j++) {
				if ((almacen[i][j]!=null)) {
					System.out.println(almacen[i][j]);
				}
				
			}
		}

	}

}
