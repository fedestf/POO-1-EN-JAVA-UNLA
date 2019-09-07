package modelo;

import java.time.LocalDate;

public class Empleado extends Persona {

	private long legajo;
	private float sueldoMensual;

	public Empleado(String nombre, String apellido, long dni, LocalDate fechaNacimiento, long legajo,
			float sueldoMensual) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.legajo = legajo;
		this.sueldoMensual = sueldoMensual;
	}

}
