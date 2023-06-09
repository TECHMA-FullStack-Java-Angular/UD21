package geometriaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import geometria.Geometria;

class GeometriaTest {

	Geometria geometria;

	@BeforeEach
	public void before() {
		geometria = new Geometria();
	}

	// Test constructores
	@Test
	void testGeometriaConstructor() {
		geometria = new Geometria(1); // constructor con argumento
		Geometria resultado = geometria;
		assertEquals(1, resultado.getId());// prueba id
		assertEquals("cuadrado", resultado.getNom());// prueba nombre
		assertEquals(0.0, resultado.getArea());// prueba area con valor por defecto
	}

	@Test
	void testGeometriaConstructorVacio() {
		geometria = new Geometria();// constructor vacio
		Geometria resultado = geometria;
		// valores por defecto de id, nombre y area
		assertEquals(9, resultado.getId());
		assertEquals("Default", resultado.getNom());
		assertEquals(0.0, resultado.getArea());
	}

	// Tests metodos

	@Test
	public void TestAreacuadrado() {
		int resultado = geometria.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestAreaCirculo() {
		double resultado = geometria.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado);

	}

	@Test
	public void TestAreaTriangulo() {
		int resultado = geometria.areatriangulo(12, 15);
		int esperado = 90;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestAreaRectangulo() {
		int resultado = geometria.arearectangulo(5, 10);
		int esperado = 50;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestAreaPentagono() {
		int resultado = geometria.areapentagono(50, 2);
		int esperado = 50;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestAreaRombo() {
		int resultado = geometria.arearombo(50, 2);
		int esperado = 50;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestAreaRomboide() {
		int resultado = geometria.arearomboide(5, 10);
		int esperado = 50;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestAreaTrapecio() {
		int resultado = geometria.areatrapecio(3, 3, 5);
		int esperado = 15;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestFigura() {

		assertEquals("cuadrado", geometria.figura(1));
		assertEquals("Circulo", geometria.figura(2));
		assertEquals("Triangulo", geometria.figura(3));
		assertEquals("Rectangulo", geometria.figura(4));
		assertEquals("Pentagono", geometria.figura(5));
		assertEquals("Rombo", geometria.figura(6));
		assertEquals("Romboide", geometria.figura(7));
		assertEquals("Trapecio", geometria.figura(8));
		assertEquals("Default", geometria.figura(11));
	}

	// Tests getters y setters
	@Test
	public void TestGetId() {
		int resultado = geometria.getId();
		int esperado = 9;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestSetId() {
		geometria.setId(10);
		int resultado = geometria.getId();
		int esperado = 10;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestGetNom() {

		String resultado = geometria.getNom();
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestSetNom() {
		geometria.setNom("prueba");
		String resultado = geometria.getNom();
		String esperado = "prueba";
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestGetArea() {

		double resultado = geometria.getArea();
		double esperado = 0.0;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestSetArea() {
		geometria.setArea(15);
		double resultado = geometria.getArea();
		double esperado = 15;
		assertEquals(esperado, resultado);
	}

	@Test
	public void TestToString() {

		String resultado = geometria.toString();
		String esperado = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(esperado, resultado);
	}

}
