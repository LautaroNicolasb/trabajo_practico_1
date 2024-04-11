package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	
	public static final double salarioMinimo = 210000.00;
	public static final double aumentoPorMerito = 20000.00;
	
	public Empleado(String nombre, int legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		
		if (salario >= salarioMinimo) {
			this.salario = salario;
		}else {
		    this.salario = salarioMinimo;
		}
		
		
	}
	
	public void mostarDatos() {
		System.out.println("Datos del empleado: ");
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario: $"+salario);
		
	}
	
	public int darAumento() {
		return (int) (salario += aumentoPorMerito); 
	}
	
	
}
