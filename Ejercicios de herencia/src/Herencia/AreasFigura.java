package Herencia;

import java.util.Scanner;

public class AreasFigura {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String color;
		double r;
		double ladoc;
		double ladoe;
		double ladoi1;
		double ladoi2;
		double ladoe1, ladoe2, ladoe3;
		int opcion;
		boolean salir=false;
		do {
		System.out.println("Color para la figura");
		color=sc.next();
		System.out.println("1. Circulo");
		System.out.println("2. Cuadrado");
		System.out.println("3. Triangulo equilatero");
		System.out.println("4. Triangulo isosceles");
		System.out.println("5. Triangulo escaleno");
		System.out.println("6. Salir");
		System.out.println("Introduce una opcion");
		opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Valor del radio");
			r=sc.nextDouble();
			Circulo c=new Circulo(color,r);
			System.out.println("El area del circulo es: "+c.area());
			System.out.println("El perimetro del circulo es: "+c.perimetro());
			break;
		case 2:
			System.out.println("Valor del lado");
			ladoc=sc.nextDouble();
			Cuadrado d=new Cuadrado(color,ladoc);
			System.out.println("El area del cuadrado es: "+d.area());
			System.out.println("El perimetro del cuadrado es: "+d.perimetro());
			break;
		case 3:
			System.out.println("Valor del lado");
			ladoe=sc.nextDouble();
			Tequilatero e=new Tequilatero(color,ladoe);
			System.out.println("El area del triangulo es: "+e.area());
			System.out.println("El perimetro del triangulo es: "+e.perimetro());
			break;
		case 4:
			System.out.println("Valor del primer lado");
			ladoi1=sc.nextDouble();
			System.out.println("Valor del segundo lado");
			ladoi2=sc.nextDouble();
			Tisosceles f=new Tisosceles(color,ladoi1,ladoi2);
			System.out.println("El area del triangulo es: "+f.area());
			System.out.println("El perimetro del triangulo es: "+f.perimetro());
			break;
		case 5:
			System.out.println("Valor del primer lado");
			ladoe1=sc.nextDouble();
			System.out.println("Valor del segundo lado");
			ladoe2=sc.nextDouble();
			System.out.println("Valor del tercer lado");
			ladoe3=sc.nextDouble();
			Tescaleno g=new Tescaleno(color,ladoe1,ladoe2,ladoe3);
			System.out.println("El area del triangulo es: "+g.area());
			System.out.println("El perimetro del triangulo es: "+g.perimetro());
			break;
		case 6:
			salir=true;
			break;
		}
		}while(!salir);
	}

}
