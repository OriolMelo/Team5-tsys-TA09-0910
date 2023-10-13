package cine;
import java.util.Random;
import javax.swing.JOptionPane;

public class CineApp {

	public static void main(String[] args) {
		Pelicula peli = new Pelicula();
		String nfilas = JOptionPane.showInputDialog("Introduce el numero de filas");
		String ncolumnas = JOptionPane.showInputDialog("Introduce el numero de columnas");
		String precio = JOptionPane.showInputDialog("Introduce el precio del cine");
		int filas = Integer.parseInt(nfilas);
		int columnas = Integer.parseInt(ncolumnas);
		Cine cine=new Cine(peli, Double.parseDouble(precio), filas, columnas);
		

		String espectadores = JOptionPane.showInputDialog("Introduce el numero de espectadores");
		int espectadores_añadidos = 0;
		while(espectadores_añadidos<filas*columnas && espectadores_añadidos < Integer.parseInt(espectadores)) {
			Espectador esp = new Espectador();
			int fila_espectador = 0;
			int columna_espectador = 0;
			do {
		        Random ran = new Random(); 
			
				fila_espectador = ran.nextInt(filas);
				columna_espectador = ran.nextInt(columnas);
				System.out.println("fila espectador :"+ fila_espectador);
				System.out.println("columna_espectador :" + columna_espectador);
				
			}while(!cine.asiento_libre(fila_espectador, columna_espectador));
			
			if(cine.puede_sentarse(esp, fila_espectador, columna_espectador)) {
				cine.sentarse(fila_espectador, columna_espectador, esp);
			}
			espectadores_añadidos++;
		}

		cine.mostrar_cine();
	}

}
