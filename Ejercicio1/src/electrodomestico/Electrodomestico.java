package electrodomestico;

public class Electrodomestico {
	
	protected double precio_base;
	protected String color;
	protected char consumo_energetico;
	protected double peso;
	

	private final double PRECIO_BASE = 100;
	private final String COLOR_BASE = "blanco";
	private final char CONSUMO_BASE = 'F';
	private final double PESO_BASE = 5;
	
	
	
	
	public Electrodomestico() {
		this.precio_base = PRECIO_BASE;
		this.color = COLOR_BASE;
		this.consumo_energetico = CONSUMO_BASE;
		this.peso = PESO_BASE;
	}

	public Electrodomestico(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.color = COLOR_BASE;
		this.consumo_energetico = CONSUMO_BASE;
		this.peso = peso;
	}

	public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
		this.peso = peso;
	}

	public double getPrecio_base() {
		return precio_base;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public char comprobarConsumoEnergetico(char letra) {
		if(letra < 'A' || letra > 'F'){
			letra = CONSUMO_BASE;
		}
		return letra;
	}

	public String comprobarColor(String color) {
		String colores[]=  new String[]{"blanco", "negro", "rojo", "azul", "gris"};
		boolean encontrado = false;
		int i=0;
		while(i < colores.length && !encontrado) {
			if(color.toLowerCase().equals(colores[i])) {
				encontrado = true;
			}
			else {
				i++;
			}
		}
		if(!encontrado) {
			color = COLOR_BASE;
		}
		return color.toLowerCase();
	}
	
	public double precioFinal() {
		double precio_final = this.precio_base;
		switch(consumo_energetico) {
			case 'A':
				precio_final+=100;
				break;
			case 'B':
				precio_final+=80;
				break;
			case 'C':
				precio_final+=60;
				break;
			case 'D':
				precio_final+=50;
				break;
			case 'E':
				precio_final+=30;
				break;
			case 'F':
				precio_final+=10;
				break;
		}
		if(peso >= 0 && peso <=19) {
			precio_final+=10;
		}
		else if(peso >= 20 && peso <=49) {
			precio_final+=50;
		}
		else if(peso >= 50 && peso <=79) {
			precio_final+=80;
		}
		else if(peso >= 80) {
			precio_final+=100;
		}
		
		
		return precio_final;
	}

	 public static void main(String[] args) {
		
		 Electrodomestico nevera = new Electrodomestico(600, "negro", 'A', 50);
		 System.out.println(nevera.comprobarConsumoEnergetico('2'));
		 System.out.println(nevera.comprobarColor("GRis"));
		 nevera.precioFinal();
	 }
 
}
