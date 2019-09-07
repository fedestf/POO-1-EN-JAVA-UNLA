package modelo;

import java.time.LocalDate;

public class Cliente extends Persona {

	private String cuit;
	private float limiteCredito;

	public Cliente(String nombre, String apellido, long dni, LocalDate fechaNacimiento, String cuit,
			float limiteCredito) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.cuit = cuit;
		this.limiteCredito = limiteCredito;
	}

}
