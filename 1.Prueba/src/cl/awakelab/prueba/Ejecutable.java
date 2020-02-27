package cl.awakelab.prueba;

public class Ejecutable extends Electrodomestico{

	public static void main(String[] args) {
		
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];

		electrodomesticos[0] = new Electrodomestico();
		electrodomesticos[1] = new Lavadora();
		electrodomesticos[2] = new Television();
		electrodomesticos[3] = new Electrodomestico();
		electrodomesticos[4] = new Lavadora();
		electrodomesticos[5] = new Television();
		electrodomesticos[6] = new Electrodomestico();
		electrodomesticos[7] = new Television();
		electrodomesticos[8] = new Electrodomestico();
		electrodomesticos[9] = new Electrodomestico();
		
		for (int i = 0; i < electrodomesticos.length; i++) {
		}
		
	}
}
