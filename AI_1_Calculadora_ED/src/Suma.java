/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la <b>sumas de la calculadora</b>.
 *
 * 
 * Tendr� varios m�todos para operar con 2 o 3 n�meros reales o enteros que se introducir�n por teclado y 
 * un m�todo que guardar� el valor acumulado.
 * 
 * 
 * @author Lidia D�az Mendoza
 * @version 1.0
 *
 */

public class Suma {
	// ATRIBUTOS DE CLASE
	
	//private Integer valorAcumulado;
	
	// METODOS	
	/**
	* Este m�todo suma dos n�meros reales introducidos y muestra la soluci�n de la suma por pantalla.
	* 
	* @param num1 Primer n�mero real a sumar.
	* @param num2 Segundo n�mero real a sumar.
	* @return Suma total de los dos n�meros introducidos.
	* 
	*/
	
	public double sumaDosReales(double num1, double num2) {
		double num = num1 + num2;
		return num;
	}
	
	
	/**
	* Este m�todo suma dos n�meros enteros introducidos y muestra la soluci�n de la suma por pantalla.
	* 
	* @param num1 Primer n�mero entero a sumar.
	* @param num2 Segundo n�mero entero a sumar.
	* @return Suma total de los dos n�meros introducidos.
	* 
	*/
	
	public int sumaDosEnteros(int num1, int num2) {
		int num = num1 + num2;
		return num;
	}
	
	/**
	* Este m�todo suma tres n�meros reales introducidos y muestra la soluci�n de la suma por pantalla.
	* 
	* @param num1 Primer n�mero real a sumar.
	* @param num2 Segundo n�mero real a sumar.
	* @param num3 Tercer n�mero real a sumar.
	* @return Suma total de los tres n�meros introducidos.
	* 
	*/
	
	public double sumaTresReales(double num1, double num2, double num3) {
		double num = num1 + num2 + num3;
		return num;
	}
	
	/**
	* Este m�todo guardar� el valor acumulado de la suma de los n�meros introducidos. 
	* No retorna nada porque lo que hace este m�todo es acumular los valores de entrada.
	* 
	* @param numero Primer n�mero real a sumar.
	* 
	* 
	*/
	
	public void guardarValorAcumulado(int numero) {
		//TODO	
	}
		
}

