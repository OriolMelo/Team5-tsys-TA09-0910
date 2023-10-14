package aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AulaApp {

	public static void main(String[] args) {
		    List<Estudiante> estudiantes = new ArrayList<>();
	        List<Aula> aulas = new ArrayList<>();
	        Profesor profesor = new Profesor("Hanna", 43, 'F', "filosofia", true);
	        
	            Estudiante estudiante = new Estudiante("Marc", 23, 'M', 8, true);
	            
	            int calificacionDeEstudiante = estudiante.getCalificacion();
	            System.out.print(calificacionDeEstudiante);
	            
	        

	            Aula aula = new Aula(3, 4, "filosofia");
	            aulas.add(aula);
	            
	            aula.anadirEstudiantes(estudiantes);
	            aula.anadirProfesor(profesor);
	            
	            if(aula.isPuedeDarClase()) {
	            	System.out.print("puede dar clase");
	            }
	            else System.out.print("No puede dar clase");
	        
	            aula.sacarNotas();
	}

}
