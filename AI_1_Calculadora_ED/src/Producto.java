/**
 * Clase que implementar� todos los m�todos que estan relacionados con la multiplicaci�n de la calculadora.
 * @author SERGIO MART�NEZ RIVERA
 * @version 1
 *
 */
public class Producto {

	/**
	 * M�todo que calcula la multiplicaci�n de dos n�meros reales.
	 * @param numero1 representa el primer n�mero real de la multiplicaci�n.
	 * @param numero2 representa el segundo n�mero real de la multiplicaci�n.
	 * 		  
	 * @return Retornar� el resultado obtenido de la multiplicaci�n de los par�metros introducidos. 
	 * Redondea el resultado obtenido con el Math.round.
	 */
	public double ProductoReales (double numero1, double numero2) { 

		double n= numero1*numero2 ;
		return Math.round(n*100.0)/100.0;
				
		
	}
	
	/** 
	 * M�todo que calcula la multiplicaci�n de dos n�meros enteros.
	 * @param numero1  representa el primer n�mero entero de la multiplicaci�n.
	 * @param numero2  representa el segundo n�mero entero de la multiplicaci�n.
	 * 		  
	 * @return  Retornar� el resultado obtenido de la multiplicaci�n de los par�metros introducidos.
	 * Ocurrir� un error si se le introduce alg�n n�mero real. 
	 * @deprecated el m�todo {@link #ProductoReales (double, double)} tambi�n me calcula dos enteros.
	 */
	
	
	public int ProductoEnteros (int numero1, int numero2) {
		int n = numero1*numero2;
		return n;
		
		
	}
	
	/**
	 * M�todo que calcula la multiplicaci�n de tres n�meros reales.
	 * @param numero1  Representa el primer n�mero real de la multiplicaci�n.
	 * @param numero2  Representa el segundo n�mero real de la multiplicaci�n.
	 * @param numero3  Representa el tercer n�mero real de la multiplicaci�n.	  
	 * @return Retornar� el resultado obtenido de la multiplicaci�n de los par�metros introducidos. 
	 * Redondea a dos decimales con el uso del Math.round().
	 */
	
	public  double ProductoTresReales ( double numero1, double numero2, double numero3) {
		double n = numero1*numero2*numero3;
		return Math.round(n*100.0)/100.0;
		
		
	}
	
	/**
	 * M�todo que calcula el resultado de una potencia.
	 * La potencia es una operaci�n que consiste en multiplicar por si mismo un n�mero principal llamado base ,
	 * tantas veces como lo indique otro n�mero llamado exponente.
	 * @param base N�mero real o entero que servir� como base de la potencia.
	 * @param exponente N�mero real o entero que servir� como exponente de la potencia.
	 * @return  Retornara el resultado de la potencia, redondeado a 2 decimales haciendo uso del Math.round().
	 *  Dar� error si el resultado obtenido es mayor a un double.
	 */
	
	public double Potencia (double base, double exponente) {
		double n = Math.pow(base, exponente);
		return  Math.round(n*100.0)/100.0;
		
		
	}
}
