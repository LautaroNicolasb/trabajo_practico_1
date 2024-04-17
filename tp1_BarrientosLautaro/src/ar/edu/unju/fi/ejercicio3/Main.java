package ar.edu.unju.fi.ejercico3;

import java.util.Scanner;

public class Main {
	/*Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
	Declare las variables necesarias para realizar lo siguiente: 
	Solicitar al usuario que ingrese por consola un número entero que debe ser almacenado en una 
	variable (Investigue como utilizar la clase Scanner para poder ingresar datos por consola).
	Si el número ingresado es impar mostrar el doble del número y si es par mostrar el triple del número.*/

	public static void main(String[] args) {
	//Declarar variables 		
	Scanner scanner = new Scanner(System.in);
	int numero;
	
	//ingreso de datos 
	System.out.println("Ingrese un numero: ");
	numero = scanner.nextInt();
	//cerrar el scanner
	scanner.close();
	//Condicional
	if ( numero%2 == 0 ) {
		//caundo el numero es par 
		System.out.println("El número es: "+(numero*2));
		}else
		//cuando el numero es impar 
		System.out.println("El número es: "+(numero*3));
		}

}
