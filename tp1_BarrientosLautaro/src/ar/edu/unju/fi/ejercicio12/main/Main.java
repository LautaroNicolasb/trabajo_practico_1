package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
		
		String fechaStr = scanner.nextLine();

	        // Dividir la cadena en día, mes y año
		String[] partesFecha = fechaStr.split("/");
		int dia = Integer.parseInt(partesFecha[0]);
	    int mes = Integer.parseInt(partesFecha[1]) - 1; // Restar 1 porque Calendar empieza en 0 para los meses
        int anio = Integer.parseInt(partesFecha[2]);

	        // Crear una instancia de Calendar y configurarla con la fecha ingresada    
	    Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setLenient(false); // Desactivar la flexibilidad del calendario
	    fechaNacimiento.set(anio, mes, dia);
        
		Persona persona = new Persona(nombre, fechaNacimiento);
		System.out.println("Nombre: "+nombre);
		System.out.println("Fecha de nacimiento: "+dia+"/"+(mes+1)+"/"+anio);
		System.out.println("Edad: "+persona.calcularEdad()+" años");
		System.out.println("Signo del zodiaco: "+persona.determinarSignoZodiaco());
		System.out.println("Estacion: "+persona.determinarEstacion());
		
		scanner.close();
		
	    }

}
