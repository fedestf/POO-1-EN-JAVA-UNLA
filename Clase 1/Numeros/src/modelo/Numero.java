package modelo;
import java.math.*;


public class Numero {
	
	private int n;

	public Numero(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int sumar(Numero n) {
		// el this va solo cuando el valor que llega es el mismo nombre
		return this.n+n.getN();
	}
	
	public int sumar(Numero n,Numero n1) {

		return n.getN()+n1.getN();
	}
	public int multiplicar (Numero n) {
		return this.n*n.getN();
	}
	
	public boolean esPar() {
		return n%2==0;
	}
	
	public boolean esPrimo() {
		boolean esPrimo=true;
		int  aux=2;
		while(aux<=n && esPrimo) {
			esPrimo = n%aux!=0;
			aux++;
		}
		return esPrimo;	
	}

	public String ConvertirAString(Numero n) {
		return String.valueOf(n.getN());
	}
	
	public double ConvertirADouble(Numero n) {
		 return (Double.parseDouble(Integer.toString(n.getN())));
	}
	// preguntar o revisar porque no imprime el casteo a int
//	public double calcularPot(int exp) {
	//	String base=Integer.toString(n.getN());
		//String potencia=Integer.toString(n1.getN());
		//int z;
		//z=(int)(Math.pow(Double.parseDouble(base),(Double.parseDouble(potencia))));
		//return z;
	//	return (Math.pow(Double.parseDouble(base),(Double.parseDouble(potencia))));
	//}
	
	public double calcularPotencia(int exp) {		
		return ((int)(Math.pow(this.n,exp)));
	}

}




