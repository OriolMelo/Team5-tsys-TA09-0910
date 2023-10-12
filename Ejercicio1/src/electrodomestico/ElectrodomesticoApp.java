package electrodomestico;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		
		for(int i=0; i<electrodomesticos.length; i++) {
			electrodomesticos[i].precioFinal();
		}

	}

}
