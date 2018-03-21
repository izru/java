package com.ipartek.formacion.capitulo3;

import java.util.Scanner;

public class ConfiguradorMesas {
	static int patas;
	static String color;
	static int material;
	static int dimension;
	static int precio;
	public static Material arrayMateriales[];
	static int posArray;

	public static void main(String[] args) {
		// Creamos un array de objetos
		arrayMateriales = new Material[4];
		// Creamos objetos en cada posicion
		arrayMateriales[0] = new Material("Madera", Mesa.MATERIAL_MADERA, Mesa.PRECIO_MATERIAL_MADERA);
		arrayMateriales[1] = new Material("Acero", Mesa.MATERIAL_ACERO, Mesa.MATERIAL_ACERO);
		arrayMateriales[2] = new Material("Aluminio", Mesa.MATERIAL_ALUMINIO, Mesa.MATERIAL_ALUMINIO);
		arrayMateriales[3] = new Material("Plastico", Mesa.MATERIAL_PLASTICO, Mesa.PRECIO_MATERIAL_PLASTICO);

		// Recorremos el array para ver su contenido

		/*
		 * for (int i = 0; i < arrayMateriales.length; i++) { System.out.println(
		 * arrayMateriales[i].getNombre() + arrayMateriales[i].getPrecio() +
		 * arrayMateriales[i].getValor()); }
		 */

		System.out.println("Configurador de mesas");
		System.out.println("---------------------");

		pedirDatos();
		calcularValoresTicket();
		imprimirTicket();
	}

	private static void imprimirTicket() {
		System.out.println("-----------------------------");
		System.out.println("----Resumen------------------");
		System.out.println("-----------------------------");
		System.out.println(
				"Patas     " + patas + " ud a " + Mesa.PRECIO_PATA + "€/ud ___ " + patas * Mesa.PRECIO_PATA + " €");
		System.out.println("Material  " + arrayMateriales[posArray].getNombre() + " _________ "
				+ arrayMateriales[posArray].getPrecio() + "€");
		System.out.println(
				"Dimension " + dimension + " m2 a " + Mesa.PRECIO_M2 + "€/m2 _____" + dimension * Mesa.PRECIO_M2 + "€");
		if (color.equals(Mesa.PRECIO_COLOR_NAME_CUSTOM)) {
			System.out.println("Color     " + color + " extra " + Mesa.PRECIO_COLOR_CUSTOM + "€");
		} else {
			System.out.println("Color     " + color);
		}
		System.out.println("-----------------------------");
		System.out.println("Precio _________________ " + precio + "€");
	}

	/**
	 * Pide los datos necesarios
	 */
	private static void pedirDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Numero de patas? ");
		patas = sc.nextInt();

		System.out.println("¿Color?");
		color = sc.next();

		System.out.println("¿Material (1=Madera, 2=Acero, 3=Aluminio, 4=Plastico)?");
		material = sc.nextInt();

		System.out.println("¿Dimensiones (m2)?");
		dimension = sc.nextInt();

		sc.close();
	}

	/**
	 * Realiza las operaciones internas necesarias para calcular los valores que
	 * metemos al ticket
	 */
	private static void calcularValoresTicket() {
		Mesa mesa = new Mesa(patas, dimension, color, material);
		precio = mesa.getPrecio();
		posArray = buscarPosMaterial(material);
	}

	/**
	 * Calcula en que posicion del array esta el material
	 * 
	 * @param valor
	 *            int, valor del material
	 * @return int, devuelve la posicion dentro del array
	 */
	private static int buscarPosMaterial(int valor) {
		int result = 0;
		for (int i = 0; i < arrayMateriales.length; i++) {
			if (valor == (arrayMateriales[i].getValor())) {
				result = i;
				break;
			}
		}
		return result;
	}

}
