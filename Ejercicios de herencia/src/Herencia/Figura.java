package Herencia;

public abstract class Figura {
protected String color;

public Figura() {
	this.color="blanco";
}

public Figura(String color) {
	this.color=color;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double area() {
	return 0;
}
public double perimetro() {
	return 0;
}
public boolean equals(Figura f) {
	return true;
}
public String toString() {
	return "Color: "+color;
}
}
