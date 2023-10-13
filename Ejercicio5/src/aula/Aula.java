package aula;

public class Aula {
	private int identificador;
	private int maximoEstudiante;
	private String materia;
	private boolean puedeDarClase;
	private double notas;
	
	private Profesor profesor;
	private Estudiante estudiante;
	private Estudiante[] estudiantes;
	
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
	
	public boolean calcularAsistenciaEstudiantes(){
		int calcularEstudiantes = 0;
		for(int i=0; i<estudiantes.length; i++) {
			if(estudiante.isDisponible()) {
				calcularEstudiantes++;
			}
		}
		double calcularmetad = estudiantes.length * 0.5;
		if(calcularEstudiantes > calcularmetad ) {
			return true;
		}
		return false;
	}
	
	public void sacarNotas() {
		if(isPuedeDarClase() && getNotas() > 5) {
			System.out.print("aprobado");
		}
		else System.out.print("No aprobado");
	}

	public boolean isPuedeDarClase() {
		return puedeDarClase;
	}

	public void setPuedeDarClase(boolean puedeDarClase) {
		this.puedeDarClase = puedeDarClase;
	}
	

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

}
