package modelo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Persona {
	private String nombre;
	private String apellido;
	private long dni;
	private LocalDate fechaNacimiento;

	public Persona(String nombre, String apellido, long dni, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	public int calcularEdad(LocalDate fecha) {
		int edad = 0;
		int mes = fechaNacimiento.getMonthValue();
		int mes2 = fecha.getMonthValue();
		int dia = fechaNacimiento.getDayOfMonth();
		int dia2 = fecha.getDayOfMonth();

		if (mes > mes2) {
			edad = fecha.getYear() - fechaNacimiento.getYear();
		}

		if (mes < mes2) {
			edad = (fecha.getYear() - fechaNacimiento.getYear()) - 1;
		}

		if (mes == mes2) {
			if (dia < dia2) {
				edad = (fecha.getYear() - fechaNacimiento.getYear()) - 1;
			}
		}

		if (mes == mes2) {
			if (dia >= dia2) {
				edad = fecha.getYear() - fechaNacimiento.getYear();
			}
		}

		return edad;
	}

}
