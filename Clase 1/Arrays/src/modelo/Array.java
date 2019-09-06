package modelo;

import java.util.Arrays;

public class Array {

	int[] vector;

	public Array(int[] vector) {
		super();
		this.vector = vector;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	@Override
	public String toString() {
		return "Array [vector=" + Arrays.toString(vector) + "]";
	}

	public int traerElMenor() {
		int aux = 999999999;
		for (int i = 0; i < vector.length; i++) {

			if (vector[i] < aux) {
				aux = vector[i];
			}
		}

		return aux;
	}

	public int traerElMayor() {
		int aux = 0;
		for (int i = 0; i < vector.length; i++) {

			if (vector[i] > aux) {
				aux = vector[i];
			}
		}

		return aux;
	}

	public double calcularPromedio() {
		int suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}

		return suma / vector.length;
	}

	// preguntar a que se refiere con frecuencia
	public int traerFrecuencia(int numero) {
		int cont = 0;
		for (int i = 0; i < vector.length; i++) {

			if (numero == vector[i]) {
				cont++;
			}

		}

		return cont;
	}
	


public int[] metodoBurbujaAsc( int [ ] num )
    {
         int i;
         boolean flag = true;
         int temp;
 
         while ( flag )
         {
                flag = false;   
                for( i=0;  i < num.length -1;  i++ )
                {
                       if ( num[ i ] > num[i+1] )  
                       {
                               temp = num[ i ];
                               num[ i ] = num[ i+1 ];
                               num[ i+1 ] = temp;
                              flag = true; 
                      } 
                } 
          } 
         return num;
    }

}
