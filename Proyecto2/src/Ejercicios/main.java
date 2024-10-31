package Ejercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		do {
			try {
				System.out.println("Selecciona un tipo de conversion: ");
				System.out.println("1. Longitud");
				System.out.println("2. Peso");
				System.out.println("3. Temperatura");
				String s = sc.nextLine();
				n=Integer.parseInt(s);
			}catch(Exception ex)
			{
				System.out.println("Introduce un nº correcto");
			}
		}while(n!=0);
		
	}

}
