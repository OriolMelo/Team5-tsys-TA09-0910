package Libro;

public class LibroApp {

	public static void main(String[] args) {

		Libro libro1 = new Libro("123456789", "Harry Potter", "Autor", 1000);
		Libro libro2 = new Libro("987654231", "Encanto", "Otro", 1000);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		
		
		if(libro1.getNum_paginas() > libro2.getNum_paginas() ) {
			System.out.print(libro1.getTitulo() + " tienen mas paginas");
		}
		else if(libro2.getNum_paginas() > libro1.getNum_paginas()) {
			System.out.print(libro2.getTitulo() + " tienen mas paginas");
		}
		else {
			System.out.print(libro1.getTitulo() + " y " + libro2.getTitulo() + " tienen las mismas paginas");
		}
	}

}
