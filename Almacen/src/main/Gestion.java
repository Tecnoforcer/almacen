package main;

import java.util.Scanner;

import productos.*;

public class Gestion {
	private Producto almacen[][];
	
	
	
	
	public Gestion(int fila, int estanteria) {
		
	almacen = new Producto[fila][estanteria];
	}

	public void precioDeTodo(Producto alamcen[][]) {
		double total = 0;
		for (int i = 0; i < alamcen.length; i++) {
			for (int j = 0; j < alamcen[i].length; j++) {
				if (alamcen[i][j] != null) {
					total += alamcen[i][j].getPrecio();
				}
			}
		}

		System.out.println(total);

	}
	
	public void precioPorMarca(Producto almacen[][]) {
		Scanner leerS = new Scanner(System.in);
		boolean correcto=false;
		String buscar="";
		double total=0;
		do {
			leerS = new Scanner(System.in);
			try {
				correcto=true;
				buscar=leerS.nextLine();
				buscar=buscar.toLowerCase();
			} catch (Exception e) {
				System.err.println("Error de lectura");
				correcto=false;
			}
		} while (!correcto);
		for (int i = 0; i < almacen.length; i++) {
			for (int j = 0; j < almacen.length; j++) {
				if ((almacen[i][j]!=null)&&(almacen[i][j].getMarca().equalsIgnoreCase(buscar))) {
					total+=almacen[i][j].getPrecio();
					
				}
				
			}
		}
		System.out.println(total);
		
	}
	
	public void precioEstanteria(Producto alamcen[][]) {
		Scanner leerI = new Scanner(System.in);
		int numMAX=alamcen.length-1;
		int estanteria=0;
		boolean correcto=false;
		double total=0;
		
		do {
			leerI = new Scanner(System.in);
			try {
				correcto=true;
				estanteria=leerI.nextInt();
				if (estanteria>numMAX) {
					correcto=false;
					System.out.println("escoje un numero en el esiguiente rango [0-"+(alamcen.length-1)+"]");
				}
			} catch (Exception e) {
				System.err.println("Error de lectura");
				correcto=false;
			}
		} while (!correcto);
		
		for (int i = 0; i < alamcen[estanteria].length; i++) {
			if (alamcen[estanteria][i]!=null) {
				total+=alamcen[estanteria][i].getPrecio();
			}
		}
		
		System.out.println(total);
		
	}
	
	public void agregarProductoAgua(Producto almacen[][]){
		Scanner leerS;
		Scanner leerD;
		
		String identificador="";
		String nombre="";
		String marca="";
		double litros=0;
		String origen="";
		boolean correcto=false;
		
		do {
			 leerS = new Scanner(System.in);
			 leerD = new Scanner(System.in);
			try {
				correcto=true;
				nombre=leerS.nextLine();
				marca=leerS.nextLine();
				origen=leerS.nextLine();
				litros=leerD.nextDouble();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
			
			
			
			
			
			
			
		} while (!correcto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		rotura: while (true) {
		 for (int i = 0; i < almacen.length; i++) {
			for (int j = 0; j < almacen[i].length; j++) {
				
				
				
				
				break rotura;
			}
		}
		}
		
		
		
		
	}
	
	
	
	
}
