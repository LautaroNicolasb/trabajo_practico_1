package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	
	private static ArrayList<Pais> paises;
	private static ArrayList<DestinoTuristico> destinos;
	private static Scanner scanner;
	
	public static void main(String[] args) {
		int opcion = 0;
		do {
			System.out.println("----- MENÚ -----");
			System.out.println("1 – Alta de destino turístico (para asociar el país se ingresa el código de páis).");
			System.out.println("2 – Mostrar todos los destinos turísticos.");
			System.out.println("3 – Modificar el país de un destino turístico");
			System.out.println("4 – Limpiar el ArrayList de destino turísticos.");
			System.out.println("5 – Eliminar un destino turístico (el usuario debe ingresar el código del destino turístico. Utilice Iterator). ");
			System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre.");
			System.out.println("7 – Mostrar todos los países.");
			System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país (el usuario ingresa el código de país)");
			System.out.println("9 – Salir.");
			System.out.println("Elija una opción: ");
			opcion=scanner.nextInt();
			scanner.nextLine();
		
			switch(opcion){
				case 1:
					altaDestino();break;
				case 2:
					mostrarDestino();break;
				case 3:
					modificarPaisDestino();break;
				case 4:
					limpiarListaDestino();break;
				case 5:
					eliminarDestino();break;
				case 6:
					mostrarDestinoOrdenadoNombre();break;
				case 7:
					mostrarPais();break;
				case 8:
					mostrarDestinoPais();break;
				case 9:
					System.out.println("FIN DEL PROGRAMA");break;
				default:
					System.out.println("Opción incorrecta. Por favor, ingrese una opción válida.");
			}
			
		}while(opcion!=9);
		
	}
	
	private static void precargaPais() {
		paises.add(new Pais("AAAA", "Argentina"));
		paises.add(new Pais("BBBB", "Brasil"));
		paises.add(new Pais("CCCC", "Chile"));
		paises.add(new Pais("DDDD", "Dinamarca"));
		paises.add(new Pais("EEEE", "España"));
		
	}
	
	private static void altaDestino() {
		try {
			System.out.println("----- Alta destino turístico -----");
			System.out.println("Ingrese el código país: ");
			String codigoPais = scanner.nextLine();
			Pais pais = null;
			
			for (Pais p : paises) {
				if (p.getCodigo().equals(codigoPais));
					pais = p;
				break;
			}
			if (pais != null) {
				System.out.println("Codigo: ");
				String codigoDestino = scanner.nextLine();
				System.out.println("Nombre:");
				String nombre = scanner.nextLine();
				System.out.println("Precio: ");
				double precio = scanner.nextDouble();
				System.out.println("Cantidad de días: ");
				int cantidadDias = scanner.nextInt();
				scanner.nextLine();
			    destinos.add(new DestinoTuristico(codigoDestino, nombre, precio, pais, cantidadDias));
			}else {
				System.out.println("El país con el código ingresado no existe.");
			}
		} catch (InputMismatchException e) {
	        System.out.println("Error: Entrada inválida. Por favor, ingrese datos válidos.");
	    } catch (Exception e) {
	        System.out.println("Error inesperado: " + e.getMessage());
	    }
	}
	
	private static void mostrarDestino() {
		
		if(destinos.isEmpty()) {
			System.out.println("No hay destinos turísticos.");
		}else {
			System.out.println("----- Lista destinos turísticos -----");
			for(DestinoTuristico destino : destinos) {
				System.out.println(destino);
			}
		}
	}
	
	public static void modificarPaisDestino() {
		if (destinos.isEmpty()) {
			System.out.println("No hay destinos turísticos para modificar.");
		}else {
			System.out.println("Ingrese el código del destino turístico a modificar: ");
			String codigoDestino = scanner.nextLine();
			DestinoTuristico destino = buscarDestinoPorCodigo(codigoDestino);
			if (destino != null) {
				System.out.println("Ingrese el nuevo código país: ");
				String codigoPais = scanner.nextLine();
				Pais nuevoPais = buscarPaisPorCodigo(codigoPais);
				if(nuevoPais != null) {
					destino.setPais(nuevoPais);
					System.out.println("País modificado correctamente.");
				}else {
					System.out.println("El país con el código ingresado no existe.");
				}
			}else {
				System.out.println("El destino turístico no existe.");
			}
		}
	}
	
	//busca el destino con el codigo
	public static DestinoTuristico buscarDestinoPorCodigo(String codigoDestino) {
		for(DestinoTuristico destino : destinos) {
			if (destino.getCodigo().equals(codigoDestino)) {
				return destino;
			}
		}
		return null;
	}
	//busca el pais con el codigo
	public static Pais buscarPaisPorCodigo(String codigoPais) {
		for(Pais p : paises) {
			if (p.getCodigo().equals(codigoPais)) {
				return p;
			}
		}
		return null;
	}
	
	public static void limpiarListaDestino() {
		try {
	        destinos.clear();
	        System.out.println("Lista de destinos turísticos limpiada correctamente.");
	    } catch (NullPointerException e) {
	        System.out.println("Error: La lista de destinos turísticos no ha sido inicializada.");
	    } catch (Exception e) {
	        System.out.println("Error inesperado: " + e.getMessage());
	    }
	}
	
	public static void eliminarDestino() {
		try {
	        System.out.println("Ingrese el código del destino turístico a eliminar:");
	        String codigoDestino = scanner.nextLine();
	        
	        Iterator<DestinoTuristico> iterator = destinos.iterator();
	        while (iterator.hasNext()) {
	            DestinoTuristico destino = iterator.next();
	            if (destino.getCodigo().equals(codigoDestino)) {
	                iterator.remove();
	                System.out.println("Destino turístico eliminado correctamente.");
	                return; // Salir del método después de eliminar el destino
	            }
	        }
	        System.out.println("No se encontró ningún destino turístico con el código especificado.");
	    } catch (Exception e) {
	        System.out.println("Error inesperado: " + e.getMessage());
	    }
	}
	
	public static void mostrarDestinoOrdenadoNombre() {
		try {
	        if (destinos.isEmpty()) {
	            System.out.println("No hay destinos turísticos para mostrar.");
	        }else {
						System.out.println("---- Destinos turisticos ordenados por nomoobres ----");
						destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
						destinos.forEach(d->System.out.println(d));
	        }
	    } catch (NullPointerException e) {
	        System.out.println("Error: La lista de destinos turísticos no ha sido inicializada.");
	    } catch (Exception e) {
	        System.out.println("Error inesperado: " + e.getMessage());
	    }
	}
	
	public static void mostrarPais() {
				System.out.println("---- Lista Paises ----");
						paises.forEach(p->System.out.println(p)); 
	}
	
	public static void mostrarDestinoPais() {
		 try {
		        System.out.println("Ingrese el código del país:");
		        String codigoPais = scanner.nextLine();
		        
		        Pais pais = buscarPaisPorCodigo(codigoPais);
		        if (pais != null) {
		            System.out.println("Destinos turísticos en " + pais.getNombre() + " ----- ");
		            boolean encontrado = false;
		            for (DestinoTuristico destino : destinos) {
		                if (destino.getPais().getCodigo().equals(codigoPais)) {
		                    System.out.println(destino);
		                    encontrado = true;
		                }
		            }
		            if (!encontrado) {
		                System.out.println("No hay destinos turísticos para mostrar en este país.");
		            }
		        } else {
		            System.out.println("El país con el código ingresado no existe.");
		        }
		    } catch (Exception e) {
		        System.out.println("Error inesperado: " + e.getMessage());
		    }
	}
	
}
