package aula;

import java.util.Random;

public class Profesor extends Persona{
	
	private String materia;
	private boolean disponible;

	public Profesor(String nombre, int edad, char sexo, String materia, boolean asistencia) {
		super(nombre, edad, sexo);
		this.registroAusencia();
		this.materia = listaMateria();
	}
	

	public String getMateria() {
		return materia;
	}
	

	public void setMateria(String materia) {
		this.materia = materia;
	}



	@Override
	public void registroAusencia() {
		Random random = new Random();
		int randomNumber = random.nextInt(99)+1;
		setDisponible(true);
		
		if(randomNumber < 20) {
			setDisponible(false);
		}
	}
	
	public String listaMateria() {
		String[] materiales =  {"matenaticas", "filosofia", "fisica"};
		for(int i=0; i<materiales.length; i++) {
			this.materia =  materiales[i];
		}
		return materia;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean asistencia) {
		this.disponible = asistencia;
	}

}
