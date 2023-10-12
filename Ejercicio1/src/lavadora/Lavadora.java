package lavadora;

import electrodomestico.Electrodomestico;

public class Lavadora extends Electrodomestico {

	private int cargar;
	
	private final int CARGAR_BASE = 5;
	
	public Lavadora() {
		this.cargar = CARGAR_BASE;
	}

	public Lavadora(double precio_base, double peso) {
		super( precio_base, peso);
		this.cargar = CARGAR_BASE;
	}
	
	public Lavadora(int cargar, double precio_base, String color, char consumo_energetico, double peso) {
		super( precio_base, color, consumo_energetico, peso);
		this.cargar = CARGAR_BASE;
	}
	
	public int getCargar() {
		return cargar;
	}

	public void setCargar(int cargar) {
		this.cargar = cargar;
	}
	
	public double precioFinal() {
		super.precioFinal();
		
		if(cargar > 50) {
			return this.precio_base+=50;
		}
		else {
			return this.precio_base;
			}
	}

}
