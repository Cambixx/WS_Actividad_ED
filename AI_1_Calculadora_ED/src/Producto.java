/**
 * CLASE QUE IMPLEMENTAR� TODOS LOS M�TODOS QUE ESTAN RELACIONADOS CON LA MULTIPLICACI�N DE LA CALCULADORA.
 * @author SERGIO MART�NEZ RIVERA
 * @version 1
 *
 */
public class Producto {

	/**
	 * METODO QUE CALCULA LA MULTIPLICACI�N DE DOS N�MEROS REALES. 
	 * 
	 * @param numero1 REPRESENTA EL PRIMER NUMERO REAL DE LA MULTIPLICACI�N.
	 * @param numero2  REPRESENTA EL SEGUNDO NUMERO REAL DE LA MULTIPLICACI�N.
	 * 		  
	 * @return RETORNARA UNA CADENA QUE CONTIENE EL RESULTADO DE LA MULTIPLICACI�N 
	 *  REDONDEADA A DOS DECIMALES HACIENDO USO DEL Math.round.
	 */
	public String ProductoReales (double numero1, double numero2) { 

		double n= numero1*numero2 ;
			return "El resultado de la multiplicar : " + numero1 + " * " + numero2 +
				" es igual a " + Math.round(n*100.0)/100.0 ;
		
	}
	
	/**
	 * METODO QUE CALCULA LA MULTIPLICACI�N DE DOS N�MEROS ENTEROS. 
	 * 
	 * @param numero1  REPRESENTA EL PRIMER NUMERO ENTERO DE LA MULTIPLICACI�N.
	 * @param numero2  REPRESENTA EL SEGUNDO NUMERO ENTERO DE LA MULTIPLICACI�N.
	 * 		  
	 * @return RETORNARA UNA CADENA QUE CONTIENE EL RESULTADO DE LA MULTIPLICACI�N..
	 * @deprecated EL M�TODO {@link #ProductoReales (double, double)} TAMBI�N ME CALCULA DOS N�MEROS ENTEROS.
	 */
	
	
	public String ProductoEnteros (int numero1, int numero2) {
		int n = numero1*numero2;
		return "El resultado de la multiplicar : " + numero1 + " * " + numero2 +
				" es igual a " + n ;
		
		
	}
	
	/**
	 * METODO QUE CALCULA LA MULTIPLICACI�N DE DOS N�MEROS REALES. 
	 * 
	 * @param numero1  REPRESENTA EL PRIMER N�MERO REAL DE LA MULTIPLICACI�N.
	 * @param numero2  REPRESENTA EL SEGUNDO N�MERO REAL DE LA MULTIPLICACI�N.
	 * @param numero3  REPRESENTA EL TERCER N�MERO REAL DE LA MULTIPLICACI�N	  
	 * @return RETORNARA UNA CADENA QUE CONTIENE EL RESULTADO DE LA MULTIPLICACI�N 
	 *  REDONDEADA A DOS DECIMALES, HACIENDO USO DEL Math.round.
	 */
	
	public  String ProductoTresReales ( double numero1, double numero2, double numero3) {
		double n = numero1*numero2*numero3;
		return "El resultado de la multiplicar : " + numero1 + " * " + numero2 + " * " + numero3 + 
				" es igual a " + Math.round(n*100.0)/100.0;
		
		
	}
	
	/**
	 * METODO QUE CALCULA EL RESULTADO DE UNA POTENCIA.
	 * LA POTENCIACI�N ES UNA OPERACI�N QUE CONSISTE EN MULTIPLICAR POR S� MISMO UN N�MERO PRINCIPAL LLAMADO BASE,
	 * TANTAS VECES COMO LO INDIQUE OTRO N�MERO QUE SE LLAMA EXPONENTE.
	 * @param base N�MERO REAL O ENTERO QUE SERVIR� COMO BASE DE LA POTENCIA.
	 * @param exponente N�MERO REAL O ENTERO QUE SERVIR� COMO EXPONENTE DE LA POTENCIA.
	 * @return  RETORNARA UNA CADENA QUE CONTIENE EL RESULTADO DE LA POTENCIA REDONDEADA
	 *  A DOS DECIMALES, HACIENDO USO DEL Math.round. DAR� ERROR SI EL RESULTADO ES MAS GRANDE DE UN DOUBLE.
	 */
	
	public String Potencia (double base, double exponente) {
		double n = Math.round(Math.pow(base, exponente)*100.0)/100.0;
		return  "El resultado de la potencia con base : " + base + " y con exponente:  " + exponente + 
				" es igual a " + n ;
		
		
	}
}
