package org.generation;
public class Main {
public static void main(String[] args) {
	Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
	Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
	Cuadrado c1 = new Cuadrado("Esponja", 127);
	Rectangulo r1= new Rectangulo ("Cancha", 10,20);
	Rombo r2= new Rombo ("Papalote", 60,30,20);
	Romboide r3= new Romboide ("Androide", 60,40);
	Trapecio t3= new Trapecio ("Trap",20,40,35,20,25,40,25);
	imprimirCalculo(t1); imprimirCalculo(t2);
	imprimirCalculo(c1);
	imprimirCalculo(r1);
	imprimirCalculo(r2);
	imprimirCalculo(r3);
	imprimirCalculo(t3);
	
}
	public static void imprimirCalculo(FigurasGeometricas f){
		System.out.println (f.toString());
		System.out.println("+==========================================================================================");
		System.out.println("| El área de [" + f.getName() + "] es: " + f.calcularArea());
		System.out.println("| El perímetro de [ "+ f.getName() + "] es : " + f.calcularPerimetro());
		System.out.println("+=========================================================================================");
		
		
		
	}
}

