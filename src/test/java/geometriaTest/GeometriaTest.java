package geometriaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import geometriaDto.Geometria;

class GeometriaTest {

	@Test
	public void TestAreacuadrado() {
		int resultado= Geometria.areacuadrado(2);
		int esperado= 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
    public void TestAreaCirculo() {
		double resultado = Geometria.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado);
		
	}
	
	@Test 
	public void TestAreaTriangulo() {
		int resultado = Geometria.areatriangulo(12,15);
		int esperado = 90;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestAreaRectangulo() {
		int resultado = Geometria.arearectangulo(5,10);
		int esperado = 50;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void TestAreaPentagono() {
		int resultado = Geometria.areapentagono(50,2);
		int esperado = 50;
		assertEquals(esperado, resultado);
	}

}
