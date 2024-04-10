package ar.edu.unju.fi.ejercico4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 	Dentro del paquete creado para el ejercicio crear la clase Main que contenga el método main().
			Declare las variables necesarias para realizar el cálculo del factorial de un número que se introduce 
			por consola y está dentro del rango numérico [0,10]. Utilice una estructura de control iterativa While
			para resolver el ejercicio. Muestre el resultado por consola.
			El factorial de un número entero (n!) se calcula de la siguiente forma:
			numero! = numero *(numero-1)*(numero-2)...1
			0! = 1 (por definición)
			1! = 1
			2! = 2 * 1 = 2
			3! = 3 * 2 * 1 = 6
			4! = 4 * 3 * 2 * 1 = 2
		 */
		//Declarar variables 
		int numero;
		int contador=1;
		int factorial;
		Scanner scanner = new Scanner(System.in);
		
		//Ingreso de valores
		System.out.println("Ingrese un numero: ");
		numero = scanner.nextInt();
		scanner.close();
		
		//Calculo del factorial
		if (numero >= 0 && numero <= 10) {
			factorial=numero;
			while (contador < numero){
				factorial*=contador;
				contador++;
			}
			System.out.println("El Factorial es: "+factorial);
			
		}else{
		System.out.println("Valor fuera del rango");	
	}
		
	}

}
