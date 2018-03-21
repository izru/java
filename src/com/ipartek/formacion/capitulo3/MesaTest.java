package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MesaTest {

	@Test
	public void testMesa() {
		Mesa m = new Mesa();
		assertEquals("Patas deberian ser 4 x defecto", 4, m.getNumPatas());
		assertEquals("Color deberian ser blanco x defecto", "blanco", m.getColor());
		assertEquals("Dimension deberian ser 1 x defecto", 1, m.getDimension());
		assertEquals("Material deberian ser 1(madera) x defecto", m.MATERIAL_MADERA, m.getMaterial());
	}

	@Test
	public void testMesaInt() {
		final int MATERIAL_NO_EXISTENTE = -1;
		Mesa m = new Mesa(MATERIAL_NO_EXISTENTE);
		assertEquals("Material inexistente", MATERIAL_NO_EXISTENTE, m.getMaterial());

		Mesa m2 = new Mesa(Mesa.MATERIAL_MADERA);
		assertEquals(Mesa.MATERIAL_MADERA, m2.getMaterial());
	}

	@Test
	public void testMesaIntIntStringInt() {
		// fail("Not yet implemented");
	}

	@Test
	public void testSetNumPatas() {
		Mesa m = new Mesa();
		m.setNumPatas(5);
		assertEquals("Deben ser 5 patas", 5, m.getNumPatas());

		m.setNumPatas(0);
		assertEquals("Si ponen 0, deben ser 1 patas", 1, m.getNumPatas());

		m.setNumPatas(-5);
		assertEquals("Si ponen negativos, deben ser 1 patas", 1, m.getNumPatas());
	}

	@Test
	public void testGetPrecio() {
		final int PRECIO_BASE = 13;
		Mesa m = new Mesa();
		int precio = 0;
		assertEquals("Una mesa por defecto es 13", PRECIO_BASE, m.getPrecio());

		// color
		m.setColor(Mesa.PRECIO_COLOR_NAME_CUSTOM);
		assertEquals("Una mesa custom por defecto es 13+23", PRECIO_BASE + Mesa.PRECIO_COLOR_CUSTOM, m.getPrecio());

		m.setColor("rojo");
		assertEquals("Una mesa rojo por defecto es 13", PRECIO_BASE, m.getPrecio());

		// materiales
		m.setMaterial(Mesa.MATERIAL_ACERO);
		precio = PRECIO_BASE - Mesa.PRECIO_MATERIAL_MADERA + Mesa.PRECIO_MATERIAL_ACERO;
		assertEquals("Una mesa rojo por defecto es " + precio, precio, m.getPrecio());

		/*
		 * for (int i = 0; i < arrayMateriales.length; i++) { if (valor ==
		 * (arrayMateriales[i].getValor())) { result = i; break; } }
		 */
		// dimension
		m = new Mesa();
		int nuevaDimension = 5;
		m.setDimension(nuevaDimension);
		precio = PRECIO_BASE + (Mesa.PRECIO_M2 * m.getDimension()) - (1 * Mesa.PRECIO_M2);
		assertEquals("Una mesa con dimension 5 debe ser " + precio, precio, m.getPrecio());

		// numero de patas
		m = new Mesa();
		int numPatas = 8;
		m.setNumPatas(numPatas);
		precio = PRECIO_BASE + (Mesa.PRECIO_PATA * numPatas) - (4 * Mesa.PRECIO_PATA);
		assertEquals("Una mesa con 8 patas debe ser " + precio, precio, m.getPrecio());

	}

}
