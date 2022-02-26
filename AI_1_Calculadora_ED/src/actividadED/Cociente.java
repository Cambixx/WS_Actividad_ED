package actividadED;
/**
 * Clase que contiene los métodos para hacer cálculos de divisiones y tienen como
 * resultado un cociente.
 * 
 * @author Carlos Miguel Rábago
 * @version 1
 */


public class Cociente {
	
	

	/**
	 * Método que calcula el <b>cociente</b> de una división de 2 números reales.<br>
	 * El cociente es el resultado al que se llega tras dividir un número (dividendo)
	 * por otro número (divisor).<br>
	 * 
	 * Si el <b>divisor</b> es = 0 el valor cociente se verá representado como: 'Infinity' (infinito).
	 *  
	 * @param num1 representa el <b>dividendo</b> de la división, que debe ser un número real
	 * con el cual se va a calcular el cociente.
	 * @param num2 representa el <b>divisor</b> de la división, que debe ser un número real con
	 * el cual se va a calcular el cociente.
	 *
	 * @return Dato de tipo double que representa el <b>cociente</B> de la división de
	 * num1 por num2.
	 */
	
	public double divisionReales(double num1, double num2) {
						
		double d = num1/num2;
		return Math.round(d*100.0)/100.0;
		
	}
	
	/**
	 * Método que calcula el <b>cociente</b> de una división de 2 números enteros.<br>
	 * El cociente es el resultado al que se llega tras dividir un número (dividendo)
	 * por otro número (divisor).<br>
	 * 
	 * Si el <b>divisor</b> es = 0 el valor cociente se verá representado como: 'Infinity' (infinito).
	 *  
	 * @param num1 representa el <b>dividendo</b> de la división, que debe ser un número <b>ENTERO</b>
	 * con el cual se va a calcular el cociente.
	 * @param num2 representa el <b>divisor</b> de la división, que debe ser un número <b>ENTERO</b> con
	 * el cual se va a calcular el cociente.
	 *
	 * @return Dato de tipo double que representa el <b>cociente</B> de la división de
	 * num1 por num2.<br>
	 * Si el resultado no es exacto devolverá un numero decimal. 
	 * 
	 */
	
	public double divisionEnteros(int num1, int num2) {
						
		double d = (double)num1/num2;
		
		return Math.round(d*100.0)/100.0;
		
	}
	
	/**
	 * Método que calcula el <b>inverso</b> de un número.<br>
	 * Un número es inverso de otro si al multiplicarlos obtenemos como resultado
	 * la unidad. El elemento inverso, es igual a 1 partido por el número.<br>
	 * Si el número a calcular es = 0 el resultado se verá representado como: <b>Infinity</b> (infinito).
	 * 
	 * @param num representa el número al cual queremos calcular su inverso.
	 * @return Dato de tipo double que representa el inverso de <b>num</b>.
	 */
	
	public double inverso(double num) {
	
		double d = Math.pow(num, -1);
		
		return Math.round(d*100.0)/100.0;
	
	}
	
	/**
	 * Método que calcula la <b>raiz cuadrada</b> de un número.<br>
	 * La raíz cuadrada de un número "A" es el número "X" tal que "X" multiplicado
	 * por si mismo (X al cuadrado) seria "A".<br>
	 * El cuadrado de un número nunca es negativo. Y esto es lo mismo que decir.
	 * No existe la raíz de un número negativo.
	 * 
	 * @param num representa el número al cual queremos calcular la raiz cuadrada, 
	 * este número debe ser <b>positivo</b>.<br>
	 * Si el número(num) es negativo, el resultado se verá representado como 'NaN'.
	 * @return Dato de tipo double que reporesenta la raiz cuadrada de <b>num</b>.
	 */
	
	public double raiz(double num) {
		
		double d = Math.sqrt(num);
		
		return Math.round(d*100.0)/100.0;
		
	}

}


