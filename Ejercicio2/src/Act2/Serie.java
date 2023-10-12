package Act2;

public class Serie implements Entregable
{
	
		protected String titulo;
		protected int num_temporadas;
		protected boolean entregado;
		protected String genero;
		protected String creador;

	
		public Serie() {
			this.titulo = "";
			this.num_temporadas = 3;
			this.entregado = false;
			this.genero = "";
			this.creador = "";
		}
		
		
		public Serie(String titulo, String creador) {
			this.titulo = titulo;
			this.num_temporadas = 3;
			this.entregado = false;
			this.genero = "";
			this.creador = creador;
		}	
		
		
		public Serie(String titulo, int numTemporadas, String genero, String creador) {
			this.titulo = titulo;
			this.num_temporadas = numTemporadas;
			this.entregado = false;
			this.genero = genero;
			this.creador = creador;
		}

	
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		

		public int getNum_temporadas() {
			return num_temporadas;
		}


		public void setNum_temporadas(int num_temporadas) {
			this.num_temporadas = num_temporadas;
		}


		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getCreador() {
			return creador;
		}

		public void setCreador(String creador) {
			this.creador = creador;
		}

		
		@Override
		public String toString() {
			return "Serie [titulo=" + titulo + ", numTemporadas=" + num_temporadas + ", entregado=" + entregado + ", genero="
					+ genero + ", creador=" + creador + "]";
		}

		
		public boolean entregar() {
			return true;
		}

		public boolean devolver() {
			return false;
		}

		public boolean isEntregado() {

			return this.entregado;
		}
		
		
		public boolean compareTo(Object a) {

			boolean esMasLargo = false;
			
			if (this.num_temporadas < ((Serie) a).getNum_temporadas()) {
				esMasLargo = true;
			}

			return esMasLargo;
		}

	

	
}
