package Libro;

public class Libro 
{

		private String ISBN;
		private String Titulo;
		private String Autor;
		private int num_paginas;
		
				
		public Libro() 
		{
			this.ISBN = "";
			this.Titulo = "";
			this.Autor ="";
			this.num_paginas = 10;
		}
		
		
		public Libro(String iSBN, String titulo, String autor, int num_paginas) 
		{
			this.ISBN = iSBN;
			this.Titulo = titulo;
			this.Autor = autor;
			this.num_paginas = num_paginas;
		}


		@Override
		public String toString() {
			return " El "+Titulo+" con el ISBN  " + ISBN +  " creado por " + Autor + " tiene " + num_paginas + " paginas. ";
		}
		
		
		public String getISBN() {
			return ISBN;
		}
		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}
		public String getTitulo() {
			return Titulo;
		}
		public void setTitulo(String titulo) {
			Titulo = titulo;
		}
		public String getAutor() {
			return Autor;
		}
		public void setAutor(String autor) {
			Autor = autor;
		}
		public int getNum_paginas() {
			return num_paginas;
		}
		public void setNum_paginas(int num_paginas) {
			this.num_paginas = num_paginas;
		}
		
	
}
