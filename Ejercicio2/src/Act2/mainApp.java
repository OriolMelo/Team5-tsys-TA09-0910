package Act2;

public class mainApp 
{
	
	public static void main(String[] args) {

		
		Serie series[] = arrayConSerie();	
		Videojuego[] videojuegos = arrayConVideojuego();
		
		
		series[0].entregar();
		series[3].entregar();
		videojuegos[1].entregar();
		videojuegos[4].entregar();
		
		
		verEntregados(series, videojuegos);
		
		videojuegoMasLargo(videojuegos);
		serieConMasTemporadas(series);

	}

	
	public static Serie[] arrayConSerie() {
		Serie series[] = 
			{ 
				new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan"), 
				new Serie("Juego de Tronos", 8, "Fantasia", " D.B. Weiss y David Benioff"),
				new Serie("Peaky Blinders", 6, "Crimen", "Steven Knight"),
				new Serie("Vikingos", 6, "Historica", "Michael Hirst"),
				new Serie("La que se avecina", 15, "Comedia", "Laura Caballero y Alberto Caballero")
			};
		
		return series;
	}

	
	public static Videojuego[] arrayConVideojuego() {
		Videojuego[] videojuegos = 
			{
				new Videojuego("Resident Evil: Dead Aim", 67),
				new Videojuego("Animal Crossing", 123, "Sandbox", "Nintendo"), 
				new Videojuego("Project Zomboid", 20),
				new Videojuego("Monster Hunter", 12),
				new Videojuego("inFamous", 50, "Sandbox", "Sucker Punch") 
			};
		
		return videojuegos;
	}

	
	public static void videojuegoMasLargo(Videojuego videojuegos[]) {
		int contVid = 0;

		Videojuego masLargo = null;

		for (int i = 0; i < videojuegos.length; i++) {
			if (videojuegos[i].isEntregado()) {
				//System.out.println(videojuegos[i].toString());
				contVid++;
			}

			if (masLargo == null) {
				masLargo = videojuegos[i];
			} else {
				if (!videojuegos[i].compareTo(masLargo)) {
					masLargo = videojuegos[i];
				}

			}
		}

		System.out.println(masLargo.toString());
	}

	
	public static void serieConMasTemporadas(Serie series[]) {
		int contSer = 0;

		Serie MasTemp = null;
		for (int i = 0; i < series.length; i++) {
			if (series[i].isEntregado()) {
				//System.out.println(series[i].toString());
				contSer++;
			}

			if (MasTemp == null) {
				MasTemp = series[i];
			} else {
				if (!series[i].compareTo(MasTemp)) {
					MasTemp = series[i];
				}

			}

		}
		System.out.println(MasTemp.toString());
	}
	
	
	public static void verEntregados(Serie series[], Videojuego videojuegos[]){
		
		int seriesEntregadas = 0;
		int videojuegosEntregados = 0;
		
		
		for(int i = 0; i < series.length; i++) {
			
			if(series[i].isEntregado()) {
				seriesEntregadas++;
				//System.out.println(series[i]);
			}
			
			
			if(videojuegos[i].isEntregado()) {
				videojuegosEntregados++;
				//System.out.println(videojuegos[i]);
			}
			
		}
		
		System.out.println("Numero de series entregadas: "+seriesEntregadas);
		System.out.println("Numero de videojuegos entregados: "+videojuegosEntregados);
		
	}

}