package examen3;

/**
*La clase contiene el objeto Point.
*Tiene los metodos Point add y Point sub.
*
* @author Daniel.Calvo 
* @version 20 
* @since 30/05/2024 
* {@link} https://es.wikipedia.org/wiki/Producto_escalar
*/


public class Point {
	/**
	 * Declaracion de los integer x, y
	 */
	public Integer x, y;
	
	/**
	 * Creación del objeto Point mediante dos integer.
	 * 
	 * @param x Primer ineteger
	 * @param y Segundo integer
	 */
	Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Sumar valores a un Point.
	 * 
	 * @param p El objeto Point al cual le sumamos los valores
	 * @return Nuevo objeto Point con los valores ya sumados.
	 */
	public Point add(Point p) {
		return new Point(x + p.x, y + p.y);
	}
	/**
	 * Restar valores a un Point.
	 * 
	 * @param p El objeto Point al cual le restamos los valores
	 * @return Nuevo objeto Point con los valores ya restados.
	 */
	public Point sub(Point p) {
		return new Point(x - p.x, y - p.y);
	}
}
