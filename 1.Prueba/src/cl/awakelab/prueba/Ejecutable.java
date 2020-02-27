package cl.awakelab.prueba;

public class Ejecutable {

	public static void main(String[] args) {
		
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];

		electrodomesticos[0] = new Electrodomestico();
		electrodomesticos[1] = new Lavadora();
		electrodomesticos[2] = new Television();
		System.out.println(electrodomesticos[0].toString());
		System.out.println(electrodomesticos[1].toString());
		System.out.println(electrodomesticos[2].toString());
	}
}
