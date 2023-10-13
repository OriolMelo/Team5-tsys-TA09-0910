package cine;

public class Cine {
	
	public Cine(Pelicula pelicula, double precio_entrada, int filas, int columnas) {
		this.pelicula = pelicula;
		this.precio_entrada = precio_entrada;
		llenar_cine(filas, columnas);
	}

	public void llenar_cine(int filas, int columnas) {
		asientos = new Asiento[filas][columnas];
		int fila = filas;
		for(int i=0; i<filas; i--) {
			for(int j=0; j<columnas; j++) {
				asientos[i][j] = new Asiento(fila, (char) ('A' + j));
			}
			fila--;
		}
		
	}
	
	public boolean puede_sentarse(Espectador espectador, Asiento asiento) {
		return espectador.puede_sentarse(precio_entrada, pelicula.getEdad_minima()) && asiento.esta_libre();
	}
	
	private Pelicula pelicula;
	private double precio_entrada;
	private Asiento asientos[][];
}
