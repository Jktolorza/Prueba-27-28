package cl.awakelab.prueba;
/**
 * Clase Main del programa.
 * Manipula las clases generadas.
 * @author Juan Carlos Tolorza
 * @version 1.0.0
 */
public class Ejecutable extends Electrodomestico{

	public static void main(String[] args) {
		//Atributos de la clase
		int totalElectrodomesticos = 0;
		int totalLavadoras =0;
		int totalTelevision = 0;
		//Metodos
		
		
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		
		
		electrodomesticos[0] = new Electrodomestico(10000,50,"blanco",'A');
		electrodomesticos[1] = new Lavadora();
		electrodomesticos[2] = new Television();
		electrodomesticos[3] = new Electrodomestico();
		electrodomesticos[4] = new Lavadora();
		electrodomesticos[5] = new Television();
		electrodomesticos[6] = new Electrodomestico();
		electrodomesticos[7] = new Television();
		electrodomesticos[8] = new Electrodomestico();
		electrodomesticos[9] = new Electrodomestico();
		
		System.out.println("Electrodomesticos");
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Electrodomestico) {
				if (electrodomestico instanceof Electrodomestico != electrodomestico instanceof Television &&
						electrodomestico instanceof Electrodomestico != electrodomestico instanceof Lavadora) {
					int precio = ((Electrodomestico) electrodomestico).precioFinal();
					totalElectrodomesticos += precio;
					System.out.println(" "+electrodomestico);
				}
			}
		}
			
		System.out.println("Televisores");
		for (Electrodomestico electrodomestico: electrodomesticos) {
			if(electrodomestico instanceof Television) {
				int precio = ((Television) electrodomestico).precioFinal();
				totalElectrodomesticos += precio;
				totalTelevision += precio;
				System.out.println(" "+electrodomestico);
			}
		}
		
		System.out.println("Lavadoras");
        for(Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico instanceof Lavadora) {
                int precio = ((Lavadora) electrodomestico).precioFinal();
                totalElectrodomesticos += precio;
                totalLavadoras += precio;
                System.out.println("  " + electrodomestico);
        
            }
        }
        
        System.out.println("Precio total de lavadoras: "+totalLavadoras);
        System.out.println("Precio total Televisores: "+totalTelevision);
        System.out.println("Precio total de los electrodomesticos: "+totalElectrodomesticos);
	}
}

