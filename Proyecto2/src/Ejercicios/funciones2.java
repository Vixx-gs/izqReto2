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
	

}
  