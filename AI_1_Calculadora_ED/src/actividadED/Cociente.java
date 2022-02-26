package actividadED;
/**
 * Clase que contiene los m�todos para hacer c�lculos de divisiones y tienen como
 * resultado un cociente.
 * 
 * @author Carlos Miguel R�bago
 * @version 1
 */


public class Cociente {
	
	

	/**
	 * M�todo que calcula el <b>cociente</b> de una divisi�n de 2 n�meros reales.<br>
	 * El cociente es el resultado al que se llega tras dividir un n�mero (dividendo)
	 * por otro n�mero (divisor).<br>
	 * 
	 * Si el <b>divisor</b> es = 0 el valor cociente se ver� representado como: 'Infinity' (infinito).
	 *  
	 * @param num1 representa el <b>dividendo</b> de la divisi�n, que debe ser un n�mero real
	 * con el cual se va a calcular el cociente.
	 * @param num2 representa el <b>divisor</b> de la divisi�n, que debe ser un n�mero real con
	 * el cual se va a calcular el cociente.
	 *
	 * @return Dato de tipo double que representa el <b>cociente</B> de la divisi�n de
	 * num1 por num2.
	 */
	
	public double divisionReales(double num1, double num2) {
						
		double d = num1/num2;
		return Math.round(d*100.0)/100.0;
		
	}
	
	/**
	 * M�todo que calcula el <b>cociente</b> de una divisi�n de 2 n�meros enteros.<br>
	 * El cociente es el resultado al que se llega tras dividir un n�mero (dividendo)
	 * por otro n�mero (divisor).<br>
	 * 
	 * Si el <b>divisor</b> es = 0 el valor cociente se ver� representado como: 'Infinity' (infinito).
	 *  
	 * @param num1 representa el <b>dividendo</b> de la divisi�n, que debe ser un n�mero <b>ENTERO</b>
	 * con el cual se va a calcular el cociente.
	 * @param num2 representa el <b>divisor</b> de la divisi�n, que debe ser un n�mero <b>ENTERO</b> con
	 * el cual se va a calcular el cociente.
	 *
	 * @return Dato de tipo double que representa el <b>cociente</B> de la divisi�n de
	 * num1 por num2.<br>
	 * Si el resultado no es exacto devolver� un numero decimal. 
	 * 
	 */
	
	public double divisionEnteros(int num1, int num2) {
						
		double d = (double)num1/num2;
		
		return Math.round(d*100.0)/100.0;
		
	}
	
	/**
	 * M�todo que calcula el <b>inverso</b> de un n�mero.<br>
	 * Un n�mero es inverso de otro si al multiplicarlos obtenemos como resultado
	 * la unidad. El elemento inverso, es igual a 1 partido por el n�mero.<br>
	 * Si el n�mero a calcular es = 0 el resultado se ver� representado como: <b>Infinity</b> (infinito).
	 * 
	 * @param num representa el n�mero al cual queremos calcular su inverso.
	 * @return Dato de tipo double que representa el inverso de <b>num</b>.
	 */
	
	public double inverso(double num) {
	
		double d = Math.pow(num, -1);
		
		return Math.round(d*100.0)/100.0;
	
	}
	
	/**
	 * M�todo que calcula la <b>raiz cuadrada</b> de un n�mero.<br>
	 * La ra�z cuadrada de un n�mero "A" es el n�mero "X" tal que "X" multiplicado
	 * por si mismo (X al cuadrado) seria "A".<br>
	 * El cuadrado de un n�mero nunca es negativo. Y esto es lo mismo que decir.
	 * No existe la ra�z de un n�mero negativo.
	 * 
	 * @param num representa el n�mero al cual queremos calcular la raiz cuadrada, 
	 * este n�mero debe ser <b>positivo</b>.<br>
	 * Si el n�mero(num) es negativo, el resultado se ver� representado como 'NaN'.
	 * @return Dato de tipo double que reporesenta la raiz cuadrada de <b>num</b>.
	 */
	
	public double raiz(double num) {
		
		double d = Math.sqrt(num);
		
		return Math.round(d*100.0)/100.0;
		
	}

}


