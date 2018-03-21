package com.ipartek.formacion.capitulo3;

public class Ingrediente {
	private String nombre;
	private float precio;
	private boolean pedido;

	// Constructores
	public Ingrediente() {
		super();
		this.nombre = "";
		this.precio = 0;
		this.pedido = false;
	}

	public Ingrediente(String nombre, float precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public boolean isPedido() {
		return pedido;
	}

	public void setPedido(boolean pedido) {
		this.pedido = pedido;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
