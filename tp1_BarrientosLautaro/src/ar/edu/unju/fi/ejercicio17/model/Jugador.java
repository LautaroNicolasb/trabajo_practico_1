package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private String posicion;
	
	public Jugador(String nombre, String apellido, String fechaNacimmiento, String nacionalidad, double estatura,
			double peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimmiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimmiento) {
		this.fechaNacimiento = fechaNacimmiento;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public double getEstatura() {
		return estatura;
	}


	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public int calcularEdad(String fechaNacimiento) {
		LocalDate fechaActual=LocalDate.now();
		LocalDate fechaNacimientoStr = LocalDate.parse(fechaNacimiento);
		Period periodo = Period.between(fechaNacimientoStr, fechaActual);
		return periodo.getYears() ;
	}
	
	@Override
	public String toString() {
		return "Jugador: [Nombre] = " + nombre + " [Apellido] = " + apellido + " [Fecha De Nacimiento] = " + fechaNacimiento
				+ " [Nacionalidad] = " + nacionalidad + " [Estatura] = " + estatura + " [Peso] = " + peso + " [Posicion] = "
				+ posicion +" [Edad] = "+calcularEdad(fechaNacimiento);
	}
	
	
}
