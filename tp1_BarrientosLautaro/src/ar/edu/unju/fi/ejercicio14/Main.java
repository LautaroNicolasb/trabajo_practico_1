package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entre 3 - 10 : ");
		int numero = scanner.nextInt();
		scanner.nextLine();
		int suma = 0;
		int [] listaArray = new int[numero];
		
		if (numero >= 3 && numero <= 10) {
			
			for (int i=0;i<numero;i++) {
				System.out.println("Ingrese un nombre "+(i+1)+": ");
				listaArray[i] = scanner.nextInt();
			}
			for(Integer lista : listaArray) {
				System.out.println(lista);
				suma+= lista;
			}
			
			System.out.println("Suma de los valores de la lista: "+suma);
		
		}else {
		System.out.println("Ingreso no válido");
	}
		scanner.close();
	}
		
		
	

}
