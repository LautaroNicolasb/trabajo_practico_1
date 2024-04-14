package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i=1; i < 4; i++) {
	
		System.out.println("Ingrese el diametro de la pizza: ");
		double diametro = Double.parseDouble(scanner.nextLine());
		System.out.println("Ingrese si tienen ingredientes: ");
		System.out.println("\n");
		boolean ingredientes = Boolean.parseBoolean(scanner.nextLine());
		Pizza pizza =  new Pizza(diametro, ingredientes);
		System.out.println("**Pizza "+i+"**");
		System.out.println("\n");
		System.out.println("Diametro = "+pizza.getDiametro());
		System.out.println("\n");
		System.out.println("Ingredientes especiales = "+pizza.isIngredieEspecial());
		System.out.println("\n");
		System.out.println("Precio pizza = "+pizza.getPrecio());
		System.out.println("\n");
		System.out.println("Área de la pizza = "+pizza.calcularArea());
		System.out.println("\n");
		}
		
		scanner.close();
	}

}
