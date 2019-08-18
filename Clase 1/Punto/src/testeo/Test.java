package testeo;
import Modelo.*;

public class Test {

	public static void main(String[] args) {
		Punto a= new Punto (3,3);
		Punto b= new Punto (3,8);
		Punto c= new Punto (4,5);
		Punto d= new Punto (3,3);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.calcularDistancia(d));
		
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		
		//System.out.println(c.calcularDistancia(a));
		
		a.mover(2, 3);
		System.out.println(a);
		
		Punto punto1=new Punto (10,10);
		
		Circulo circulo1=new Circulo(a,3);
		Circulo circulo2=new Circulo(c,3);
		
		System.out.println("["+circulo1.getOrigen()+","+circulo1.getRadio()+"]" +"  "+"["+circulo2.getOrigen()+","+circulo2.getRadio()+"]");
		//circulo1.mover(5,0);
		System.out.println("["+circulo1.getOrigen()+","+circulo1.getRadio()+"]" +"  "+"["+circulo2.getOrigen()+","+circulo2.getRadio()+"]");
		System.out.println(circulo1.equals(circulo2));
		
		System.out.println(circulo1.toString());
		System.out.println(circulo1.calcularPerimetro());
		System.out.println(circulo1.calcularArea());
		
		System.out.println(circulo1.calcularDistancia(circulo2));
		System.out.println(b.calcularDistancia(c));
	}

}
