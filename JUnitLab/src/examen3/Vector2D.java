package examen3;

/**
*La clase contiene el objeto Vector"D.
*Tiene los metodos dotProduct y isOrthogonalTo
*
* @author Daniel.Calvo 
* @version 20 
* @since 30/05/2024 
* {@link} https://es.wikipedia.org/wiki/Producto_escalar
*/


public class Vector2D {
	/**
	 * Declaracion de los integer x, y
	 */
	public Integer x, y;
	
	/**
	 * Creación del objeto Vector2D mediante dos integer.
	 * 
	 * @param x Primer integer
	 * @param y Segundo integer
	 */
	Vector2D(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Creación del objeto Vector2D mediante dos Point
	 * 
	 * @param p1 Primer Point
	 * @param p2 Segundo Point
	 */
	/* Construct Vector2D from two points */
	Vector2D(Point p1, Point p2) {
		this.x = p2.x - p1.x;
		this.y = p2.y - p1.y;
	}
	
	/**
	 * Iguala al producto de las magnitudes de los dos vectores y el coseno del ángulo entre ellos
	 * 
	 * @param v El Vector2D del que queremos sacar el dot product
	 * @return El resultado del dot product del Vector2D
	 */
	
	public int dotProduct(Vector2D v) {
		return (x * v.x) + (y * v.y);
	}
	
	/**
	 * Comprobacion si un Vector2D es Orthogonal
	 * @param v El Vector2D que queremos comprobar
	 * @return El resultado de si es orthogonal o no
	 */
	public boolean isOrthogonalTo(Vector2D v) {
		return (dotProduct(v) == 0);
	}
	
}