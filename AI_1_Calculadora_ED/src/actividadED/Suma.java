package actividadED;
/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la <b>sumas de la calculadora</b>.
 *
 * 
 * Tendr� varios m�todos para operar con 2 o 3 n�meros reales o enteros que se introducir�n por teclado y 
 * un m�todo que guardar� el valor acumulado.
 * 
 * 
 * @author Lidia D�az Mendoza
 * @version 2.0
 *
 */

public class Suma {
	
	// ATRIBUTOS DE CLASE
	/**
	 * Atributo para el m�todo guardarValorAcumulado, que guardar� la suma de los n�meros introducidos.
	 */
	
	private double acumulado;
	
	// METODOS	
	/**
	* Este m�todo suma <b>dos n�meros reales</b> introducidos y muestra la soluci�n de la suma por pantalla. 
	* Los n�meros introducidos podr�n ser positivos o negativos.
	* 
	* @param num1 Representa el <b>primer n�mero real a sumar.</b>
	* @param num2 Representa el <b>segundo n�mero real a sumar.</b>
	* 
	* @return Retornar� el resultado de la suma de los <b>dos n�meros reales</b> introducidos.
	* 
	*/
	
	public double sumaDosReales(double num1, double num2) {
		double num = num1 + num2;
		return Math.round(num*100.0)/100.0;
	}
	
	
	/**
	* Este m�todo suma <b>dos n�meros enteros</b> introducidos y muestra la soluci�n de la suma por pantalla.
	* Los n�meros introducidos podr�n ser positivos o negativos.
	* 
	* @param num1 Representa el <b>primer n�mero entero</b> a sumar.
	* @param num2 Representa el <b>segundo n�mero entero</b> a sumar.
	* 
	* @return Retornar� el resultado de la suma de los <b>dos n�meros enteros</b> introducidos.
	* 
	*/
	
	public int sumaDosEnteros(int num1, int num2) {
		int num = num1 + num2;
		return num;
	}
	
	/**
	* Este m�todo suma <b>tres n�meros reales</b> introducidos y muestra la soluci�n de la suma por pantalla.
	* Los n�meros introducidos podr�n ser positivos o negativos.
	* 
	* @param num1 Representa el <b>primer n�mero real</b> a sumar.
	* @param num2 Representa el <b>segundo n�mero real</b> a sumar.
	* @param num3 Representa el <b>tercer n�mero real</b> a sumar.
	* @return Retornar� el resultado de la suma de los tres n�meros introducidos.
	* 
	*/
	
	public double sumaTresReales(double num1, double num2, double num3) {
		double num = num1 + num2 + num3;
		return Math.round(num*100.0)/100.0;
	}
	
	/**
	* Este m�todo <b>guardar� el valor acumulado</b> de la suma de los <b>n�meros introducidos</b>.
	* Los n�meros introducidos podr�n ser positivos o negativos. 
	* 
	* @param numero Representa el <b>primer n�mero real</b> a sumar.
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

