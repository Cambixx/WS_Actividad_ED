package actividadED;
/**
 * Esta clase implementará todos los métodos que están relacionados con la <b>sumas de la calculadora</b>.
 *
 * 
 * Tendrá varios métodos para operar con 2 o 3 números reales o enteros que se introducirán por teclado y 
 * un método que guardará el valor acumulado.
 * 
 * 
 * @author Lidia Díaz Mendoza
 * @version 2.0
 *
 */

public class Suma {
	
	// ATRIBUTOS DE CLASE
	/**
	 * Atributo para el método guardarValorAcumulado, que guardará la suma de los números introducidos.
	 */
	
	private double acumulado;
	
	// METODOS	
	/**
	* Este método suma <b>dos números reales</b> introducidos y muestra la solución de la suma por pantalla. 
	* Los números introducidos podrán ser positivos o negativos.
	* 
	* @param num1 Representa el <b>primer número real a sumar.</b>
	* @param num2 Representa el <b>segundo número real a sumar.</b>
	* 
	* @return Retornará el resultado de la suma de los <b>dos números reales</b> introducidos.
	* 
	*/
	
	public double sumaDosReales(double num1, double num2) {
		double num = num1 + num2;
		return Math.round(num*100.0)/100.0;
	}
	
	
	/**
	* Este método suma <b>dos números enteros</b> introducidos y muestra la solución de la suma por pantalla.
	* Los números introducidos podrán ser positivos o negativos.
	* 
	* @param num1 Representa el <b>primer número entero</b> a sumar.
	* @param num2 Representa el <b>segundo número entero</b> a sumar.
	* 
	* @return Retornará el resultado de la suma de los <b>dos números enteros</b> introducidos.
	* 
	*/
	
	public int sumaDosEnteros(int num1, int num2) {
		int num = num1 + num2;
		return num;
	}
	
	/**
	* Este método suma <b>tres números reales</b> introducidos y muestra la solución de la suma por pantalla.
	* Los números introducidos podrán ser positivos o negativos.
	* 
	* @param num1 Representa el <b>primer número real</b> a sumar.
	* @param num2 Representa el <b>segundo número real</b> a sumar.
	* @param num3 Representa el <b>tercer número real</b> a sumar.
	* @return Retornará el resultado de la suma de los tres números introducidos.
	* 
	*/
	
	public double sumaTresReales(double num1, double num2, double num3) {
		double num = num1 + num2 + num3;
		return Math.round(num*100.0)/100.0;
	}
	
	/**
	* Este método <b>guardará el valor acumulado</b> de la suma de los <b>números introducidos</b>.
	* Los números introducidos podrán ser positivos o negativos. 
	* 
	* @param numero Representa el <b>primer número real</b> a sumar.
	* 
	* No retorna nada porque lo que hace este método es acumular los valores de entrada.
	* 
	*/
	
	public void guardarValorAcumulado(double numero) {
		acumulado= acumulado + numero;
	}
	
	/**
	* Este método sirve para consultar el valor acumulado de la suma de los números introducidos. 
	* 
	* @return Retornará el resultado de la suma de los números introducidos.
	* 
	*/
	
	public double getValorAcumulado(){
        return acumulado;
    }
		
}

