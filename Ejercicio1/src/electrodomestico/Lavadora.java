package electrodomestico;

public class Lavadora extends Electrodomestico {

	private int carga;
	
	private final int CARGAR_BASE = 5;
	
	public Lavadora() {
		this.carga = CARGAR_BASE;
	}

	public Lavadora(double precio_base, double peso) {
		super( precio_base, peso);
		this.carga = CARGAR_BASE;
	}
	
	public Lavadora(int carga, double precio_base, String color, char consumo_energetico, double peso) {
		super( precio_base, color, consumo_energetico, peso);
		this.carga = carga;
	}
	
	public int getCargar() {
		return carga;
	}

	public void setCargar(int carga) {
		this.carga = carga;
	}
	
	public double precioFinal() {
		super.precioFinal();
		
		if(carga > 50) {
			return this.precio_base+=50;
		}
		else {
			return this.precio_base;
			}
	}

}
