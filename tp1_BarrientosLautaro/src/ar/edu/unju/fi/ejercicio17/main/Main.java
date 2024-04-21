package ar.edu.unju.fi.ejercicio17.main;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
		private static Scanner scanner;
		private static ArrayList<Jugador> jugadores;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("*****MENÚ JUGADORES*****");
			System.out.println("1 - Alta de jugador");
			System.out.println("2 - Mostrar los datos del jugador");
			System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
			System.out.println("4 - Modificar los datos de un jugador");
			System.out.println("5 - Eliminar un jugador");
			System.out.println("6 - Mostrar la cantidad total de jugadores que tiene el Arraylist");
			System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
			System.out.println("8 - Salir");
			System.out.println("=========================");
			System.out.println("Ingrese una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 1:
				altaJugador();break;
			case 2:
				mostrarDatosJugador();break;
			case 3:
				mostrarJugadoresOrdenado();break;
			case 4:
				modificarDatosJugador();break;
			case 5:
				eliminarJugador();break;
			case 6:
				mostrarTotalJugadores();break;
			case 7:
				mostrarCantidadPorNacionalidad();break;
			case 8:
				System.out.println("FIN DEL PROGRAMA");break;
			default:
				System.out.println("Opción incorrecta. Por favor, ingrese una opción válida.");
			}
			
		}while(opcion != 8);
		scanner.close();
	}	
	
		public static void altaJugador() {
			jugadores = new ArrayList<>();
			try {
				System.out.println("---- Alta de jugador ----");
				System.out.println("Ingrese datos del jugador:");
				System.out.println("Nombre: ");
		        String nombre = scanner.nextLine();
		        System.out.println("Apellido: ");
		        String apellido = scanner.nextLine();
		        System.out.println("Fecha de nacimiento(en formato AAAA-MM-DD): ");
		        String fechaNacimiento = scanner.nextLine();
		        System.out.println("Nacionalidad:");
		        String nacionalidad = scanner.nextLine();
		        System.out.println("Estatura:");
		        double estatura = scanner.nextDouble();
		        System.out.println("Peso:");
		        double peso = scanner.nextDouble();
		        scanner.nextLine(); // Limpiar el buffer de entrada
		        System.out.println("Posición:");
		        String posicion = scanner.nextLine();
		        jugadores.add(new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion));
		        System.out.println("Alta de jugador exitosa.");
			}catch(InputMismatchException e) {
				System.out.println("Error: Se esperaba un valor numérico para estatura o peso.");
			}catch(DateTimeParseException e) {
				System.out.println("Error: Formato de fecha incorrecto. Use el formato AAAA-MM-DD.");
			}catch(NoSuchElementException e) {
				System.out.println("Error: No se encontraron más tokens en la entrada.");
			}catch(IllegalStateException e) {
				System.out.println("Error: Problema con el estado del Scanner.");
			}catch(Exception e) {
				System.out.println("Error inesperado: "+e.getMessage());
			}
		}
		
		
		public static void mostrarDatosJugador() {
			 try {
					System.out.println("----- Datos del Jugador -----");
					System.out.println("Ingrese el nombre: ");
					String nombre = scanner.nextLine();
					System.out.println("Ingrese el apellido: ");
					String apellido = scanner.nextLine();
					boolean jugadorEncontrado=false;
					for (Jugador jugador : jugadores) {
						 if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
							 System.out.println(jugador.toString());
							 jugadorEncontrado=true;
							 break;
						 }
					}
					if (!jugadorEncontrado) {
						System.out.println("El jugador no se encontró en la lista.");
					}
			 }catch(NoSuchElementException e) {
				 System.out.println("No se econtraron más tokens en la entrada.");
			 }catch(Exception e) {
				 System.out.println("Error inesperado: "+e.getMessage());
			 }
			
		}
		
		
		public static void mostrarJugadoresOrdenado() {
			  try {
					System.out.println("---- Jugadores ordenados por apellido ----");
					jugadores.sort(Comparator.comparing(Jugador::getApellido));
					jugadores.forEach(j->System.out.println(j));
			  }catch(NullPointerException e){
				  System.out.println("Error: La lista de jugadores no ha sido inicializada.");
			  }catch(Exception e) {
				  System.out.println("Error: "+e.getMessage());
			  }
		}
		
		public static void modificarDatosJugador() {
			try {	
				System.out.println("<<<<<Modificar datos del jugador>>>>>");
				System.out.println("Ingrese el nombre del jugador: ");
				String nombre = scanner.nextLine();
				System.out.println("Ingrese el apellido del jugador: ");
				String apellido = scanner.nextLine();
				
				boolean jugadorEncontrado = false;
				for(Jugador jugador : jugadores) {
					if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
						System.out.println("*****Ingrese los nuevos datos del jugador*****");
						System.out.println("Fecha Nacimiento: ");
						String fechaNacimiento = scanner.nextLine();
						jugador.setFechaNacimiento(fechaNacimiento);
						System.out.println("Nacionalidad: ");
						String nacionalidad = scanner.nextLine();
						jugador.setNacionalidad(nacionalidad);
						System.out.println("Estatura: ");
						double estatura = scanner.nextDouble();
						jugador.setEstatura(estatura);
						System.out.println("Peso: ");
						double peso = scanner.nextDouble();
						jugador.setPeso(peso);
						System.out.println("Posición: ");
						String posicion = scanner.nextLine();
						jugador.setPosicion(posicion);
						System.out.println("Se modificó el jugador");
						jugadorEncontrado = true;
						break;
					}
				}
				
				if (!jugadorEncontrado) {
					System.out.println("El jugador no se econtró en la lista.");
				}
				
			}catch(InputMismatchException e) {
				System.out.println("Error: Se esparaba un valor numérico para estatura o peso."); 
			}catch(Exception e) {
				System.out.println("Error inespaerado: "+e.getMessage());
			}
		}
		
		
		public static void eliminarJugador() {
			try {
				System.out.println("*****Eliminar un jugador*****");
				Iterator<Jugador> iterator = jugadores.iterator();
				System.out.println("Ingrese el nombre del jugador: ");
				String nombre = scanner.nextLine();
				System.out.println("Ingrese el apellido: ");
				String apellido = scanner.nextLine();
				boolean jugadorEncontrado = false;
				while (iterator.hasNext()) {
					Jugador jugador = iterator.next();
					if(jugador.getNombre().equals(jugador) && jugador.getApellido().equals(jugador)) {
						iterator.remove();
						System.out.println("Se eliminó el jugador"+jugador);
						jugadorEncontrado = true;
					}
				}
				if (!jugadorEncontrado) {
					System.out.println("No se econtró el jugador en la lista.");
				}
			}catch(Exception e) {
				System.out.println("Error inesperado: "+e.getMessage());
			}
		}
		
		public static void mostrarTotalJugadores() {
			try {
				System.out.println("-----Total de jugadores-----");
				jugadores.forEach(j->System.out.println(j));
			}catch(NullPointerException e) {
				System.out.println("Error: La lista de jugadores no ha sido unicializada.");
			}catch(Exception e){
				System.out.println("Error inesperado: "+e.getMessage());
			}
		}
		
		public static void mostrarCantidadPorNacionalidad() {
			try {
				int contador = 0;
				System.out.println("----- Cantidad de jugadores por por nacionalidad -----");
				System.out.println("Ingrese la nacionalidad: ");
				String nacionalidad = scanner.nextLine();
				for (Jugador jugador : jugadores) {
					if(jugador.getNacionalidad().equals(nacionalidad)) {
						contador++;
					}
				}
				
				System.out.println("Cantidad de jugadores de "+nacionalidad+" es: "+contador);
			}catch(NullPointerException e) {
				System.out.println("Error: La lista de jugadores no ha sido unicializada.");
			}catch(Exception e){
				System.out.println("Error inesperado: "+e.getMessage());
			}
	
		}
	

}
