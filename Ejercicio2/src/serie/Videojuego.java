package serie;

public class Videojuego implements Entregable
{

		protected String titulo;
		protected int horas_estimadas;
		protected boolean entregado;
		protected String genero;
		protected String companyia;


	public Videojuego() {
			this.titulo = "";
			this.horas_estimadas = 10;
			this.entregado = false;
			this.genero = "";
			this.companyia = "";
		}


	public Videojuego(String titulo, int horas_estimadas) {
			this.titulo = titulo;
			this.horas_estimadas = horas_estimadas;
			this.entregado = false;
			this.genero = "";
			this.companyia = "";
		}


	public Videojuego(String titulo, int horas_estimadas, String genero, String companyia) {
			this.titulo = titulo;
			this.horas_estimadas = horas_estimadas;
			this.entregado = false;
			this.genero = genero;
			this.companyia = companyia;
		}

	
	public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getHoras_estimadas() {
			return horas_estimadas;
		}

		public void setHoras_estimadas(int horas_estimadas) {
			this.horas_estimadas = horas_estimadas;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getCompanyia() {
			return companyia;
		}

		public void setCompanyia(String companyia) {
			this.companyia = companyia;
		}

		
		@Override
		public String toString() {
			return "Videojuego [titulo=" + titulo + ", horas_estimadas=" + horas_estimadas + ", entregado=" + entregado
					+ ", genero=" + genero + ", companyia=" + companyia + "]";
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
			
			if (this.horas_estimadas < ((Videojuego) a).getHoras_estimadas()) {
				esMasLargo = true;
			}

			return esMasLargo;
		}

	
	
}
