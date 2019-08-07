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
	
	public int Sumar(Numero n) {

		return (this.n+n.getN());
	}
	
	public int Sumar2(Numero n,Numero n1) {

		return (n.getN()+n1.getN());
	}
	public int Multiplicar (Numero n) {
		return (this.n*n.getN());
	}
	
	public boolean EsPar(Numero n) {
		if(n.getN()%2==0){
				 
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean EsPrimo(Numero n) {
		for(int i=2;i<n.getN();i++) {
			if (n.getN()%i==0) {
				
				return false;
			}
		}
		return true;	
		}

	public String ConvertirAString(Numero n) {
		return (String.valueOf(n.getN()));
	}
	
	public double ConvertirADouble(Numero n) {
		 String z=Integer.toString(n.getN());
		return (Double.parseDouble(z));
	}
	// preguntar o revisar porque no imprime el casteo a int
	public double calcularPot(Numero n,Numero n1 ) {
		String base=Integer.toString(n.getN());
		String potencia=Integer.toString(n1.getN());
		return (Math.pow(Double.parseDouble(base),(Double.parseDouble(potencia))));
	}
	


}




