package Ejercicios;

public class funciones2 {
	
	//Esta funcion pasa de celsius a Farenheit
	public static double celsiusFarenheit( double celsius) {
		double farenheit=(celsius*1.8)+32;
		return farenheit;
	}
	
	//Esta funcion pasa de farenheit a Celsius
	public static double farenheitCelsius(double farenheit) {
		double celsius=(farenheit-32)*0.5556;
		return celsius;
	}
	
	//Esta funcion pasa de litros a galones.
	public static double litrosGalones(double litros ) {
		double galones=litros*3.785;
		return galones;
		
	}
	
	//Esta funcion pasa de galones a litros.
	public static double galonesLitros(double galones) {
		double litros=(galones/3.785); 
		return litros;
	}
	

}
  