package electrodomestico;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(400, 20);
		Electrodomestico e3 = new Electrodomestico(130, "NEGRO", 'T', 600);
		Television t1 = new Television();
		Television t2 = new Television(700, 15);
		Television t3 = new Television(450, "azul", 'C', 23, 40, true);
		Television t4 = new Television();
		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora(120, 30);
		Lavadora l3 = new Lavadora(70, 300, "Gris", 'A', 10);

		Electrodomestico[] electrodomesticos = new Electrodomestico[] {e1, e2, e3, t1, t2, t3, t4, l1, l2, l3};
		
		double precio_total = 0;
		double precio_televisores = 0;
		double precio_lavadoras = 0;
		for(int i=0; i<electrodomesticos.length; i++) {
			precio_total += electrodomesticos[i].precioFinal();
			if(electrodomesticos[i] instanceof Television) {
				precio_televisores += electrodomesticos[i].precioFinal();
			}
			else if(electrodomesticos[i] instanceof Lavadora) {
				precio_lavadoras += electrodomesticos[i].precioFinal();
			}
		}
		
		System.out.println("Suma del precio de los televisores: "+precio_televisores);
		System.out.println("Suma del precio de las lavadoras: "+precio_lavadoras);
		System.out.println("Suma del precio de los electrodomésticos: "+precio_total);

	}

}
