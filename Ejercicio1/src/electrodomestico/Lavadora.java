package electrodomestico;

public class Lavadora extends Electrodomestico {

	private int carga;
	
	private final int CARGA_BASE = 5;
	
	public Lavadora() {
		this.carga = CARGA_BASE;
	}

	public Lavadora(double precio_base, double peso) {
		super( precio_base, peso);
		this.carga = CARGA_BASE;
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
		double precio_final = super.precioFinal();
		
		if(carga > 50) {
			return precio_final+=50;
		}
		else {
			return precio_final;
			}
	}

}
