package Ejercicios;

import java.util.Scanner;

import util.funciones0;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int n1=0;
		double conver=0;
		do {
			try {
				System.out.println("Selecciona un tipo de conversion: ");
				System.out.println("1. Longitud");
				System.out.println("2. Peso");
				System.out.println("3. Temperatura");
				System.out.println("4. Volumen");
				System.out.println("0. Salir");
				n=funciones0.dimeEntero("Introduce numero entero", sc);
				if(n>4) {
					System.out.println("Introduzca un numero del 0 al 4");
				}
				if(n==1) {
					System.out.println("Selecciona la conversion de longitud");
					System.out.println("1. Millas a kilometros");
					System.out.println("2. Kilometros a millas");
					System.out.println("0. Salir");
					n1=funciones0.dimeEntero("Introduce un numero del 0 al 2", sc);
					conver=funciones0.dimeDouble("Pon el numero a convertir", sc);
					do {
					if(n1==1) {
						System.out.println(funciones1.millasakilometros(conver));
					}
					if(n1==2) {
						System.out.println(funciones1.kilometrosamillas(conver));
					}
					}while(n1!=0);
				}
				if(n==2) {
					System.out.println("Selecciona la conversion de peso");
					System.out.println("1. kilos a libras");
					System.out.println("2. libras a kilos");
					System.out.println("0. Salir");
					n1=funciones0.dimeEntero("Introduce un numero del 0 al 2", sc);
					conver=funciones0.dimeDouble("Pon el numero a convertir", sc);
				}
				if(n==3) {
					System.out.println("Selecciona la conversion de temperatura");
					System.out.println("1. celsius a farenheit");
					System.out.println("2. farenheit a celsius");
					System.out.println("0. Salir");
					n1=funciones0.dimeEntero("Introduce un numero del 0 al 2", sc);
					conver=funciones0.dimeDouble("Pon el numero a convertir", sc);
					do {
						if(n1==1) {
							System.out.println(funciones2.celsiusFarenheit(conver));
						}
						if(n1==2) {
							System.out.println(funciones2.farenheitCelsius(conver));
						}
					}while(n!=0);
				}
				if(n==4) {
					System.out.println("Selecciona la conversion de volumen");
					System.out.println("1. litros a galones");
					System.out.println("2. galones a litros");
					System.out.println("0. Salir");
					n1=funciones0.dimeEntero("Introduce un numero del 0 al 2", sc);
					conver=funciones0.dimeDouble("Pon el numero a convertir", sc);
					do {
						if(n1==1) {
							System.out.println(funciones2.litrosGalones(conver));
						}
						if(n1==2) {
							System.out.println(funciones2.galonesLitros(conver));
						}
					}while(n!=0);
				}
				
			}catch(Exception ex)
			{
				System.out.println("Introduce un nº correcto");
			}
		}while(n!=0);
		
	}

}
