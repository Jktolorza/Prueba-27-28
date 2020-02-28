package cl.aeaklab.pruebba;
import java.lang.Math;
public class Television extends Electrodomestico {
		
	private int resolucion;
	private boolean tdt;
	private static final int RESOLUCION_DEFECTO = 20;
	
	
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEFECTO;
		this.tdt = false;
	}
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION_DEFECTO;
		this.tdt = false;
	}
	public Television(int precioBase, String color, char consumoEnergetico, int peso,int resolucion, boolean tdt) {
		super(precioBase, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	
	public int getResolucion() {
		return resolucion;
	}
	public boolean isTdt() {
		return tdt;
	}
	
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
		return"Electrodomestico [Precio Base: " + precioBase + "]" + "[" + "Color: " + color +"]"+"["+ "Consumo Energetico: "
				+ consumoEnergetico + "]" + "[" + "Peso: " + peso +"]" +"["+ "Pulgadas: "+ resolucion+"]"+ "["+ "TDT: "+ tdt +"]"+ "[" + "Precio Final: " + precioFinal() + "]"; 
	}
}
