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

	public void ordenarDes() {
		System.out.println("Sin ordenar");
		mostrarMatriz();
		boolean existe = true;
		int valorMenor = 0;

		while (existe) {

			existe = false;

			for (int i = 0; i < vector.length - 1; i++) {

				if (vector[i] < vector[i + 1]) {
					valorMenor = vector[i + 1];
					vector[i + 1] = vector[i];
					vector[i] = valorMenor;
					existe = true;

				}
			}
		}

		System.out.println("Ordenada");
		mostrarMatriz();
	}
	public void ordenarAsc() {
		System.out.println("Sin ordenar");
		mostrarMatriz();
		boolean existe = true;
		int valorMenor = 0;

		while (existe) {

			existe = false;

			for (int i = 0; i < vector.length - 1; i++) {

				if (vector[i] > vector[i + 1]) {
					valorMenor = vector[i + 1];
					vector[i + 1] = vector[i];
					vector[i] = valorMenor;
					existe = true;

				}
			}
		}

		System.out.println("Ordenada");
		mostrarMatriz();
	}
	public void mostrarMatriz() {
		for (int i = 0; i < vector.length; i++) {

			System.out.print("[" + vector[i] + "]");

		}
		System.out.println();
	}

}
