package cl.awakelab.prueba;
import java.lang.Math;
/**
 * Esta clase define los objetos Electrodomestico de tipo Television. Clase Hija
 * @author Juan Carlos Tolorza
 * @version 1.0.0
 */
public class Television extends Electrodomestico {
	//Atributos de la clase
	private int resolucion;
	private boolean tdt;
	//Constante de la clase
	private static final int RESOLUCION_DEFECTO = 20;
	private static final boolean TDT_DEFECTO = false;
	
	/**
	 * Constructor vacio que genera un objeto Electrodomestico de tipo Television, que hereda
	 * sus atributos por defecto de la clase padre.
	 * Asigna el valor por defecto a resolucion y tdt.
	 */
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEFECTO;
		this.tdt = TDT_DEFECTO;
	}
	/**
	 * Constructor que recive los valores de precio y peso, dados por el usuario, 
	 * y genera un objeto Electrodomestico de tipo television, con sus demas valores dados por
	 * defecto.
	 * @param precioBase Precio del electrodomestico
	 * @param peso   Peso del electrodomestico
	 */
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION_DEFECTO;
		this.tdt = false;
	}
	/**
	 * Constructor que recive los valores de precio, peso, color, consumo
	 * energetico,resolucion y tdt por parte del usuario y genera un objeto de tipo Electrodomestico
	 * 
	 * @param precioBase Precio del electrodomestico
	 * @param peso Peso del electrodomestico
	 * @param color Color del  electrodomestico
	 * @param consumoEnergetico Consumo energetico del electrodomestico
	 * @param resolucion Resolucion del electrodomestico
	 * @param tdt Posee o no TDT
	 */
	public Television(int precioBase, String color, char consumoEnergetico, int peso,int resolucion, boolean tdt) {
		super(precioBase, peso,color, consumoEnergetico);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	//Getters
	//Getters
	/**
	 * Devuelve la resolucion del electrodomestico
	 * 
	 * @return resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}
	/**
	 * Devuelve si posee o no un TDT
	 * 
	 * @return tdt
	 */
	public boolean isTdt() {
		return tdt;
	}
	
	/**
	 * Calcula el precio final del producto teniendo en cuenta los factores que pueden
	 * alteran el valor del mismo
	 * 
	 * @return incremento
	 */
	@Override
	public int precioFinal() {
		int incremento = super.precioFinal();
		if (resolucion > 40) {
			incremento = (int)Math.round(((incremento + (precioBase * 0.3))));
		}
		if (tdt=true) {
			incremento = incremento + 50;
		}
		return incremento;
	}
	
	@Override
	public String toString() {
		return"Television [Precio Base: " + precioBase + "]" + "[" + "Color: " + color +"]"+"["+ "Consumo Energetico: "
				+ consumoEnergetico + "]" + "[" + "Peso: " + peso +"]" +"["+ "Pulgadas: "+ resolucion+"]"+ "["+ "TDT: "+ tdt +"]"+ "[" + "Precio Final: " + precioFinal() + "]"; 
	}
}
