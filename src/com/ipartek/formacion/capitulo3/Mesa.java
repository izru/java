//1.definicion package
package com.ipartek.formacion.capitulo3;

//2. imports
//3.definicion de la clase
public class Mesa {
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERIAL_MADERA = 4;
	final int PRECIO_MATERIAL_ACERO = 6;
	final int PRECIO_MATERIAL_ALUMINIO = 5;
	final int PRECIO_MATERIAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOM = "custom";
	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERO = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_PLASTICO = 4;

	// 4.atributos son siempre private para mantener la encapsulacion
	private int numPatas; // al ser privado, no nos deja acceder desde fuera de la clase
	private int dimension;// metros cuadrados
	private String color;
	private int material;

	/*
	 * 5.metodos 5.1 constructores 5.2 getters/setters 5.3 otros metodos
	 */
	// 5.1 constructores
	public Mesa() {
		super();
		this.numPatas = 4;
	}

	/**
	 * Sirve para documentar con JavaDoc
	 * 
	 * @author IR
	 * @param numPatas
	 *            int en caso de ser negativo se inicializa con 0
	 */

	public Mesa(int numPatas) {
		super();
		// this.numPatas = numPatas;
		this.setNumPatas(numPatas);
	}

	// 5.2 getters/setters
	public int getNumPatas() {
		return this.numPatas;
	}

	/**
	 * Cambio el numero de patas
	 * 
	 * @param numPatas
	 */
	public void setNumPatas(int numPatas) {
		this.numPatas = (numPatas < 0) ? 0 : numPatas;
	}

	// 5.3 otros metodos
	public int getPrecio(int patas, int m2, int color, int material) {
		int precio = 0;
		precio += patas * PRECIO_PATA;
		precio += m2 * PRECIO_M2;

		return precio;
	}

	@Override
	public String toString() {
		return "Mesa [numPatas=" + numPatas + "]";
	}

}
