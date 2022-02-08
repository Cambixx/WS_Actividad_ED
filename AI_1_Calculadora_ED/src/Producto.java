/**
 * Clase que implementará todos los métodos que estan relacionados con la multiplicación de la calculadora.
 * @author SERGIO MARTÍNEZ RIVERA
 * @version 1
 *
 */
public class Producto {

	/**
	 * Método que calcula la multiplicación de dos números reales.
	 * @param numero1 representa el primer número real de la multiplicación.
	 * @param numero2 representa el segundo número real de la multiplicación.
	 * 		  
	 * @return Retornará el resultado obtenido de la multiplicación de los parámetros introducidos. 
	 * Redondea el resultado obtenido con el Math.round.
	 */
	public double ProductoReales (double numero1, double numero2) { 

		double n= numero1*numero2 ;
		return Math.round(n*100.0)/100.0;
				
		
	}
	
	/** 
	 * Método que calcula la multiplicación de dos números enteros.
	 * @param numero1  representa el primer número entero de la multiplicación.
	 * @param numero2  representa el segundo número entero de la multiplicación.
	 * 		  
	 * @return  Retornará el resultado obtenido de la multiplicación de los parámetros introducidos.
	 * Ocurrirá un error si se le introduce algún número real. 
	 * @deprecated el método {@link #ProductoReales (double, double)} también me calcula dos enteros.
	 */
	
	
	public int ProductoEnteros (int numero1, int numero2) {
		int n = numero1*numero2;
		return n;
		
		
	}
	
	/**
	 * Método que calcula la multiplicación de tres números reales.
	 * @param numero1  Representa el primer número real de la multiplicación.
	 * @param numero2  Representa el segundo número real de la multiplicación.
	 * @param numero3  Representa el tercer número real de la multiplicación.	  
	 * @return Retornará el resultado obtenido de la multiplicación de los parámetros introducidos. 
	 * Redondea a dos decimales con el uso del Math.round().
	 */
	
	public  double ProductoTresReales ( double numero1, double numero2, double numero3) {
		double n = numero1*numero2*numero3;
		return Math.round(n*100.0)/100.0;
		
		
	}
	
	/**
	 * Método que calcula el resultado de una potencia.
	 * La potencia es una operación que consiste en multiplicar por si mismo un número principal llamado base ,
	 * tantas veces como lo indique otro número llamado exponente.
	 * @param base Número real o entero que servirá como base de la potencia.
	 * @param exponente Número real o entero que servirá como exponente de la potencia.
	 * @return  Retornara el resultado de la potencia, redondeado a 2 decimales haciendo uso del Math.round().
	 *  Dará error si el resultado obtenido es mayor a un double.
	 */
	
	public double Potencia (double base, double exponente) {
		double n = Math.pow(base, exponente);
		return  Math.round(n*100.0)/100.0;
		
		
	}
}
