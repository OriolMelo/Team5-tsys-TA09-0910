package electrodomestico;

public class Television extends Electrodomestico {
		private double resolucion;
		private boolean sintonizador;

		public Television() {
			super();
			this.resolucion = 20;
			this.sintonizador = false;
		}

		public Television(double precio_base, double peso) {
			super(precio_base, peso);
			this.resolucion = 20;
			this.sintonizador = false;
		}

		public Television(double precio_base, String color, char consumo_energetico, double peso, double resolucion,
				boolean sintonizador) {
			super(precio_base, color, consumo_energetico, peso);
			this.resolucion = resolucion;
			this.sintonizador = sintonizador;
		}

		public double getResolucion() {
			return resolucion;
		}

		public boolean getSintonizador() {
			return sintonizador;
		}

		public void setResolucion(double resolucion) {
			this.resolucion = resolucion;
		}

		public void setSintonizador(boolean sintonizador) {
			this.sintonizador = sintonizador;
		}

	
		public double precioFinal() {
			
			double precio_final=super.precioFinal();
			
			if (resolucion >= 40) {
				precio_final += (this.precio_base * 0.3);
			}

			if (sintonizador == true) {
				precio_final += 50;
			}
			
			return precio_final;	 
		}

		
		@Override
		public String toString() {
			return super.toString() + "\n └» Television [resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
		}
}