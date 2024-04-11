package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los datos para el nuevo emoleado: ");
		System.out.println("Ingrese el nombre:");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el legajo");
		int legajo = scanner.nextInt();
		System.out.println("Ingrese el salario: ");
		double salario = scanner.nextDouble();
		Empleado empleado = new Empleado(nombre, legajo, salario);
		empleado.mostarDatos();
		empleado.darAumento();
		empleado.mostarDatos();
		

	}

}
