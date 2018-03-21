package com.ipartek.formacion.capitulo3;

public class Hamburguesa {
	private static Ingrediente ingredientes[];

	public Hamburguesa() {
		super();
		ingredientes = generarIngredientes();
		solicitarIngrediente("Pan");
		solicitarIngrediente("Carne");

	}

	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		Hamburguesa.ingredientes = ingredientes;
	}

	public void solicitarIngrediente(String nomIngrediente) {
		for (int i = 0; i < ingredientes.length; i++) {
			if (nomIngrediente.equals(ingredientes[i].getNombre())) {
				ingredientes[i].setPedido(true);
				break;
			}
		}
	}

	/**
	 * Calcula en que posicion del array esta el material
	 * 
	 * @param valor
	 *            int, valor del material
	 * @return int, devuelve la posicion dentro del array
	 */
	public static int buscarPos(String nomIngrediente) {
		int result = 0;
		for (int i = 0; i < ingredientes.length; i++) {
			if (nomIngrediente.equals(ingredientes[i].getNombre())) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static Ingrediente buscarIngrediente(String nomIngrediente) {
		Ingrediente result = new Ingrediente();
		for (int i = 0; i < ingredientes.length; i++) {
			if (nomIngrediente.equals(ingredientes[i].getNombre())) {
				result = ingredientes[i];
				break;
			}
		}
		return result;
	}

	public Ingrediente[] generarIngredientes() {
		// Creamos un array de objetos
		Ingrediente[] resultado = new Ingrediente[6];
		// Creamos objetos en cada posicion
		resultado[0] = new Ingrediente("Pan", 0.3f);
		resultado[1] = new Ingrediente("Carne", 0.7f);
		resultado[2] = new Ingrediente("Tomate", 0.5f);
		resultado[3] = new Ingrediente("Lechuga", 0.25f);
		resultado[4] = new Ingrediente("Pepino", 0.3f);
		resultado[5] = new Ingrediente("Queso", 0.7f);
		return resultado;
	}

	public float calcularPrecio() {
		float resultado = 0;
		Ingrediente[] ingredientes = Hamburguesa.ingredientes;

		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i].isPedido())
				resultado += ingredientes[i].getPrecio();
		}

		return resultado;

	}

}
