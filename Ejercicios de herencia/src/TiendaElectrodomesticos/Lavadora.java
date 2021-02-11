package TiendaElectrodomesticos;

public class Lavadora extends Electrodomestico {

public static final int CARGA=5;
private int carga;

public Lavadora() {
	super();
	this.carga=Lavadora.CARGA;
}
public Lavadora(double precio, double peso) {
	super(precio,peso);
	this.carga=Lavadora.CARGA;
}
public Lavadora(double precioBase,double peso, Consumo ce, Color co, int carga) {
	super(precioBase,peso,ce,co);
	this.carga= carga;
}
public int getCarga() {
	return carga;
}
public void setCarga(int carga) {
	this.carga = carga;
}
public double precioFinal() {
	double precio;
	if(this.carga>30)
		precio=super.precioFinal()+50;
	else
		precio=super.precioFinal();
	return precio;
}
}
