package es.academia.secretaria;

import java.util.Objects;

public class Estudiante {
	
	//Variables
	private static int contadorEstudiantes;
	private String nombre;
	private int id;
	private String email;
	private int edad;
	
	//Constructores
	public Estudiante() {
		contadorEstudiantes++;
	}

	public Estudiante(String nombre, int id, String email, int edad) {
		this.nombre = nombre;
		this.id = id;
		this.email = email;
		this.edad = edad;
		contadorEstudiantes++;
	}
	
	//Getters
	public static int getContadorEstudiantes() {
		return contadorEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public int getEdad() {
		return edad;
	}

	//Setters
	public static void setContadorEstudiantes(int contadorEstudiantes) {
		Estudiante.contadorEstudiantes = contadorEstudiantes;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Hascode y equals
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return id == other.id;
	}

	//toString
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", id=" + id + ", email=" + email + ", edad=" + edad + "]";
	}
	
	
	
	
}
