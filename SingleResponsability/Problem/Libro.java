//El Principio de Responsabilidad Única dice que una clase debe hacer una cosa y, 
//por lo tanto, debe tener una sola razón para cambiar

package Problem;

public class Libro {
	String nombre;
	String nombreAutor;
	int anyo;
	int precio;
	String isbn;

	public Libro(String nombre, String nombreAutor, int anyo, int precio, String isbn) {
		this.nombre = nombre;
		this.nombreAutor = nombreAutor;
		this.anyo = anyo;
        this.precio = precio;
		this.isbn = isbn;
	}
}
