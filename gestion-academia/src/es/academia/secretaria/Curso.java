package es.academia.secretaria;

import java.util.Objects;

import es.academia.interfaces.Costeable;
import es.academia.interfaces.Descriptible;

public class Curso implements Costeable, Descriptible{
	
	//Constantes
	private final double DESCUENTO = 0.20;
	//Variables
	private static int contadorCursos;
	private String nombre;
	private int duracionHoras;
	private double precio;
	
	//Constructores
	public Curso() {
		contadorCursos++;
	}

	public Curso(String nombre, int duracionHoras, double precio) {
		this.nombre = nombre;
		this.duracionHoras = duracionHoras;
		setPrecio(precio);
		contadorCursos++;
	}
	
	//Getters
	public double getDESCUENTO() {
		return DESCUENTO;
	}

	public static int getContadorCursos() {
		return contadorCursos;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDuracionHoras() {
		return duracionHoras;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}
	
	public static void setContadorCursos(int contadorCursos) {
		Curso.contadorCursos = contadorCursos;
	}

	public void setPrecio(double precio) {
		double precioMinimo = 50;
		int horasDescuento = 250;
		
		if (precio >= precioMinimo) {
			if (duracionHoras > horasDescuento) {
				this.precio = precio * (1-DESCUENTO);
			} else {
				this.precio = precio;
			}
		} else {
			System.out.println("El precio no puede ser inferior a "+precioMinimo+" euros.");
			System.out.println("Se fija el precio en "+precioMinimo+" euros");
			this.precio = precioMinimo;
		}
		
	}

	//Metodos propios implementados de la interfaz.
	public double getPrecio() {
		int numHorasDescuento = 100;
		int horasDescuetoAplicado = 250;
		
		if (duracionHoras > numHorasDescuento && duracionHoras < horasDescuetoAplicado) {
			double precioFinal = precio * (1-DESCUENTO); 
			return precioFinal;
		} else {
			return precio;
		}
		
	}
	
	public String getDescripcion() {
		return "El curso "+nombre+" consta de "+duracionHoras+" horas.";
	}

	//Hashcode y equals
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(nombre, other.nombre);
	}

	//toString
	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", duracionHoras=" + duracionHoras + ", precio="
				+ getPrecio() + "]";
	}
	
}
