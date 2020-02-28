package cl.awakelab.prueba;

import java.util.*;

/**
 * Clase Main del programa. Manipula las clases generadas.
 * 
 * @author Juan Carlos Tolorza
 * @version 1.0.0
 */
public class Ejecutable {

	public static void main(String[] args) {
		// Atributos de la clase
		int totalElectrodomesticos = 0;
		int totalLavadoras = 0;
		int totalTelevision = 0;
		// Metodos

		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		// Orden de modificacion Electrodomestico: precio, peso, color, consumo.
		// Orden de modificacion Lavadora: precio, peso, color, consumo, carga.
		// Orden de modificacion Television: precio, peso, color, consumo, resolucion,
		// tdt.
		electrodomesticos[0] = new Electrodomestico(10000, 50, "blanco", 'A');
		electrodomesticos[1] = new Lavadora(100000, 25, "cafe", 'b', 100);
		electrodomesticos[2] = new Television(40000, 50, "Negro", 'B', 60,false);
		electrodomesticos[3] = new Electrodomestico(60000, 3, "rojo", 'D');
		electrodomesticos[4] = new Lavadora(500000, 100);
		electrodomesticos[5] = new Television(5000,43,"rojo",'A',50,true);
		electrodomesticos[6] = new Electrodomestico();
		electrodomesticos[7] = new Television(400000, 28);
		electrodomesticos[8] = new Electrodomestico(1000000, 100, "negro", 'A');
		electrodomesticos[9] = new Electrodomestico(80000, 3);

		escribir("Electrodomesticos");
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Electrodomestico) {
				if (electrodomestico instanceof Electrodomestico != electrodomestico instanceof Television
						&& electrodomestico instanceof Electrodomestico != electrodomestico instanceof Lavadora) {
					int precio = ((Electrodomestico) electrodomestico).precioFinal();
					totalElectrodomesticos += precio;
					escribir(" " + electrodomestico);
				}
			}
		}

		escribir("Televisores");
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Television) {
				int precio = ((Television) electrodomestico).precioFinal();
				totalElectrodomesticos += precio;
				totalTelevision += precio;
				escribir(" " + electrodomestico);
			}
		}

		escribir("Lavadoras");
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Lavadora) {
				int precio = ((Lavadora) electrodomestico).precioFinal();
				totalElectrodomesticos += precio;
				totalLavadoras += precio;
				escribir("  " + electrodomestico);

			}
		}

		escribir("Precio total Televisores: $" + totalTelevision);
		escribir("Precio total de lavadoras: $" + totalLavadoras);
		escribir("Precio total de los electrodomesticos: $" + totalElectrodomesticos);

	}

	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
}
