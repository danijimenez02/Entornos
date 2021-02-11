package Herencia;

public class Tisosceles extends Figura {
	private double ladoComun;
	private double ladoDistinto;
	
	public Tisosceles(){
		super();
		ladoComun=0;
		ladoDistinto=0;
	}
	
	public Tisosceles(String color, double ladoComun, double ladoDistinto){
		super(color);
		this.ladoComun=ladoComun;
		this.ladoDistinto=ladoDistinto;
	}
	
	public double setLadoComun(){
		return ladoComun;
	}
	
	public double setLadoDistinto(){
		return ladoDistinto;
	}
	
	public void setLadoComun(double nuevoLadoComun){
		ladoComun=nuevoLadoComun;
	}
	
	public void setLadoDistinto(double nuevoLadoDistinto){
		ladoDistinto=nuevoLadoDistinto;
	}

	@Override
	public double area() {
		/*double base=ladoDistinto;
		double altura=Math.sqrt(Math.pow(ladoComun, 2)- Math.pow((ladoDistinto/2),2));
		return (base*altura)/2;*/
		return (this.ladoDistinto)*((Math.sqrt((Math.pow(ladoComun, 2))-((ladoDistinto*ladoDistinto)/4))))/2;
	}

	@Override
	public double perimetro() {
		return (2*ladoComun)+ladoDistinto;
	}


	public boolean equals(Figura c) {
		if (this == c)
			return true;
		if(c instanceof Cuadrado && this.area()==c.area() && this.perimetro()==c.perimetro())
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		Tisosceles t=new Tisosceles("verde", 3, 2);
		System.out.println("Area "+t.area());
	}
}
