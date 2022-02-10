/**
 * Esta clase implementará todos los métodos que están relacionados con la <b>sumas de la calculadora</b>.
 *
 * 
 * Tendrá varios métodos para operar con 2 o 3 números reales o enteros que se introducirán por teclado y 
 * un método que guardará el valor acumulado.
 * 
 * 
 * @author Lidia Díaz Mendoza
 * @version 1.0
 *
 */

public class Suma {
	
	// ATRIBUTOS DE CLASE
	
	private double acumulado;
	
	// METODOS	
	/**
	* Este método suma dos números reales introducidos y muestra la solución de la suma por pantalla.
	* 
	* @param num1 Representa el primer número real a sumar.
	* @param num2 Representa el segundo número real a sumar.
	* @return Retornará el resultado de la suma de los dos números reales introducidos.
	* 
	*/
	
	public double sumaDosReales(double num1, double num2) {
		double num = num1 + num2;
		return Math.round(num*100.0)/100.0;
	}
	
	
	/**
	* Este método suma dos números enteros introducidos y muestra la solución de la suma por pantalla.
	* 
	* @param num1 Representa el primer número entero a sumar.
	* @param num2 Representa el segundo número entero a sumar.
	* @return Retornará el resultado de la suma de los dos números enteros introducidos.
	* 
	*/
	
	public int sumaDosEnteros(int num1, int num2) {
		int num = num1 + num2;
		return num;
	}
	
	/**
	* Este método suma tres números reales introducidos y muestra la solución de la suma por pantalla.
	* 
	* @param num1 Representa el primer número real a sumar.
	* @param num2 Representa el segundo número real a sumar.
	* @param num3 Representa el tercer número real a sumar.
	* @return Retornará el resultado de la suma de los tres números introducidos.
	* 
	*/
	
	public double sumaTresReales(double num1, double num2, double num3) {
		double num = num1 + num2 + num3;
		return Math.round(num*100.0)/100.0;
	}
	
	/**
	* Este método guardará el valor acumulado de la suma de los números introducidos. 
	* 
	* @param Representa el primer número real a sumar.
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

