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
 * Promedio Es la media aritmética y se calcula agregando un grupo de números y,
 * a continuación, dividiendo el recuento de esos números. Por ejemplo, el
 * promedio de 2, 3, 3, 5, 7 y 10 es 30 dividido por 6, que es 5.
 * 
 * Mediana El número medio de un grupo de números. La mitad de los números
 * tienen valores mayores que la mediana, y la mitad de los números tienen
 * valores inferiores a la mediana. Por ejemplo, la mediana de 2, 3, 3, 5, 7 y
 * 10 es 4.
 * 
 * Moda El número que se repite con más frecuencia en un grupo de números. Por
 * ejemplo, la moda de 2, 3, 3, 5, 7 y 10 es 3.
 */