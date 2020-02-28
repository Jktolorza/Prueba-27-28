package cl.aeaklab.pruebba;

import cl.aeaklab.pruebba.Electrodomestico;

public class Lavadora extends Electrodomestico {
	protected int carga;
	private static final int CARGA_DEFECTO = 5;
	
	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
	}
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFECTO;
	}
	public Lavadora(int carga,int precioBase, int peso, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}
	
	public int getCarga() {
		return carga;
	}
	
	@Override
	public int precioFinal() {
		int incremento = super.precioFinal();
		if (carga>30) {
			incremento = incremento + 50;
		}
		return incremento;
	}
	
	@Override
	public String toString() {
		return "Lavadora [Precio Base: " + precioBase + "]" + "[" + "Color: " + color +"]"+"["+ "Consumo Energetico: "
				+ consumoEnergetico + "]" + "[" + "Peso: " + peso +"]" +"[" + "Carga: " +carga + "]"+"[" + "Precio Final: " + precioFinal() + "]";
	}
	
	
	
	
	
}
