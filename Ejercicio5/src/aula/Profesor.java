package aula;

import java.util.Random;

public class Profesor extends Persona{
	
	private String materia;
	private boolean disponible;
	

	public Profesor(String nombre, int edad, char sexo, String materia, boolean disponible) {
		super(nombre, edad, sexo);
		this.registroAusencia();
		listaMateria();
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
	
	public void listaMateria() {
		String[] materias =  {"matematicas", "filosofia", "fisica"};
		for(int i=0; i<materias.length; i++) {
			this.materia =  materias[i];
		}
		
		Random ran = new Random(); 

		this.materia = materias[ran.nextInt(3)];
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
