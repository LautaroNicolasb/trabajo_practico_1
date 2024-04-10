package ar.edu.unju.fi.ejercico5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Dentro del paquete creado para el ejercicio crear la clase Main que contenga el método main().
Declare las variables necesarias para solicitar al usuario que ingrese por consola un número 
entero que esté comprendido entre [1,9], mostrar por consola la tabla de multiplicar 
correspondiente al número ingresado. (usar la estructura de control iterativa for)
		 */
		int numero;
		Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un numero:");
		numero = scanner.nextInt();
	    scanner.close();
	    
		int contador=0;
		
		if (numero >= 0 && numero <= 9) {
			for (int j = 0; j < 11 ; j++) {
				System.out.println(numero+" x "+contador+" = "+(numero*contador));
				contador++;
			}
		}else {
			System.out.println("El valor esta fuera de rango");
		}
		
		
	}
	
}
