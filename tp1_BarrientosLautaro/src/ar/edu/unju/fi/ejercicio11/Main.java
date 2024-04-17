package ar.edu.unju.fi.ejercicio11;

import java.util.ArrayList;

public class Main {
	static ArrayList<Integer> listaNumeros = new ArrayList<>();
	
	public static void main(String[] args) {
		int j=40;
		int i=2;
		for (;j>=0;) {
			listaNumeros.add(j * i);
			j--;
			i++;
		}
		for (i = 0; i<listaNumeros.size();i++) {
			System.out.println(listaNumeros.get(i)+" ");
		}
	}
}
