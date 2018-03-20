package com.ipartek.formacion.capitulo3;

public class EjercicioMesas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Listado de Mesas");
		System.out.println("----------------");
		Mesa m1 = new Mesa();
		Mesa m2 = new Mesa(1);
		Mesa m3 = new Mesa(-3);

		m1.setNumPatas(8);

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		// por defecto la fabrica mesas madera 4 patas en blanco y 1 m2
		// el cliente puede customizar
		/*
		 * patas m2 color material 8 6 negro madera 2 5 verde madera 5 7 plateado acero
		 * 3 5 amarillo alumnio 1 2 custom plastico
		 */
		Mesa izas = new Mesa(8, 6, "negro", Mesa.MATERIAL_MADERA);
		Mesa mikel = new Mesa(2, 5, "verde", Mesa.MATERIAL_MADERA);
		Mesa aingeru = new Mesa(5, 7, "plateado", Mesa.MATERIAL_ACERO);
		Mesa joseba = new Mesa(3, 5, "amarillo", Mesa.MATERIAL_ALUMINIO);
		Mesa ander = new Mesa(1, 2, "custom", Mesa.MATERIAL_PLASTICO);
		System.out.println(izas.escribirPrecio());
		System.out.println(mikel.escribirPrecio());
		System.out.println(aingeru.escribirPrecio());
		System.out.println(joseba.escribirPrecio());
		System.out.println(ander.escribirPrecio());

	}

}
