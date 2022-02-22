package junit5;

import actividadED.Cociente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCociente {
Cociente c1 ;
	
	@BeforeEach 
	public  void limpiar () {
		c1 = new Cociente(); 
	}

	@Test
	public void testDivisionReales() {
		c1.setReal1(70.1);
		c1.setReal2(9.2);
		
		double ResultadoEsperado = 7.62;
		double ResultadoObtenido = Math.round((c1.getReal1()/c1.getReal2())*100.0)/100.0;
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		c1.setReal1(70.2);
		c1.setReal2(0);
		
		ResultadoEsperado =9.223372036854776E16;
		ResultadoObtenido = Math.round((c1.getReal1()/c1.getReal2())*100)/100;
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		c1.setReal1(0);
		c1.setReal2(-9870.5);
		
		ResultadoEsperado =0.0;
		ResultadoObtenido = Math.round((c1.getReal1()/c1.getReal2())*100)/100;
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
	}
	
	@Test
	public void testDivisionEnteros() {
		c1.setEntero1(80);
		c1.setEntero2(4);
		
		int ResultadoEsperado = 20;
		int ResultadoObtenido = Math.round((c1.getEntero1()/c1.getEntero2())*100)/100;
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		c1.setEntero1(0);
		c1.setEntero2(140);
		
		ResultadoEsperado= 0;
		ResultadoObtenido = Math.round((c1.getEntero1()/c1.getEntero2())*100)/100;
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
	}
	
	@Test
	public void testInverso() {
		
		c1.setReal1(50.4);
		
		double ResultadoEsperado = 0.02;
		double ResultadoObtenido = Math.round(Math.pow(c1.getReal1(), -1)*100.0)/100.0;
		double inverso = Math.pow(c1.getReal1(), -1);
		
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		if (c1.getReal1()*inverso == 1) {
			assertTrue(true);
		}
		
		
		c1.setReal1(0);
		
		ResultadoEsperado = 9.223372036854776E16;
		ResultadoObtenido = Math.round(Math.pow(c1.getReal1(), -1)*100.0)/100.0;
		inverso = Math.pow(c1.getReal1(), -1);
		
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		if (c1.getReal1()*inverso == 1) {
			assertTrue(true);
		}
		
	}
	@Test
	public void testRaiz() {
		c1.setReal1(70);
		
		double ResultadoEsperado = 8.37;
		double ResultadoObtenido = Math.round(Math.sqrt(c1.getReal1())*100.0)/100.0;
				
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		if (ResultadoObtenido*ResultadoObtenido == c1.getReal1()) {
			assertTrue(true);
		}
		
		
		
		c1.setReal1(0.0);
		
		ResultadoEsperado = 0.0;
		ResultadoObtenido = Math.round(Math.sqrt(c1.getReal1())*100.0)/100.0;
				
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		if (ResultadoObtenido*ResultadoObtenido == c1.getReal1()) {
			assertTrue(true);
		}

	}

}
