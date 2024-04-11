package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero = scanner.nextInt();
		CalculadoraEspecial calcu = new CalculadoraEspecial();
		calcu.setN(numero);
		double sumatoria = calcu.calcularSumatoria();
		System.out.println("La sumatoria del numero es: "+sumatoria);
		long productoria = calcu.calcularProductoria();
		System.out.println("La productoria del numero es: "+productoria);
		scanner.close();
	}
	
}
