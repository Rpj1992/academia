package es.academia.app;

import java.util.ArrayList;

import ejercicio_comparable_comparator.ComparadorPorAnio;
import es.academia.secretaria.Curso;
import es.academia.secretaria.Estudiante;
import es.academia.secretaria.Inscripcion;
import es.academia.service.AcademiaService;

public class Main { 

	public static void main(String[] args) { //patata
		
		ComparadorPorAnio comparadorPorAnio = new ComparadorPorAnio();
		
		System.out.println("Creando cursos:");
		Curso curso1 = new Curso("Java Básico", 40, 200);
		Curso curso2 = new Curso("Python Avanzado", 60, 300);
		Curso curso3 = new Curso("Bases de datos", 30, 150);
		Curso curso4 = new Curso("Scrum Master", 120, 260);
		
		System.out.println("--------------------");
		System.out.println("Cursos creados:");
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());
		System.out.println(curso3.toString());
		System.out.println(curso4.toString());
		
		System.out.println("--------------------");
		System.out.println("Creando estudiantes:");
		Estudiante e1 = new Estudiante("Ana", 1, "ana@mail.com", 25);
		Estudiante e2 = new Estudiante("Luis", 2, "luis@mail.com", 30);
		Estudiante e3 = new Estudiante("Marta", 3, "marta@mail.com", 22);
		Estudiante e4 = new Estudiante("Pedro", 4, "pedro@mail.com", 28);
		Estudiante e5 = new Estudiante("Lucía", 5, "lucia@mail.com", 35);
		Estudiante e6 = new Estudiante("Jorge", 6, "jorge@mail.com", 27);
		Estudiante e7 = new Estudiante("Elena", 7, "elena@mail.com", 24);
		Estudiante e8 = new Estudiante("Carlos", 8, "carlos@mail.com", 32);
		Estudiante e9 = new Estudiante("Sofía", 9, "sofia@mail.com", 29);
		Estudiante e10 = new Estudiante("Andrés", 10, "andres@mail.com", 26);
		Estudiante e11 = new Estudiante("Paula", 11, "Paula@mail.com", 31);
		Estudiante e12 = new Estudiante("Diego", 12, "diego@mail.com", 23);
		
		System.out.println("--------------------");
		System.out.println("Estudiantes creados:");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println(e5.toString());
		System.out.println(e6.toString());
		System.out.println(e7.toString());
		System.out.println(e8.toString());
		System.out.println(e9.toString());
		System.out.println(e10.toString());
		System.out.println(e11.toString());
		System.out.println(e12.toString());
		
		/*
		
		System.out.println("--------------------");
		System.out.println("Creando inscripciones:");
		Inscripcion i1 = new Inscripcion(e1, curso1);
		Inscripcion i2 = new Inscripcion(e1, curso2);
		Inscripcion i3 = new Inscripcion(e2, curso3);
		Inscripcion i4 = new Inscripcion(e3, curso4);
		Inscripcion i5 = new Inscripcion(e4, curso1);
		Inscripcion i6 = new Inscripcion(e5, curso2);
		Inscripcion i7 = new Inscripcion(e6, curso3);
		Inscripcion i8 = new Inscripcion(e7, curso4);
		Inscripcion i9 = new Inscripcion(e8, curso1);
		Inscripcion i10 = new Inscripcion(e9, curso2);
		
		
		System.out.println("--------------------");
		System.out.println("Inscripciones creadas:");
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		System.out.println(i3.toString());
		System.out.println(i4.toString());
		System.out.println(i5.toString());
		System.out.println(i6.toString());
		System.out.println(i7.toString());
		System.out.println(i8.toString());
		System.out.println(i9.toString());
		System.out.println(i10.toString());
		*/
		
		System.out.println("-----------------------\n\n");
		
		
		
		ArrayList<Curso> listadoCursos = new ArrayList<Curso>();
		ArrayList<Estudiante> listadoEstudiantes = new ArrayList<Estudiante>();
		ArrayList<Inscripcion> listadoInscripciones = new ArrayList<Inscripcion>();
		
		System.out.println("LLenando listados de Cursos, Estudiantes:");
		
		AcademiaService academia = new AcademiaService(listadoCursos, listadoEstudiantes, listadoInscripciones);
		
		academia.agregarCurso(curso1);
		academia.agregarCurso(curso2);
		academia.agregarCurso(curso3);
		academia.agregarCurso(curso4);
		
		academia.agregarEstudiante(e1);
		academia.agregarEstudiante(e2);
		academia.agregarEstudiante(e3);
		academia.agregarEstudiante(e4);
		academia.agregarEstudiante(e5);
		academia.agregarEstudiante(e6);
		academia.agregarEstudiante(e7);
		academia.agregarEstudiante(e8);
		academia.agregarEstudiante(e9);
		academia.agregarEstudiante(e10);
		academia.agregarEstudiante(e11);
		academia.agregarEstudiante(e12);
		
		
		System.out.println("LLenando listado de incripciones en la academy:");
		System.out.println("--------------------");
		
		academia.inscribirEstudiante(curso1, e1);
		academia.inscribirEstudiante(curso2, e1);
		academia.inscribirEstudiante(curso3, e2);
		academia.inscribirEstudiante(curso4, e3);
		academia.inscribirEstudiante(curso1, e4);
		academia.inscribirEstudiante(curso2, e5);
		academia.inscribirEstudiante(curso3, e6);
		academia.inscribirEstudiante(curso4, e7);
		academia.inscribirEstudiante(curso1, e8);
		academia.inscribirEstudiante(curso2, e9);
		
		System.out.println("--------------------\n");
		
		System.out.println("Ejercicio 1: Mostrar todos los cursos y estudiantes e inscripciones:\n");
		academia.listarCursos();
		System.out.println("Total cursos: "+Curso.getContadorCursos());
		System.out.println("--------------------");
		academia.listarEstudiantes();
		System.out.println("Total estudiantes: "+Estudiante.getContadorEstudiantes());
		System.out.println("--------------------");
		academia.mostrarInscipciones();;
		
		System.out.println("--------------------\n");
		System.out.println("Ejercicio 2: Buscar curso por nombre:\n");
		
		
		boolean encontrado = false;
		
		do {
			String nombreBuscado = "Scrum Master";
			for (int i = 0; i < academia.getListaCursos().size(); i++) {
				if (nombreBuscado == academia.getListaCursos().get(i).getNombre()) {
					System.out.println("Curso encontrado: "+academia.getListaCursos().get(i).toString());
					encontrado = true;
				}
			}
		} while (!encontrado);
		
		System.out.println("--------------------\n");
		System.out.println("Ejercicio 3: Calcular coste total de cursos de Ana:\n");
		
		System.out.println("El coste total de cursos de Ana es: "+academia.calcularCosteEstudiante(e1));
		
		System.out.println("--------------------\n");
		System.out.println("Ejercicio 4: Eliminar cursos con precio > 250:\n");
		
		academia.eliminarCursoPorPrecio(250);
		
		academia.listarCursos();
		
		System.out.println("--------------------\n");
		System.out.println("Ejercicio 5: Comprobar equals y hashcode creando dos cursos con el mismo nombre:\n");
		
		Curso curso5 = new Curso("Java Básico", 40, 200);
		
		academia.agregarCurso(curso5);
		
		System.out.println("Es "+curso1.getNombre()+" equals que "+curso5.getNombre()+"? "+curso1.equals(curso5));
		System.out.println("Hashcode de curso1: "+curso1.hashCode());
		System.out.println("Hashcode de curso5: "+curso5.hashCode());
		
	}

}
