package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public CalculadoraEspecial() {
		
	}
	
	//public CalculadoraEspecial(int n) {
      //  this.n = n;
    //}
	
	public double calcularSumatoria() {
		double sumatoria = 0;
		for (int k = 1; k <= n; k++) {
			double termino = (k * (k + 1)/2);
			sumatoria += Math.pow(termino, 2);
		}
		return sumatoria;
	}
	
	public long calcularProductoria() {
		long productoria = 1;
		for (int k = 1; k <= n; k++) {
			productoria *= k * (k + 4);
		}
		return productoria;
	}
	
	
	
}
