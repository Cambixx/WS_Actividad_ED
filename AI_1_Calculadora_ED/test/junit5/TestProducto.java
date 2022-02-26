package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import actividadED.Producto;

class TestProducto {

	private Producto p1;
	
	@BeforeEach
	public void limpiarProducto() {
		
		p1 = new Producto();
		
	}
	
	
	@Test
	void testProductoReales() {
		
		double resultado = p1.ProductoReales(73.1, 84);
		
		double resultadoEsperado = 6140.4;
		double resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = p1.ProductoReales(5.5, 0);
		
		resultadoEsperado = 0;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = p1.ProductoReales(-7.1, 4);
		
		resultadoEsperado = -28.4;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
	@Test
	void testProductoEnteros() {
		
		int resultado = p1.ProductoEnteros(2, 7);
		
		int resultadoEsperado = 14;
		int resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = p1.ProductoEnteros(55, 0);
		
		resultadoEsperado = 0;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = p1.ProductoEnteros(-7, 4);
		
		resultadoEsperado = -28;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
	@Test
	void testProductoTresReales() {
		
		double resultado = p1.ProductoTresReales(2.5, 5.1, 7.5);
		
		double resultadoEsperado = 95.63;
		double resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = p1.ProductoTresReales(5.5, 2.1, 0);
		
		resultadoEsperado = 0;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = p1.ProductoTresReales(7.1, -3.64, 8.64);
		
		resultadoEsperado = -223.29;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
	@Test
	void testPotencia() {
		
		double resultado = p1.Potencia(2.54, 5.55);
		
		double resultadoEsperado = 176.53;
		double resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = p1.Potencia(2.54, 0);
		
		resultadoEsperado = 1.00;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		resultado = p1.Potencia(2.54, -7.1);
		
		resultadoEsperado = 0;
		resultadoObtenido = resultado;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

}








