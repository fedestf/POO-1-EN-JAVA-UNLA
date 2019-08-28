package Modelo;

import java.math.*;

public class Circulo {

	private Punto origen;
	private double radio;

	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void mover(double desplazamientoX, double desplazamientoY) {
		// preguntar este metodo la explicacion
		Punto nuevoOrigen = new Punto(origen.getX(), origen.getY());
		origen = nuevoOrigen;
		origen.mover(desplazamientoX, desplazamientoY);
	}

	public void setRadio(Punto radio) {
		
		
	}

	public boolean equals(Circulo c) {

		return (origen == c.getOrigen() && radio == c.getRadio());
	}

	// tostring autogenerado?
	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}

	public double calcularPerimetro() {

		return (2 * Math.PI * radio);
	}

	public double calcularArea() {

		return (Math.PI * Math.pow(radio, 2));
	}

	public double calcularDistancia(Circulo c) {

		Punto c2 = new Punto(origen.getX(), origen.getY());

		return (Math.sqrt(Math.pow(c2.getX() - c.origen.getX(), 2) + (Math.pow(c2.getY() - c.origen.getY(), 2))));
	}

}
