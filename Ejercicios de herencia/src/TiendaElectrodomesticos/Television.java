package TiendaElectrodomesticos;

public class Television extends Electrodomestico {
	public static final int PULGADAS=20;
	private boolean netflix;
	private int pulgadas;
	
public Television() {
	super();
	this.pulgadas=PULGADAS;
	this.netflix=false;
}
public Television(double precio, double peso) {
	super(precio, peso);
	this.pulgadas=PULGADAS;
	this.netflix=false;
}
public Television(double precioBase, double peso, Consumo ce, Color co, boolean netflix, int pulgadas) {
	super(precioBase, peso, ce, co);
	this.netflix=netflix;
	this.pulgadas=pulgadas;
}
public boolean isNetflix() {
	return netflix;
}
public void setNetflix(boolean netflix) {
	this.netflix = netflix;
}
public int getPulgadas() {
	return pulgadas;
}
public void setPulgadas(int pulgadas) {
	this.pulgadas = pulgadas;
}
public double precioFinal() {
	double precio =super.precioFinal();
	if(this.pulgadas>40)
		precio=precio+super.precioFinal()*0.3;
	if(netflix)
		precio=precio+50;
	return precio;
}
}
