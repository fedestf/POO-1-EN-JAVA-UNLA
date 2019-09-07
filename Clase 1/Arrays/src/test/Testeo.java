package test;

import java.util.Arrays;

import modelo.*;

public class Testeo {

	public static void main(String[] args) {

		int[] array1 = { 4, 5, 6, 1, 2, 3 };

		Array array2 = new Array(array1);

		System.out.println(array2.calcularPromedio());
		System.out.println(array2.toString());
		System.out.println(array2.traerElMayor());
		System.out.println(array2.traerElMenor());
		System.out.println(array2.traerFrecuencia(1));

		array2.mostrarMatriz();
		array2.ordenarAsc();
		array2.ordenarDes();

	}

}

/*
 * Promedio Es la media aritm�tica y se calcula agregando un grupo de n�meros y,
 * a continuaci�n, dividiendo el recuento de esos n�meros. Por ejemplo, el
 * promedio de 2, 3, 3, 5, 7 y 10 es 30 dividido por 6, que es 5.
 * 
 * Mediana El n�mero medio de un grupo de n�meros. La mitad de los n�meros
 * tienen valores mayores que la mediana, y la mitad de los n�meros tienen
 * valores inferiores a la mediana. Por ejemplo, la mediana de 2, 3, 3, 5, 7 y
 * 10 es 4.
 * 
 * Moda El n�mero que se repite con m�s frecuencia en un grupo de n�meros. Por
 * ejemplo, la moda de 2, 3, 3, 5, 7 y 10 es 3.
 */