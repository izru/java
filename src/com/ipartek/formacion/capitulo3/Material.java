package com.ipartek.formacion.capitulo3;

public class Material {
	private String nombre;
	private int valor;
	private int precio;

	public Material() {
		super();
		this.nombre = "";
		this.valor = 0;
		this.precio = 0;
	}

	public Material(String nombre, int valor, int precio) {
		this();
		this.nombre = nombre;
		this.valor = valor;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
