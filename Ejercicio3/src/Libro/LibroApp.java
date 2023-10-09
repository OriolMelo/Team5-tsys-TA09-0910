package Libro;

public class LibroApp {

	public static void main(String[] args) {

		Libro un_libro = new Libro("123456789", "El primero", "Autor", 5);
		Libro otro_libro = new Libro("987654231", "El otro", "Otro", 10);
		System.out.println("Hola");
		
		un_libro.toString();
		otro_libro.toString();
	}

}
