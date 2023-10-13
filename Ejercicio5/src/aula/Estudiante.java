package aula;

import java.util.Random;

public class Estudiante extends Persona {
	private int calificacion;
	private boolean disponible;

	public Estudiante(String nombre, int edad, char sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
		this.registroAusencia();
	}
	

	public int getCalificacion() {
		return calificacion;
	}



	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}



	@Override
	public void registroAusencia() {
		Random random = new Random();
		int randomNumber = random.nextInt(99)+1;
		disponible = true;
		
		if(randomNumber < 50) {
			disponible = false;
		}
			
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
