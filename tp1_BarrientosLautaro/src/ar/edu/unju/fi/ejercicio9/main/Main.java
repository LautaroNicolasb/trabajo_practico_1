package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=0;
		while (i < 3) {
			
		System.out.println("Ingrese datos para el producto "+i+":");
		System.out.println("Nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Código: ");
		String codigo = scanner.nextLine();
		System.out.println("Precio: ");
		double precio = Double.parseDouble(scanner.nextLine());
		System.out.println("Descuento: ");
		int descuento = Integer.parseInt(scanner.nextLine());
		
		Producto producto = new Producto(nombre, codigo, precio, descuento);
		
		System.out.println("Producto con descuento: "+producto.calularDescuento());
		i++;
		
		}	
	  
		scanner.close();

	}

}
