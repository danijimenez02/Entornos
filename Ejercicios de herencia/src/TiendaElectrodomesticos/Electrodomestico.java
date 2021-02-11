package TiendaElectrodomesticos;

public abstract class Electrodomestico {
	
	public static final double PRECIO=100;
	public static final double PESO=5;
	
	public double precioBase;
	public double peso;
	
	public enum Consumo{A,B,C,D,E,F};
	public enum Color{BLANCO,NEGRO,ROJO,AZUL,GRIS};
	public Consumo ce;
	public Color co;
	
	public Electrodomestico() {
		this.precioBase=PRECIO;
		this.peso=PESO;
		this.ce=Consumo.F;
		this.co=Color.BLANCO;
	}
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
		this.ce=Consumo.F;
		this.co=Color.BLANCO;
	}
	public Electrodomestico(double precioBase, double peso, Consumo ce, Color co) {
		this.precioBase=precioBase;
		this.peso=peso;
		this.ce=ce;
		this.co=co;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Consumo getCe() {
		return ce;
	}
	public void setCe(Consumo ce) {
		this.ce = ce;
	}
	public Color getCo() {
		return co;
	}
	public void setCo(Color co) {
		this.co = co;
	}
	public static double getPrecio() {
		return PRECIO;
	}
	
	public double precioFinal() {
		switch(this.ce) {
		case A: this.precioBase=precioBase+100;
			break;
		case B: this.precioBase=precioBase+80;
			break;
		case C: this.precioBase=precioBase+60;
			break;
		case D: this.precioBase=precioBase+50;
			break;
		case E: this.precioBase=precioBase+30;
			break;
		case F: this.precioBase=precioBase+10;
			break;
		}
		if(this.peso>=0 && this.peso<=19)
			this.precioBase=precioBase+10;
		if(this.peso>=20 && this.peso<=49)
			this.precioBase=precioBase+50;
		if(this.peso>=50 && this.peso<=79)
			this.precioBase=precioBase+80;
		if(this.peso>80)
			this.precioBase=precioBase+100;
		
		return this.precioBase;
	}
	

}
