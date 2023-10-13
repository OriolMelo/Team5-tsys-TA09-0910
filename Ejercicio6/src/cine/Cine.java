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
		for(int i=0; i<filas; i++) {
			//System.out.println("pos fila "+i);
			for(int j=0; j<columnas; j++) {
				//System.out.println("pos columna "+j);
				asientos[i][j] = new Asiento(fila, (char) ('A' + j));
			}
			fila--;
		}
	}
	
	public boolean asiento_libre(int fila, int columna) {
		return asientos[fila][columna].esta_libre();
	}
	
	public boolean puede_sentarse(Espectador espectador, int fila, int columna) {
		return espectador.puede_sentarse(precio_entrada, pelicula.getEdad_minima()) && asientos[fila][columna].esta_libre();
	}
	
	public void sentarse(int fila, int columna, Espectador espectador) {
		asientos[fila][columna].ocupar_asiento(espectador);
	}
	
	public void mostrar_cine() {
		pelicula.mostrar_pelicula();
		System.out.println("Precio: "+precio_entrada);
		for(int i=0; i<asientos.length; i++) {
			for(int j=0; j<asientos[0].length; j++) {
				asientos[i][j].mostrar_asiento();
			}
		}
	}
	
	private Pelicula pelicula;
	private double precio_entrada;
	private Asiento asientos[][];
}
