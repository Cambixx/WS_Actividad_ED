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
	
		
		double ResultadoEsperado= -1;
		double ResultadoObtenido = r1.restaDosReales(8.2, 9.2);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
		

		
		ResultadoEsperado=15.5;
		ResultadoObtenido=r1.restaDosReales(70.2, 54.7);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		
	}
	
	@Test
	public void testrestaDosEnteros() {
	
		
		int ResultadoEsperado=-9;
		int ResultadoObtenido= r1.restaDosEnteteros(65, 74);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		

		ResultadoEsperado=1533;
		ResultadoObtenido= r1.restaDosEnteteros(1456, -77);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	
	}
	
	@Test
	public void testrestaTresReales() {
		

		
		Double ResultadoEsperado=-41.3;
		Double ResultadoObtenido= r1.restaTresReales(54.1, 87.1, 8.3);
		assertEquals(ResultadoEsperado, ResultadoObtenido);
		

		
		ResultadoEsperado= 90.4;
		ResultadoObtenido= r1.restaTresReales(55.1, -40.1, 4.8);
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
