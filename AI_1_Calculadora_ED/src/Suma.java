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
	
	private double acumulado;
	
	// METODOS	
	/**
	* Este m�todo suma dos n�meros reales introducidos y muestra la soluci�n de la suma por pantalla.
	* 
	* @param num1 Representa el primer n�mero real a sumar.
	* @param num2 Representa el segundo n�mero real a sumar.
	* @return Retornar� el resultado de la suma de los dos n�meros reales introducidos.
	* 
	*/
	
	public double sumaDosReales(double num1, double num2) {
		double num = num1 + num2;
		return Math.round(num*100.0)/100.0;
	}
	
	
	/**
	* Este m�todo suma dos n�meros enteros introducidos y muestra la soluci�n de la suma por pantalla.
	* 
	* @param num1 Representa el primer n�mero entero a sumar.
	* @param num2 Representa el segundo n�mero entero a sumar.
	* @return Retornar� el resultado de la suma de los dos n�meros enteros introducidos.
	* 
	*/
	
	public int sumaDosEnteros(int num1, int num2) {
		int num = num1 + num2;
		return num;
	}
	
	/**
	* Este m�todo suma tres n�meros reales introducidos y muestra la soluci�n de la suma por pantalla.
	* 
	* @param num1 Representa el primer n�mero real a sumar.
	* @param num2 Representa el segundo n�mero real a sumar.
	* @param num3 Representa el tercer n�mero real a sumar.
	* @return Retornar� el resultado de la suma de los tres n�meros introducidos.
	* 
	*/
	
	public double sumaTresReales(double num1, double num2, double num3) {
		double num = num1 + num2 + num3;
		return Math.round(num*100.0)/100.0;
	}
	
	/**
	* Este m�todo guardar� el valor acumulado de la suma de los n�meros introducidos. 
	* 
	* @param Representa el primer n�mero real a sumar.
	* 
	* No retorna nada porque lo que hace este m�todo es acumular los valores de entrada.
	* 
	*/
	
	public void guardarValorAcumulado(double numero) {
		acumulado= acumulado + numero;
	}
	
	/**
	* Este m�todo sirve para consultar el valor acumulado de la suma de los n�meros introducidos. 
	* 
	* @return Retornar� el resultado de la suma de los n�meros introducidos.
	* 
	*/
	
	public double getValorAcumulado(){
        return acumulado;
    }
		
}

