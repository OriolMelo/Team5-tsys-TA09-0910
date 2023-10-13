package cine;

public class Espectador {

	public Espectador() {
		this.nombre = nombres[generarAleatorio(0, nombres.length-1)];
		this.edad = generarAleatorio(EDAD_MINIMA, EDAD_MAXIMA);
		this.dinero = (double)generarAleatorio(DINERO_MINIMO, DINERO_MAXIMO);
	}
	
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	public boolean puede_sentarse(double precio_entrada, int edad_requerida) {
		return (dinero>=precio_entrada && edad>=edad_requerida);
	}
	
	
	private int generarAleatorio(int min, int max) {
		return (int)Math.floor(Math.random() * (max - min + 1) + min);
	}
	
	private String nombre;
	private int edad;
	private double dinero;
	
	
	private String[] nombres = {"Adrian", "Ainara", "Asier", "Dani", "David", 
								"Felicia", "Jordi", "Juanka", "Manel", "Marc",
								"Oriol", "Robert", "Alejandro", "Antoni", "Carla"};
	private final int EDAD_MINIMA = 3;
	private final int EDAD_MAXIMA = 99;
	private final int DINERO_MINIMO = 0;
	private final int DINERO_MAXIMO = 50;
}
