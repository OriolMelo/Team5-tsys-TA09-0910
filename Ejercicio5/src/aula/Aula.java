package aula;

import java.util.ArrayList;
import java.util.List;

public class Aula {
	private int identificador;
	private int maximoEstudiante;
	private String materia;
	private boolean puedeDarClase;
	
	private Profesor profesor;
	private Estudiante estudiante;
    List<Estudiante> estudiantes = new ArrayList<>();
	
	public Aula(int identificador, int maximoEstudiante, String materia) {
		this.identificador = identificador;
		this.maximoEstudiante = maximoEstudiante;
		this.materia = materia;
		
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getMaximoEstudiante() {
		return maximoEstudiante;
	}
	public void setMaximoEstudiante(int maximoEstudiante) {
		this.maximoEstudiante = maximoEstudiante;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void puedeDarClase(){
		setPuedeDarClase(false);
		if (profesor.getMateria().equals(this.materia) && profesor.isDisponible() && calcularAsistenciaEstudiantes() )  {
			setPuedeDarClase(true);
        }

	}
	
	public void anadirEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public void anadirProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public boolean calcularAsistenciaEstudiantes(){
		int calcularEstudiantes = 0;
		for(int i=0; i<estudiantes.size(); i++) {
			if(estudiantes.get(i).isDisponible()) {
				calcularEstudiantes++;
			}
		}
		double calcularmetad = estudiantes.size() * 0.5;
		if(calcularEstudiantes > calcularmetad ) {
			return true;
		}
		return false;
	}
	
	public void sacarNotas() {
		int contadorChicos = 0;
		int contadorChicas = 0;
		for(int i=0; i<estudiantes.size(); i++) {
			
			if(estudiantes.get(i).getCalificacion()>=5) {
				//System.out.println("aprobado");
				if(estudiantes.get(i).getSexo() == 'M') {
					contadorChicos++;
				}
				else if(estudiantes.get(i).getSexo() == 'F') {
					contadorChicas++;
				}
				
			}
			/*else if(estudiantes.get(i).getCalificacion()<5) {
				//System.out.print("No aprobadooo");
				}*/

		}
		System.out.println("Hay " + contadorChicos + " chicos " + " y " + contadorChicas + " chicas " + " Aprobados ");
	}

	public boolean isPuedeDarClase() {
		puedeDarClase();
		return puedeDarClase;
	}

	public void setPuedeDarClase(boolean puedeDarClase) {
		this.puedeDarClase = puedeDarClase;
	}
	

	/*public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double notas) {
		this.calificacion = notas;
	}*/

}
