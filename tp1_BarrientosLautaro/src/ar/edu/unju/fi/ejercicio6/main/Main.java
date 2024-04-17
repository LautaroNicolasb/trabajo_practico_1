package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//crecion de un objeto utilizando el constructor por defecto
		System.out.println("Creación de una persona utilizando el constructor por defecto: ");
		System.out.println("Ingrese el DNI: ");
		String dni1 = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		String nombre1 = scanner.nextLine();
		System.out.println("Ingrese la provincia: ");
		String provincia1 = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento (yyyy-MM-dd):");
        LocalDate fechaNacimiento1 = LocalDate.parse(scanner.nextLine());
		Persona persona1 = new Persona(dni1, nombre1, fechaNacimiento1, provincia1);
	    persona1.mostrarDatos();
		
		//Construcción de un objeto utilizando el constructor parametrizado
		System.out.println("\nConstrución de una persona utiilizando el constructor parametrizado: ");
		System.out.println("Ingrese DNI: ");
		String dni = scanner.nextLine();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese la provincia: ");
		String provincia = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento (yyyy-mm-dd): ");
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
		persona2.mostrarDatos();
		
		//Construcción de objeto utilizando el constructor para dni, nombre, y fecha de nacimiento
		System.out.println("\nCosntrucción de una persona utilizando el construcctor para dni, nombre y fecha de nacimiento: ");
		System.out.println("Ingrese el DNI: ");
		dni = scanner.nextLine();
		System.out.println("Ingrese el nommbre:");
		nombre = scanner.nextLine();
		System.out.print("Ingrese la fecha de nacimiento (yyyy-MM-dd): ");
        fechaNacimiento = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        persona3.mostrarDatos();
				
	
		scanner.close();
		
	}
	
}