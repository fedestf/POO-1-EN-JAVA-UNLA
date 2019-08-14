package testeo;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		// Creacion de numeros
		Numero numero1=new Numero (2);
		Numero numero2=new Numero (2);
		//flag de carga correcta
		System.out.println(numero2.getN()+" y "+numero1.getN());
	//suma
	
	System.out.println("suma: " +numero1.sumar(numero2));
	
	 System.out.println(numero1.sumar(numero1, numero2));
	
	//multiplicacion
	System.out.println("multiplicacion: " +numero1.multiplicar(numero2));
	
	// es par
	
	System.out.println("es par :"+numero1.esPar());
	System.out.println("Es par : "+numero2.esPar());
	// es primo
	System.out.println("Es primo :"+numero1.esPrimo());
	System.out.println("Es primo :"+numero2.esPrimo());
	// tostring
	System.out.println("to string: "+numero1.ConvertirAString(numero1));
	System.out.println("to string: "+numero1.ConvertirAString(numero2));
	//to double
	System.out.println("to double: "+numero1.ConvertirADouble(numero1));
	System.out.println("to double: "+numero2.ConvertirADouble(numero2));
	//potencia
	System.out.println("La potencia es: "+numero1.calcularPotencia(2));
	}
	

}
