package es.academia.secretaria;

import java.time.LocalDate;

import es.academia.interfaces.Descriptible;

public class Inscripcion implements Descriptible{

	//Variables
	private Estudiante estudiante;
	private Curso curso;
	private LocalDate fecha;
	
	//Constructores
	public Inscripcion() {
		
	}

	public Inscripcion(Estudiante estudiante, Curso curso) {
		
		this.estudiante = estudiante;
		this.curso = curso;
		this.fecha = LocalDate.now();
	}
	
	
	
	public Estudiante getEstudiante() {
		return estudiante;
	}
	
	

	public Curso getCurso() {
		return curso;
	}

	//Metodos implementados
	public String getDescripcion() {
		return "El estudiante "+estudiante.getNombre()+" está en el curso "+curso.getDescripcion();
	}

	
	//toString
	@Override
	public String toString() {
		return "Inscripcion [estudiante=" + estudiante + ", curso=" + curso + ", fecha=" + fecha + "]";
	}
	
}
