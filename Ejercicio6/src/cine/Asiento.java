package cine;

public class Asiento {
	
	public Asiento(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
		this.ocupado = OCUPADO_BASE;
		this.espectador = null;
	}
	
	public void ocupar_asiento(Espectador espectador) {
		this.espectador= espectador;
		ocupado=true;
	}
	
	public boolean esta_libre() {
		return !ocupado;
	}
	
	public void mostrar_asiento() {
		if(ocupado)
			System.out.println("Asiento "+fila+columna+" continene a "+ espectador.mostrar_espectador());
		else 
			System.out.println("Asiento "+fila+columna+" esta vacio");

	}
	
	private int fila;
	private char columna; 
	private boolean ocupado;
	private Espectador espectador;
	private final boolean OCUPADO_BASE = false;
}
