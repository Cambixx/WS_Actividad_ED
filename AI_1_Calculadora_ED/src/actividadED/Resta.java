package actividadED;


/**
 * Esta clase implementará todos los métodos que están relacionados con la <b>restas de la calculadora</b>.
 *
 * 
 * Tendrá varios métodos para operar con 2 o 3 números reales o enteros que se introducirán por teclado y 
 * un método que guardará el valor acumulado.
 * 
 * 
 * @author Carlos Rábago, Borja del Valle
 * @version 1.1
 * 
 *
 */

public class Resta {
	
	private int Entero1, Entero2;
	private double Real1, Real2, Real3;
		
	private double acumulado;
	
	
	
	public Resta() {
		super();
	}

	
	

	public int getEntero1() {
		return Entero1;
	}




	public void setEntero1(int entero1) {
		Entero1 = entero1;
	}




	public int getEntero2() {
		return Entero2;
	}




	public void setEntero2(int entero2) {
		Entero2 = entero2;
	}




	public double getReal1() {
		return Real1;
	}




	public void setReal1(double real1) {
		Real1 = real1;
	}




	public double getReal2() {
		return Real2;
	}




	public void setReal2(double real2) {
		Real2 = real2;
	}




	public double getReal3() {
		return Real3;
	}




	public void setReal3(double real3) {
		Real3 = real3;
	}




	public void setAcumulado(double acumulado) {
		this.acumulado = acumulado;
	}




	/**
	* Este método resta dos números reales introducidos y muestra la solución de la operacion por pantalla.
	* 
	* @param num1 Primer número real a restar.
	* @param num2 Segundo número real a restar.
	* @return valor de tipo double que será el resultado de restar los 2 números reales.
	* 
	*/
	
	public double restaDosReales(double num1, double num2) {
		
		double n = num1 - num2;
		return Math.round(n*100.0)/100.0;
		
	}
	
	
	/**
	* Este método resta dos números enteros introducidos y muestra la solución de la operacion por pantalla.
	* 
	* @param num1 Primer número entero a restar.
	* @param num2 Segundo número entero a restar.
	* @return valor de tipo int que será el resultado de restar los 2 números enteros.
	* 
	*/
	
	public int restaDosEnteteros(int num1, int num2) {
		
		return num1 - num2;
		
	}
	
	/**
	* Este método resta tres números reales introducidos y muestra la solución de la operacion por pantalla.
	* 
	* @param num1 Primer número real a restar.
	* @param num2 Segundo número real a restar.
	* @param num3 Tercer número real a restar.
	* @return valor de tipo double que será el resultado de restar los 3 números reales.
	* 
	*/
	
	public double restaTresReales(double num1, double num2, double num3) {
		
		double n = num1 - num2 - num3;
		return Math.round(n*100.0)/100.0;
		
	}
	
	/**
	 * Este método irá guardando y acumulando en la variable de clase <b>acumulado</b> el valor que reciba por parámetro.
	 * 
	 * @param resResta representa el valor del resultado de la resta que se quiera acumular.
	 */
	
	public void valorAcumulado(double resResta) {
		
		acumulado = acumulado + resResta;
		
	}
	
	/**
	 * Este método sirve para consultar el valor que tenemos acumulado.
	 * 
	 * @return el valor acumulado de los parametros introducidos.
	 */
	
	public double getAcumulado() {
		
		return acumulado;
		
	}
		
}