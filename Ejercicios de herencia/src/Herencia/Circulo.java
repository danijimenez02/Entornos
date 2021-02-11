package Herencia;

public class Circulo extends Figura {
private double radio;

public Circulo() {
	super();
	this.radio=0.0;
}

public Circulo(String color, double radio) {
	super(color);
	this.radio = radio;
}

public double getRadio() {
	return radio;
}

public void setRadio(double radio) {
	this.radio = radio;
}
public double area() {
	//return Math.PI*radio*radio;
	return Math.PI*Math.pow(radio, 2);
}
public double perimetro() {
	return 2*Math.PI*this.radio;
}
public boolean equals(Circulo c) {
	if (this == c)
		return true;
	if(c instanceof Circulo &&this.area()==c.area()&& this.perimetro()==c.perimetro())
		return true;
	return false;
}

public String toString() {
	return "Circulo [radio= " + radio + " "+super.toString();
}
public static void main(String[] args) {
	Circulo c=new Circulo("Verde",3.5);
	System.out.println(c);
	
	Circulo t=new Circulo("Azul",3);
	System.out.println("Area "+c.area());
	System.out.println("Perimetro "+c.perimetro());
	if(c.equals(t))
		System.out.println("Son iguales");
	else
		System.out.println("Son distintas");
}
}
