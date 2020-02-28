package cl.awakelab.prueba;

/**
 * Esta clase define los objetos Electrodomestico. SuperClase
 * 
 * @author Juan Carlos Tolorza
 * @version 1.0.0
 */
public class Electrodomestico {
	// Atributos de la clase
	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;

	// Constantes de la clase
	/** Valor del precio por defecto */
	private static final int PRECIO_DEFECTO = 100000;
	/** Valor del color por defecto */
	private static final String COLOR_DEFECTO = "blanco";
	/** Valor del consumo por defecto */
	private static final char CONSUMO_DEFECTO = 'F';
	/** Valor del peso por defecto */
	private static final int PESO_DEFECTO = 5;

	// Constructores

	/**
	 * Constructor vacio que genera un objeto de tipo Electrodomestico con todos los
	 * valores de sus atributos dados por defecto
	 */
	public Electrodomestico() {
		this.precioBase = PRECIO_DEFECTO;
		this.peso = PESO_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMO_DEFECTO;
	}

	/**
	 * Constructor que recive los valores de precio y peso, dados por el usuario, y
	 * genera un objeto de tipo Electrodomestico, con sus demas valores dados por
	 * defecto
	 * 
	 * @param precioBase Precio del electrodomestico
	 * @param peso   Peso del electrodomestico
	 */
	public Electrodomestico(int precioBase, int peso) {
		this();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * Constructor que recive los valores de precio, peso, color y consumo
	 * energetico por parte del usuario y genera un objeto de tipo Electrodomestico
	 * 
	 * @param precioBase Precio del electrodomestico
	 * @param peso Peso del electrodomestico
	 * @param color Color del  electrodomestico
	 * @param consumoEnergetico Consumo energetico del electrodomestico
	 */
	public Electrodomestico(int precioBase, int peso, String color, char consumoEnergetico) {
		this(precioBase, peso);
		comprobarColor(color);
		comprobarConsumo(consumoEnergetico);
	}

	// Getters
	/**
	 * Devuelve el precio del electrodomestico
	 * 
	 * @return precioBase
	 */
	public int getPrecioBase() {
		return precioBase;
	}

	/**
	 * Devuelve el color del electrodomestico
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Devuelve el consumo energetico del electrodomestico
	 * 
	 * @return consumoEnergetico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Devuelve el peso del electrodomestico
	 * 
	 * @return peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Devuelve el precio por defecto del electrodomestico
	 * 
	 * @return PRECIO_DEFECTO
	 */
	public static int getPrecioDefecto() {
		return PRECIO_DEFECTO;
	}

	/**
	 * Devuelve el color por defecto del electrodomestico
	 * 
	 * @return COLOR_DEFECTO
	 */
	public static String getColorDefecto() {
		return COLOR_DEFECTO;
	}

	/**
	 * Devuelve el consumo por defecto del electrodomestico
	 * 
	 * @return CONSUMO_DEFECTO
	 */
	public static char getConsumoDefecto() {
		return CONSUMO_DEFECTO;
	}

	/**
	 * Devuelve el peso por defecto del electrodomestico
	 * 
	 * @return PESO_DEFECTO
	 */
	public static int getPesoDefecto() {
		return PESO_DEFECTO;
	}

	/**
	 * Calcula el precio final del producto teniendo en cuenta los factores que pueden
	 * alteran el valor del mismo
	 * 
	 * @return precioFinal
	 */
	public int precioFinal() {
		int incremento = 0;
		int precioFinal = 0;
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
		precioFinal = precioBase + incremento;
		// Sobrecargo por peso
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
		precioFinal = precioBase + incremento;
		return precioFinal;
	}

	/**
	 * Comprueba que la letra ingresado por el usuario pertenezca a la lista de
	 * consumos. De ser asi se le asignara el valor ingresado por el usuario. De lo
	 * contrario se le asignara el valor por defecto
	 * 
	 * @param letra Letra ingresado por el usuario
	 */
	private void comprobarConsumo(char letra) {
		char letraa = Character.toUpperCase(letra);
		if (letra <= 70 && letra >= 65) {// Tabla ascci
			this.consumoEnergetico = letraa;// Valor dado
		} else {
			this.consumoEnergetico = CONSUMO_DEFECTO;
		}
	}

	/**
	 * Comprueba que el color ingresado por el usuario pertenezca a la lista de
	 * colores. De ser asi se le asignara el valor ingresado por el usuario. De lo
	 * contrario se le asignara el valor por defecto
	 * 
	 * @param color Color ingresado por el usuario
	 */
	private void comprobarColor(String color) {
		color.toLowerCase();
		boolean coincide = false;
		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
		for (int i = 0; i < colores.length && !coincide; i++) {
			colores[i] = colores[i].toLowerCase();
			if (colores[i].equals(color.toLowerCase())) {
				coincide = true;
			}
		}
		if (coincide) {
			this.color = color.toLowerCase();
		} else {
			this.color = COLOR_DEFECTO;
		}

	}

	@Override
	public String toString() {
		return "Electrodomestico [Precio Base: " + precioBase + "]" + "[" + "Color: " + color + "]" + "["
				+ "Consumo Energetico: " + consumoEnergetico + "]" + "[" + "Peso: " + peso + "]" + "["
				+ "Precio Final: " + precioFinal() + "]";
	}
}
