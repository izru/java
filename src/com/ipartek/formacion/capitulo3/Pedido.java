package com.ipartek.formacion.capitulo3;

import java.util.Scanner;

public class Pedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamburguesa burguer = new Hamburguesa();

		escribirPedido(burguer);
		hacerPedido(burguer);
		escribirPedido(burguer);

	}

	private static void escribirPedido(Hamburguesa burguer) {
		Ingrediente[] ingredientes = burguer.getIngredientes();
		System.out.println("Pedido Hamburguesas");
		System.out.println("-------------------");

		// Recorremos el array para ver su contenido
		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i].isPedido()) {
				System.out.println(ingredientes[i].getNombre() + ": " + ingredientes[i].getPrecio() + " €");
			}
		}
		System.out.println("-------------------");
		System.out.println(burguer.calcularPrecio() + " €");
	}

	private static void hacerPedido(Hamburguesa burguer) {
		Ingrediente[] ingredientes = burguer.getIngredientes();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ingredientes.length; i++) {

			if (ingredientes[i].isPedido() == false) {
				System.out.println(
						"¿Quiere añadir " + ingredientes[i].getNombre() + " a  " + ingredientes[i].getPrecio() + " €?");
				ingredientes[i].setPedido(sc.nextBoolean());

				System.out.println("¿Finalizar Pedido?");

				if (sc.nextBoolean()) {
					break;
				}

			}
		}

		sc.close();
	}

}
