package es.academia.service;

import java.util.ArrayList;
import java.util.Iterator;

import es.academia.secretaria.Curso;
import es.academia.secretaria.Estudiante;
import es.academia.secretaria.Inscripcion;

public class AcademiaService {
	
	private ArrayList<Curso> listaCursos = new ArrayList<Curso>();
	private ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
	private ArrayList<Inscripcion> listaInscripciones = new ArrayList<Inscripcion>();
	
	
	public AcademiaService(ArrayList<Curso> listaCursos, ArrayList<Estudiante> listaEstudiantes,
			ArrayList<Inscripcion> listaInscripciones) {
		
		this.listaCursos = listaCursos;
		this.listaEstudiantes = listaEstudiantes;
		this.listaInscripciones = listaInscripciones;
	}
	
	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public ArrayList<Inscripcion> getListaInscripciones() {
		return listaInscripciones;
	}



	public void agregarCurso(Curso c) {
		listaCursos.add(c);
	}
	
	public void agregarEstudiante(Estudiante e) {
		listaEstudiantes.add(e);
	}
	
	public void inscribirEstudiante(Curso c, Estudiante e) {
		Inscripcion inscripcion = new Inscripcion(e, c);
		listaInscripciones.add(inscripcion);
	}
	
	public void listarCursos() {
		for (int i = 0; i < listaCursos.size(); i++) {
			System.out.println(listaCursos.get(i).toString());
		}
	}
	
	public void listarEstudiantes() {
		for (Estudiante estudiante : listaEstudiantes) {
			System.out.println(estudiante.toString());
		}
	}
	
	public void mostrarInscipciones() {
		Iterator<Inscripcion> iterador = listaInscripciones.iterator();
		
		while (iterador.hasNext()) {
			Inscripcion inscripcion = iterador.next();
			System.out.println(inscripcion.toString());
		}
	}
	
	public double calcularCosteEstudiante(Estudiante e) {
		double sumaInscripciones = 0;
			for (Inscripcion inscripcion : listaInscripciones) {
				if (inscripcion.getEstudiante().equals(e)) {
					sumaInscripciones = inscripcion.getCurso().getPrecio() + sumaInscripciones;
				}
			}
		return sumaInscripciones;
	}
	
	public void eliminarCursoPorPrecio(double x) {
	
		Iterator<Curso> iterador = listaCursos.iterator();
		
		while (iterador.hasNext()) {
			Curso curso = iterador.next();
			
			if (curso.getPrecio()> x) {
				iterador.remove();
			}
			
		}
	}
	
	public ArrayList<Estudiante> listarEstudiantesSinCurso() {
		ArrayList<Estudiante> listaEstudiantesSinCurso = new ArrayList<Estudiante>();
		
		
		Iterator<Estudiante> iteradorEstudiantes = listaEstudiantes.iterator();
		
		while (iteradorEstudiantes.hasNext()) {
			Estudiante estudiante = iteradorEstudiantes.next();
			boolean esta = false;
			
			Iterator<Inscripcion> iteradorInscipciones = listaInscripciones.iterator();
			
			while (iteradorInscipciones.hasNext()) {
				Inscripcion inscripcion = (Inscripcion) iteradorInscipciones.next();
				
				if (inscripcion.getEstudiante().equals(estudiante)) {
					esta = true;
					break;
				} 
				
				
			}
			
			if (!esta) {
				listaEstudiantesSinCurso.add(estudiante);
			}
			
		}
		
		return listaEstudiantesSinCurso;
	}
	
}
