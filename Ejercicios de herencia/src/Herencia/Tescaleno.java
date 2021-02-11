package Herencia;

public class Tescaleno extends Figura{
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Tescaleno(){
		super();
		ladoA=0;
		ladoB=0;
		ladoC=0;
	}
	
	public Tescaleno(String color, double ladoA, double ladoB, double ladoC){
		super(color);
		this.ladoA=ladoA;
		this.ladoB=ladoB;
		this.ladoC=ladoC;
	}
	
	public double getLadoA(){
		return ladoA;
	}
	
	public double getLadoB(){
		return ladoB;
	}
	
	public double getLadoC(){
		return ladoC;
	}
	
	public void setLadoA(double nuevoLadoA){
		ladoA=nuevoLadoA;
	}
	
	public void setLadoB(double nuevoLadoB){
		ladoB=nuevoLadoB;
	}
	
	public void setLadoC(double nuevoLadoC){
		ladoC=nuevoLadoC;
	}

	@Override
	public double area() {
		double semiPer= perimetro()/2;
		return Math.sqrt(semiPer*(semiPer-ladoA)*(semiPer-ladoB)*(semiPer-ladoC));
	}

	public double perimetro() {
		return ladoA+ladoB+ladoC;
	}

	@Override
	public boolean equals(Figura c) {
		if (this == c)
			return true;
		if(c instanceof Tescaleno && this.area()==c.area() && this.perimetro()==c.perimetro())
			return true;
		
		return false;
	}
	public static void main(String[] args) {
			Tescaleno t=new Tescaleno("verde", 2, 3,4);
			System.out.println("Area "+t.area());
		
	}
}
