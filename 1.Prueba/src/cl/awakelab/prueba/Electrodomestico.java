package cl.aeaklab.pruebba;
public class Electrodomestico {
	// Atributos
		protected int precioBase;
		protected String color;
		protected char consumoEnergetico;
		protected int peso;

		// Constantes por defecto
		private static final int PRECIO_DEFECTO = 100000;
		private static final String COLOR_DEFECTO = "Blanco";
		private static final char CONSUMO_DEFECTO = 'F';
		private static final int PESO_DEFECTO = 5;

		// Metodo de comprobacion color y consumo (no visibles)
		private void comprobarConsumo(char letra) {
			Character.toUpperCase(letra);
			if (letra <= 70 && letra >= 65) {//Tabla ascci
				this.consumoEnergetico = consumoEnergetico;// Valor dado
			} else {
				this.consumoEnergetico = CONSUMO_DEFECTO;
			}
		}

		private void comprobarColor(String color) {
			boolean coincide = false;
			String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
			for (int i = 0; i < colores.length && !coincide; i++) {
				if (colores[i].equals(color)) {
					coincide = true;
				}
			}
			if (coincide) {
				this.color = color;
			} else {
				this.color = COLOR_DEFECTO;
			}

		}

		// Constructores
		
		public Electrodomestico() {
			this.precioBase = PRECIO_DEFECTO;
			this.peso = PESO_DEFECTO;
			this.color = COLOR_DEFECTO;
			this.consumoEnergetico = CONSUMO_DEFECTO;
		}

		public Electrodomestico(int precioBase, int peso) {
			this();
			this.precioBase = precioBase;
			this.peso = peso;
		}

		public Electrodomestico(int precioBase, int peso, String color, char consumoEnergetico) {
			this(precioBase, peso);
			comprobarColor(color);
			comprobarConsumo(consumoEnergetico);
		}

		// Metodos (visibles)
		// Getters

		public int getPrecioBase() {
			return precioBase;
		}

		
		public String getColor() {
			return color;
		}

		public char getConsumoEnergetico() {
			return consumoEnergetico;
		}

		public int getPeso() {
			return peso;
		}

		public static int getPrecioDefecto() {
			return PRECIO_DEFECTO;
		}

		public static String getColorDefecto() {
			return COLOR_DEFECTO;
		}

		public static char getConsumoDefecto() {
			return CONSUMO_DEFECTO;
		}

		public static int getPesoDefecto() {
			return PESO_DEFECTO;
		}

		// Metodo que calcula el precio final del producto
		public int precioFinal() {
			int incremento = 0;
			// Sobrecargo por consumo
			switch (consumoEnergetico) {
			case 'A':
				incremento += 100;
				break;
			case 'B':
				incremento += 80;
				break;
			case 'C':
				incremento += 50;
				break;
			case 'E':
				incremento += 30;
				break;
			case 'F':
				incremento += 10;
				break;
			}
			// Sobrecargo por oeso
			if (peso >= 0 && peso <= 19) {
				incremento += 10;
			} else {
				if (peso >= 20 && peso <= 49) {
					incremento += 50;
				} else {
					if (peso >= 50 && peso <= 79) {
						incremento += 80;
					} else {
						if (peso > 80) {
							incremento += 100;
						}
					}
				}
			}
			return precioBase + incremento;
		}

		@Override
		public String toString() {
			return "Electrodomestico [Precio Base: " + precioBase + "]" + "[" + "Color: " + color +"]"+"["+ "Consumo Energetico: "
					+ consumoEnergetico + "]" + "[" + "Peso: " + peso +"]" +"[" + "Precio Final: " + precioFinal() + "]";
		}
}
