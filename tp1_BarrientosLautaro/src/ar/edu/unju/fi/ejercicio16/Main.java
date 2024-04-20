package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] listaNombres = new String[5];
	byte indice = 0;
	
	for (int i=0;i<5 ; i++) {
		System.out.println("Ingrese un nombre: ");
		listaNombres[i] = scanner.nextLine(); 
	}
	int i = 0;
	while(i<listaNombres.length) {
		System.out.println(listaNombres[i]);
		i++;
	}
	
	do {
		System.out.println("Ingrese el índice del nombre a eliminar:  ");
		indice = scanner.nextByte();
	}while(indice < 0 || indice >= listaNombres.length );
	
	i=0;
	for (i  = indice; i<listaNombres.length - 1 ;i++) {
		listaNombres[i]=listaNombres[i + 1];
	}
	listaNombres[listaNombres.length - 1] = "";
	
	for (String elemento : listaNombres) {
		System.out.println(elemento+" ");
		
	}
	scanner.close();
	}
	
}
