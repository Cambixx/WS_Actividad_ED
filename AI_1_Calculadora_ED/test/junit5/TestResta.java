package junit5;

import actividadED.Resta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestResta {


	private Resta r1;

	
	@BeforeEach
	public void limpiar() throws Exception {
		r1= new Resta();
	}
	
	@Test
	public void testrestaDosReales() {
		r1.setReal1(8.2);
		r1.setReal2(9.2);
		
		double ResultadoEsperado= -1;
		double ResultadoObtenido = r1.getReal1() - r1.getReal2();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		
		r1.setReal1(70.2);
		r1.setReal2(54.7);
		
		ResultadoEsperado=15.5;
		ResultadoObtenido=r1.getReal1() - r1.getReal2();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
	}
	
	@Test
	public void testrestaDosEnteros() {
		r1.setEntero1(65);
		r1.setEntero2(74);
		
		int ResultadoEsperado=-9;
		int ResultadoObtenido= r1.getEntero1() - r1.getEntero2();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		r1.setEntero1(1456);
		r1.setEntero2(-77);
		
		ResultadoEsperado=1533;
		ResultadoObtenido= r1.getEntero1() - r1.getEntero2();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	
	}
	
	@Test
	public void testrestaTresReales() {
		
		r1.setReal1(54.1);
		r1.setReal2(87.1);
		r1.setReal3(8.3);
		
		Double ResultadoEsperado=-41.3;
		Double ResultadoObtenido= r1.getReal1()-r1.getReal2()-r1.getReal3();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		r1.setReal1(55.1);
		r1.setReal2(-40.1);
		r1.setReal3(4.8);
		
		ResultadoEsperado= 90.4;
		ResultadoObtenido= r1.getReal1()-r1.getReal2()-r1.getReal3();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		
	}
	
	@Test
	public void testvalorAcumulado() {
		r1.valorAcumulado(r1.restaDosReales(5.4, 3.1));
		r1.valorAcumulado(r1.restaTresReales(90.5, 70.2, 20.1));
		
		double ResultadoEsperado= 2.5;
		double ResultadoObtenido= r1.getAcumulado();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		r1 = new Resta();
		
		r1.valorAcumulado(r1.restaDosReales(90.5, 88.1));
		r1.valorAcumulado(r1.restaDosEnteteros(70, 10));
		r1.valorAcumulado(r1.restaTresReales(77.1, 1.5, 4.2));
		ResultadoEsperado=133.8;
		ResultadoObtenido= r1.getAcumulado();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}
	
	
}
