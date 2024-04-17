package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entre 5 - 10 : ");
		int numero =scanner.nextInt();
		scanner.nextLine();
		
		String[] listaArray = new String[numero];
		
		if (numero >= 5 && numero <= 10) {
			
			for (int i=0;i<numero;i++) {
				System.out.println("Ingrese un nombre "+(i+1)+": ");
				listaArray[i] = scanner.nextLine();
			}
			for(String lista : listaArray) {
				System.out.println(lista);
			}
			
			for(int i=numero-1;i>=0;i--) {
				System.out.println(listaArray[i]);
			}
		
		}else {
		System.out.println("Ingreso no válido");
	}
		scanner.close();
	}
}
