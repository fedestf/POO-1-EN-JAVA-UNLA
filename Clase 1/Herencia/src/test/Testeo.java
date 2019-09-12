package test;

import java.time.LocalDate;

import modelo.*;

public class Testeo {

	public static void main(String[] args) {

		Persona fede = new Persona("Federico", "Lopez", 39096762L, LocalDate.of(1995, 7, 9)); // AAAA-MM-DD
		Persona p1 = new Empleado("Nicolas", "Inchausti", 41091553L, LocalDate.of(1998, 04, 20), 02, 18000f);
		Persona p2 = new Cliente("Roberto", "Rodriguez", 38658369L, LocalDate.of(1996, 5, 24), "22-38658369-0", 10000F);

		System.out.println(fede.calcularEdad(LocalDate.now()));
		System.out.println(fede.getFechaNacimiento().getMonthValue());
		System.out.println(p1.calcularEdad(LocalDate.now()));

		// casteo para consultar edad
		Empleado empleado = (Empleado) p1;
		System.out.println(empleado.calcularSueldo(3));
		System.out.println(p1.toString());

		Cliente cliente = (Cliente) p2;
		System.out.println(cliente.estadoCredito());
	}

}

// preguntar sobre el casteo y sobre el toString para todo completo