package Herencia;

public class Cuadrado extends Figura {
private double lado;

public Cuadrado() {
	super();
	this.lado=0.0;
}
public Cuadrado(String color, double lado) {
	super(color);
	this.lado=lado;
}
public double getLado() {
	return lado;
}
public void setLado(double lado) {
	this.lado = lado;
}
public double area() {
	return lado*lado;
}
public double perimetro() {
	return 4*lado;
}
public boolean equals(Cuadrado d) {
	if(this == d)
		return true;
	if(d instanceof Cuadrado && this.area()==d.area() && this.perimetro()==d.perimetro())
		return true;
	return false;
}
public String toString() {
	return "Cuadrado "+" con lado: "+this.lado+ ""+ super.toString();
}
public static void main(String[] args) {
	Cuadrado e=new Cuadrado("Amarillo",5);
	Cuadrado f=new Cuadrado("Verde",3);
	
	if(e.equals(f))
		System.out.println("Son iguales");
	else
		System.out.println("Son distintas");
}
}
