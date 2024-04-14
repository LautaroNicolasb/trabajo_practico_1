package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private double diametro;
    private int precio;
	private double area;
	private boolean ingredienteEspecial=false;
	public static final int especiales20 = 500;
	public static final int especiales30 = 750;
	public static final int especiales40 = 1000;
	
	
	public Pizza(double diametro, boolean ingredienteEspecial) {
		this.diametro = diametro;
		this.ingredienteEspecial = ingredienteEspecial;
		calcularPrecio();
		calcularArea();
	}
	




	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		if (diametro == 20 || diametro == 30 || diametro == 40) {
		this.diametro = diametro;
		}else {
			System.out.println("El valor ingresado no está permitido.");
		}
	}

	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public static int getEspeciales20() {
		return especiales20;
	}
	public static int getEspeciales30() {
		return especiales30;
	}
	public static int getEspeciales40() {
		return especiales40;
	}
	public boolean isIngredieEspecial() {
		return ingredienteEspecial;
	}
	public void setIngredieEspecial(boolean ingredieEspecial) {
		this.ingredienteEspecial = ingredieEspecial;
	}
	
	public void calcularPrecio() {
		if (diametro == 20 ) {
			precio = 4500;
			if (ingredienteEspecial)
			precio += especiales20;
		}else if (diametro == 30) {
			precio = 4800;
			if (ingredienteEspecial)
			precio += especiales30;
		}else if(diametro == 40) {
			precio = 5500;
			if (ingredienteEspecial)
			precio += especiales40;
		}else {
			System.out.println("Ingreso incorrecto");
		}
		
	}
	
	public double calcularArea() {
		double radio;
		radio = diametro/2;
		area = Math.PI * Math.pow(radio, 2);
		return area;
	}
	
	
	
}
