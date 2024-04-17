package ar.edu.unju.fi.ejercio13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<8;i++) {
			System.out.println("Ingrese un número entero: ");
			listaNumeros.add(scanner.nextInt());
		}
		for (int i=0;i<8;i++) {
			System.out.println("Índice: "+i+" Número: "+listaNumeros.get(i));
		}
		
	}

}
