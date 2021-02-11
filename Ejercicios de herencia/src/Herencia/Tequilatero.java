package Herencia;

public class Tequilatero extends Figura {
private double lado;
public Tequilatero(){
	super();
	lado=0;
}

public double getLado(){
	return lado;
}

public void setLado(double nuevoLado){
	lado=nuevoLado;
}

public Tequilatero(String color, double lado){
	super(color);
	this.lado=lado;
}

@Override
public double area() {
	/*double base=lado;
	double altura=Math.sqrt((Math.pow(lado, 2))+(Math.pow((lado/2),2)));
	return (base*altura)/2;*/
	return (Math.sqrt(3)/4)*lado*lado;
}

@Override
public double perimetro() {
	return 3*lado;
}


public boolean equals(Figura fig) {
	if(fig instanceof Tequilatero && this.area()==fig.area() && this.perimetro()==fig.perimetro())
		return true;
	else 
		return false;
}
public static void main(String[] args) {
Tequilatero t=new Tequilatero("verde", 5);
System.out.println("Area "+t.area());
}
}
