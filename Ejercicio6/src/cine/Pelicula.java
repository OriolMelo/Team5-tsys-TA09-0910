package cine;

public class Pelicula {
	
	public Pelicula() {
		this.titulo = peliculas[generarAleatorio(0, peliculas.length-1)];
		this.duracion = generarAleatorio(DURACION_MINIMA, DURACION_MAXIMA);
		this.edad_minima = generarAleatorio(EDAD_MINIMA, EDAD_MAXIMA);
		this.director = directores[generarAleatorio(0, directores.length-1)];
	}

	public Pelicula(String titulo, int duracion, int edad_minima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad_minima = edad_minima;
		this.director = director;
	}


	private int generarAleatorio(int min, int max) {
		return (int)Math.floor(Math.random() * (max - min + 1) + min);
	}
	
	private String titulo;
	private int duracion;
	private int edad_minima;
	private String director;

	private String[] directores = {"Adrian", "Ainara", "Asier", "Dani", "David", 
								"Felicia", "Jordi", "Juanka", "Manel", "Marc",
								"Oriol", "Robert", "Alejandro", "Antoni", "Carla"};
	private String[] peliculas = {"La mejor peli", "Peli rara", "Obra maestra", "Empanadilla", 
								"QUE MIEDO", "Triste"};
	private final int EDAD_MINIMA = 3;
	private final int EDAD_MAXIMA = 99;
	private final int DURACION_MINIMA = 60;
	private final int DURACION_MAXIMA = 180;

}
