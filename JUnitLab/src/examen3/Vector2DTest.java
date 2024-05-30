package examen3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class Vector2DTest {

	/*
	Declaracion de vectores v1, v2,v3;
	*/
	Vector2D v1=new Vector2D(-2,4);
	Vector2D v2=new Vector2D(1,2);
	Vector2D v3=new Vector2D(2,1);
	
	/*
	 * Con @Before puedo crear un método setUp() que lance una excepción y en la cual instanciamos
	 * Los vectores v1 (-2,4), v2 (1,2) y v3 (2,1) Los vectores v1 y v3 sin ortogonales por 
	 * Lo que su producto escalar es 0 Que es lo que vamos a comprobar más adelante.
	 * 
	 */
	
	@Before void setUp() {
		
	}

	@Test
	public void testDotProduct() {
		/*
		 * Con assertEquals vamos a realizar unas pruebas unitarias del producto escalar que hemos 
		 * programado con anterioridad. Para ellos vamos acomprobar que el producto  de v1 por v3
		 * es 0 y que  el producto de v1 por v3 es....
		 */
		int esperado1=0;
		int esperado2=0;
		int v1v2=v1.dotProduct(v2);
		int v1v3=v1.dotProduct(v3);
		assertEquals(esperado1,v1v2);
		assertEquals(esperado2,v1v3);
	
	}
	
	@Test
	public void testOrthogonality() {
		/*
		 * Aqui vamos a comprobar que para los mismos vectores, que el método isOrtoghonalTo 
		 * se verifica para los vectores v1 y v3 y para el v2 y v3. Esta vez debes
		 * comprobar con los métodos AssertTrue y AssertFalse con los que convenga...
		 *  
		 */
		boolean v1v3= v1.isOrthogonalTo(v3);
		boolean v2v3= v2.isOrthogonalTo(v3);
		AssertTrue(v1v3);
		AssertFalse(v2v3);
	}



}
