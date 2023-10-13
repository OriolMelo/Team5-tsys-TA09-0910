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
		return ocupado;
	}
	
	private int fila;
	private char columna; 
	private boolean ocupado;
	private Espectador espectador;
	private final boolean OCUPADO_BASE = false;
}
