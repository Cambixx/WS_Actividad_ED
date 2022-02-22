package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import actividadED.*;

public class SumaTest {

	private Suma s1;
	
	@BeforeEach
	public void limpiarSuma() {
		
		s1 = new Suma();
		
	}
	
	
	
	@Test
	public void testSumaDosReales() {
		
		double resultado = s1.sumaDosReales(4.5, 2.1);
		
				
		double resultadoEsperado = 6.6;
		double resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = s1.sumaDosReales(5.6, -3.2);
		
		resultadoEsperado = 2.4;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = s1.sumaDosReales(-2.3, -4.1);
		
		resultadoEsperado = -6.4;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);

		resultado = s1.sumaDosReales(0, 0);
		
		resultadoEsperado = 0;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testSumaDosEnteros() {
		
		int resultado = s1.sumaDosEnteros(5, 3);
		
		int resultadoEsperado = 8;
		int resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = s1.sumaDosEnteros(8, -6);
		
		resultadoEsperado = 2;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = s1.sumaDosEnteros(-5, -6);
		
		resultadoEsperado = -11;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = s1.sumaDosEnteros(0, 0);
		
		resultadoEsperado = 0;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testSumaTresReales() {
		
		double resultado = s1.sumaTresReales(5.2, 8.3, 1.4);
		
		
		double resultadoEsperado = 14.9;
		double resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = s1.sumaTresReales(-5.8, 0, 8);
		
		resultadoEsperado = 2.2;
		resultadoObtenido = resultado;
		
		resultado = s1.sumaTresReales(-12.8, -2.2, 1);
				
		resultadoEsperado = -14;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = s1.sumaTresReales(0, 0, 0);
		
		
		resultadoEsperado = 0;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testGuardarValorAcumulado() {
		
		s1.guardarValorAcumulado(5);
		s1.guardarValorAcumulado(3.3);
		
		double resultadoEsperado = 8.3;
		double resultadoObtenido = s1.getValorAcumulado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		s1.guardarValorAcumulado(-2.1);
				
		resultadoEsperado = 6.2;
		resultadoObtenido = s1.getValorAcumulado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		
	}
	
	

}
