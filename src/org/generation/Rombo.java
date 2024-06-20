package org.generation;
public class Rombo implements FigurasGeometricas {
	private String name;
	private double diagonalmayor;
	private double diagonalmenor;
	private double lado;

public Rombo(String name, double diagonalmayor, double diagonalmenor, double lado) {
	super();
	this.name = name;
	this.diagonalmayor = diagonalmayor;
	this.diagonalmenor = diagonalmenor;
	this.lado = lado;
}
	public double calcularArea() {
		return (getDiagonalmayor() * getDiagonalmenor())/2;	
	}//calcularArea
	public double calcularPerimetro() {
		return (4*lado);
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getDiagonalmayor() {
	return diagonalmayor;
}
public void setDiagonalmayor(double diagonalmayor) {
	this.diagonalmayor = diagonalmayor;
}
public double getDiagonalmenor() {
	return diagonalmenor;
}
public void setDiagonalmenor(double diagonalmenor) {
	this.diagonalmenor = diagonalmenor;
}
public double getLado() {
	return lado;
}
public void setLado(double lado) {
	this.lado = lado;
}
@Override
public String toString() {
	return "Rombo [name=" + name + ", diagonalmayor=" + diagonalmayor + ", diagonalmenor=" + diagonalmenor + ", lado="
			+ lado + "]";
}// calcularPerimetro
}