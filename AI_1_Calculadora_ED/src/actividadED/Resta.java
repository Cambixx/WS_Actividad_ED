package actividadED;


/**
 * Esta clase implementar? todos los m?todos que est?n relacionados con la <b>restas de la calculadora</b>.
 *
 * 
 * Tendr? varios m?todos para operar con 2 o 3 n?meros reales o enteros que se introducir?n por teclado y 
 * un m?todo que guardar? el valor acumulado.
 * 
 * 
 * @author Carlos R?bago, Borja del Valle
 * @version 1.1
 * 
 *
 */

public class Resta {
	
	
		
	private double acumulado;
	
	
	
	/**
	* Este m?todo resta dos n?meros reales introducidos y muestra la soluci?n de la operacion por pantalla.
	* 
	* @param num1 Primer n?mero real a restar.
	* @param num2 Segundo n?mero real a restar.
	* @return valor de tipo double que ser? el resultado de restar los 2 n?meros reales.
	* 
	*/
	
	public double restaDosReales(double num1, double num2) {
		
		double n = num1 - num2;
		return Math.round(n*100.0)/100.0;
		
	}
	
	
	/**
	* Este m?todo resta dos n?meros enteros introducidos y muestra la soluci?n de la operacion por pantalla.
	* 
	* @param num1 Primer n?mero entero a restar.
	* @param num2 Segundo n?mero entero a restar.
	* @return valor de tipo int que ser? el resultado de restar los 2 n?meros enteros.
	* 
	*/
	
	public int restaDosEnteteros(int num1, int num2) {
		
		return num1 - num2;
		
	}
	
	/**
	* Este m?todo resta tres n?meros reales introducidos y muestra la soluci?n de la operacion por pantalla.
	* 
	* @param num1 Primer n?mero real a restar.
	* @param num2 Segundo n?mero real a restar.
	* @param num3 Tercer n?mero real a restar.
	* @return valor de tipo double que ser? el resultado de restar los 3 n?meros reales.
	* 
	*/
	
	public double restaTresReales(double num1, double num2, double num3) {
		
		double n = num1 - num2 - num3;
		return Math.round(n*100.0)/100.0;
		
	}
	
	/**
	 * Este m?todo ir? guardando y acumulando en la variable de clase <b>acumulado</b> el valor que reciba por par?metro.
	 * 
	 * @param resResta representa el valor del resultado de la resta que se quiera acumular.
	 */
	
	public void valorAcumulado(double resResta) {
		
		acumulado = acumulado + resResta;
		
	}
	
	/**
	 * Este m?todo sirve para consultar el valor que tenemos acumulado.
	 * 
	 * @return el valor acumulado de los parametros introducidos.
	 */
	
	public double getAcumulado() {
		
		return acumulado;
		
	}
		
}