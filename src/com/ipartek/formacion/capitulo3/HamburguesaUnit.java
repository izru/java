package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class HamburguesaUnit {

	@Test
	public void testHamburguesa() {
		Hamburguesa h = new Hamburguesa();
		int numero = 0;
		for (int i = 0; i < h.getIngredientes().length; i++) {
			numero = (h.getIngredientes()[i].isPedido()) ? numero + 1 : numero;
		}
		assertEquals("Hamburguesa x defecto 2 elementos seleccionados", 2, numero);

		numero = 0;
		final String PAN = "Pan";
		final String CARNE = "Carne";

		for (int i = 0; i < h.getIngredientes().length; i++) {
			if (PAN.equals(h.getIngredientes()[i].getNombre()) || CARNE.equals(h.getIngredientes()[i].getNombre())) {
				numero = (h.getIngredientes()[i].isPedido()) ? numero + 1 : numero;
			}
		}
		assertEquals("Hamburguesa x defecto es pan y carne elementos seleccionados", 2, numero);
	}

	@Test
	public void testGetIngredientes() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIngredientes() {
		fail("Not yet implemented");
	}

	@Test
	public void testSolicitarIngrediente() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuscarIngrediente() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerarIngredientes() {
		fail("Not yet implemented");
	}

	@Test
	public void calcularPrecio() {
		Hamburguesa h = new Hamburguesa();
		float precio = 0;
		final String PAN = "Pan";
		final String CARNE = "Carne";

		for (int i = 0; i < h.getIngredientes().length; i++) {
			if (PAN.equals(h.getIngredientes()[i].getNombre()) || CARNE.equals(h.getIngredientes()[i].getNombre())) {
				precio = (h.getIngredientes()[i].isPedido()) ? h.getIngredientes()[i].getPrecio() + precio : precio;
			}
		}
		assertEquals("Hamburguesa precio x defecto ", 1.0f, h.calcularPrecio(), 0.001);

		Hamburguesa completa = new Hamburguesa();

		for (int i = 0; i < completa.getIngredientes().length; i++) {
			completa.getIngredientes()[i].setPedido(true);
		}
		assertEquals("Hamburguesa precio x defecto ", 2.75f, completa.calcularPrecio(), 0.001);
	}

}
