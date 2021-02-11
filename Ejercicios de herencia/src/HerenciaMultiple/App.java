package HerenciaMultiple;

import java.util.Arrays;

public class App implements Autoevaluacion {

	public int secuenciaMayor(int[] v) {
		int mayor=1;//Almaceno la secuencia mayor
		int sec=1;//Contador de la secuencia actual
		int numero=0;//el numero del array
		for(int i=0;i<v.length-1;i++) {
			numero=v[i];
			if(numero==v[i+1]) {
				sec++;
				mayor=sec;
			}
			else {
			
			if(mayor<sec)
				mayor=sec;
			sec=0;
			}
		}
		return mayor;
	}

	public float mediaImparesPrimerPar(int[] v) {
		boolean primerpar=false;
		int cont=0;
		float suma=0.0f;
		for(int i=0;i<v.length;i++) {
			if(v[i]%2==0)
				primerpar=true;
			if(primerpar && v[i]%2!=0) {
				suma=suma+v[i];
				cont++;
			}
		}
		if(suma!=0)
			return suma/cont;
		else
			return 0;
	}
	public int repetidos(int[]a, int[]b) {
	//Devuelve verdadero si hay repetidos en el array
	int contadorRepetidos=0;
	if(this.hayRepetidos(a)) {
		System.out.println("Elimino los repetidos de a");
		this.eliminarRepetidos(a);
		//Eliminar los numeros repetidos del array a
	}
	for(int i=0;i<a.length;i++) {
		for(int j=0;i<b.length;j++) {
			if(a[i]==b[j])
				contadorRepetidos++;
		}
	}
	return contadorRepetidos;
	}
	public boolean hayRepetidos(int[]a) {
		int numero;
		boolean repetido=false;
		for(int i=0;i<a.length;i++) {
			numero=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(numero==a[i]&&numero!=0)
					return true;
			}
			
		}
		return false;
	}
	public void eliminarRepetidos(int[] a) {
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				if(i!=j) {
					if(a[i]==a[j]) {
						a[i]=0;
					}
				}
			}
		}
	}
		
		
		
	
	public static void main(String[] args) {
		App miapp=new App();
		int[]array1= {3,3,3,3,7,3,5};
		int[]array2= {3,3,2,3,7};
		int[]array3= {2,2,2,2,2,2,2};
		
		System.out.println("La media de impares desde el primer par es "+ miapp.mediaImparesPrimerPar(array1));
		System.out.println("La media de impares desde el primer par es "+ miapp.mediaImparesPrimerPar(array2));
		System.out.println("La media de impares desde el primer par es "+ miapp.mediaImparesPrimerPar(array3));
		System.out.println("La secuencia mayor de numeros repetidos es "+ miapp.secuenciaMayor(array1));
		
		if(miapp.hayRepetidos(array2))
			System.out.println("Hay repetidos");
		else
			System.out.println("No hay repetidos");
		
		miapp.eliminarRepetidos(array1);
		miapp.eliminarRepetidos(array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(miapp.repetidos(array1, array2));
		//Eliminar los ceros de un array
		//Contar cuantos ceros hay
		//Reservar memoria para un array con el tamaño sin ceros
		//Mover los elementos para que no haya huecos
		
		
		

	}
}
