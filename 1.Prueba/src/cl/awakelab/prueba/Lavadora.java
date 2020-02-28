package cl.awakelab.prueba;

/**
 * Esta clase define los objetos Electrodomestico de tipo Lavadora. Clase Hija
 * 
 * @author Juan Carlos Tolorza
 * @version 1.0.0
 */
import cl.awakelab.prueba.Electrodomestico;

public class Lavadora extends Electrodomestico {
	// Atributos de la clase
	protected int carga;
	// Constante de la clase
	private static final int CARGA_DEFECTO = 5;

	/**
	 * Constructor vacio que genera un objeto Electrodomestico de tipo lavadora, que
	 * hereda sus atributos por defecto de la clase padre. Asigna el valor por
	 * defecto a carga.
	 */
	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
	}

	/**
	 * Constructor que recive los valores de precio y peso, dados por el usuario, y
	 * genera un objeto Electrodomestico de tipo lavadora, con sus demas valores
	 * dados por defecto.
	 * 
	 * @param precioBase Precio del electrodomestico
	 * @param peso       Peso del electrodomestico
	 */
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFECTO;
	}

	/**
	 * Constructor que recive los valores de precio, peso, color y consumo y genera
	 * un objeto Electrodomestico de tipo lavadora.
	 * 
	 * @param precioBase        Precio del electrodomestico
	 * @param peso              Peso del electrodomestico
	 * @param color             Color del electrodomestico
	 * @param consumoEnergetico Consumo del electrodomestico
	 * @param carga             Carga del electrodomestico
	 */
	public Lavadora(int precioBase, int peso, String color, char consumoEnergetico, int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}

	// Getters
	/**
	 * Devuelve la carga del electrodomestico
	 * 
	 * @return carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Calcula el precio final del producto teniendo en cuenta los factores que
	 * pueden alteran el valor del mismo
	 * 
	 * @return incremento
	 */
	@Override
	public int precioFinal() {
		int incremento = super.precioFinal();
		if (carga > 30) {
			incremento = incremento + 50;
		}
		return incremento;
	}

	@Override
	public String toString() {
		return "Lavadora [Precio Base: $" + precioBase + "]" + "[" + "Color: " + color + "]" + "["
				+ "Consumo Energetico: " + consumoEnergetico + "]" + "[" + "Peso: " + peso + "]" + "[" + "Carga: "
				+ carga + "]" + "[" + "Precio Final: $" + precioFinal() + "]";
	}

}
