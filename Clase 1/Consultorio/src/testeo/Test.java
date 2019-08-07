package testeo;
import modelo.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creacion de paciente nuevo + prueba y concatenacion de los valores
		Paciente paciente1 = new Paciente ("Federico","Lopez",1.78F,90F);
		Paciente paciente2 = new Paciente ("Agustin","Gutierrez",1.78F,70F);
		System.out.println(paciente1.getNombre() +" "+ paciente1.getApellido());
		System.out.println(paciente1.traerNombreCompleto());
		
		//prueba del medico primer visita
		
		Medico medico1 =new Medico ("Roberto","Lopez","Nutricionista");
		System.out.println("-------------VISITA 1-----------------------");
		System.out.println("MEDICO:"+medico1.traerNombreMed());
		System.out.println("PACIENTE: "+paciente1.traerNombreCompleto()+" IMC: "+medico1.calcularIMC(paciente1));
		System.out.println("PACIENTE: "+paciente2.traerNombreCompleto()+" IMC: "+medico1.calcularIMC(paciente2));
		
		// altero el peso de los pacientes antes de hacer el calculo de nuevo
		paciente1.setPeso(100F);
		paciente2.setPeso(102.5F);
		// segunda visita
		System.out.println("-------------VISITA 2-----------------------");
		System.out.println("MEDICO:"+medico1.traerNombreMed());
		System.out.println("PACIENTE: "+paciente1.traerNombreCompleto()+" IMC: "+medico1.calcularIMC(paciente1));
		System.out.println("PACIENTE: "+paciente2.traerNombreCompleto()+" IMC: "+medico1.calcularIMC(paciente2));
		
		
	}

}
