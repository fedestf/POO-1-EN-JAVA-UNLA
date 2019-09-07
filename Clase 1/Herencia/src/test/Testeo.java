package test;
import java.time.LocalDate;

import modelo.*;

public class Testeo {

	public static void main(String[] args) {
		
		Persona fede = new Persona ("Federico","Lopez",39096762L,LocalDate.of(1995,9,7 )); //AAAA-MM-DD
		
		System.out.println(fede.calcularEdad(LocalDate.now()));
		
		System.out.println(fede.getFechaNacimiento().getMonthValue());
	}

}
