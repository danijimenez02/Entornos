package TiendaElectrodomesticos;

import TiendaElectrodomesticos.Electrodomestico.Color;
import TiendaElectrodomesticos.Electrodomestico.Consumo;

public class Electrodomestico_main {

	public static void main(String[] args) {
		Electrodomestico lista[]= new Electrodomestico[10];
		lista[0]=new Lavadora(200,25,Consumo.A,Color.BLANCO,10);
		lista[1]=new Television(500,10,Consumo.A,Color.NEGRO,false,75);
		lista[2]=new Lavadora(100,25,Consumo.A,Color.BLANCO,10);
		lista[3]=new Lavadora(300,25,Consumo.A,Color.BLANCO,10);
		lista[4]=new Television(550,10,Consumo.A,Color.NEGRO,false,75);
		lista[5]=new Television(1500,10,Consumo.A,Color.NEGRO,false,75);

		
		System.out.println(lista[0].precioFinal());
		System.out.println(lista[1].precioFinal());
		
		double sumalav=0;
		double sumatv=0;
		for(int i=0; i<6;i++) {
			if(lista[i] instanceof Lavadora)
				sumalav=sumalav+lista[i].precioFinal();
			else
				sumatv=sumatv+lista[i].precioFinal();
		}
		System.out.println("Total lavadoras: "+ sumalav);
		System.out.println("Total TV: "+sumatv);
		System.out.println("Total: "+(sumalav+sumatv));
		
		
	}

}
