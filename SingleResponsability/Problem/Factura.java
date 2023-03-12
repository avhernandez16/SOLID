//Nuestra clase viola el Principio de Responsabilidad Única de múltiples maneras.

//La primera violación es el método imprimeFactura, el cual contiene nuestra lógica de impressión. El PRU establece que nuestra clase solo debería tener una única razón para cambiar, y esa razón debería ser un cambio en el cálculo de la factura para nuestra clase.

//Pero en esta arquitectura, si queremos cambiar el formato de impresión, necesitaríamos cambiar la clase. Esta es la razón por la que no deberíamos tener lógica de impresión mezclada con lógica de negocios en la misma clase.

//Hay otro método que viola el PRU en nuestra clase: el método guardarArchivo. También es un error extremadamente común mezclar la lógica de persistencia con la lógica de negocios.

//No piense solo en términos de escribir en un archivo, podría ser guardarlo en una base de datos, hacer una llamada a la API u otras cosas relacionadas con la persistencia.

package Problem;

public class Factura {
	private Libro libro;
	private int cantidad;
	private double tasaDescuento;
	private double tasaImpuesto;
	private double total;

	public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
		this.libro = libro;
		this.cantidad = cantidad;
		this.tasaDescuento = tasaDescuento;
		this.tasaImpuesto = tasaImpuesto;
		this.total = this.calculaTotal();
	}

	public double calculaTotal() {
	        double precio = ((libro.precio - libro.precio * tasaDescuento) * this.cantidad);

		double precioConImpuestos = precio * (1 + tasaImpuesto);

		return precioConImpuestos;
	}

	public void imprimeFactura() {
            System.out.println(cantidad + "x " + libro.nombre + " " +          libro.precio + "$");
            System.out.println("Tasa de Descuento: " + tasaDescuento);
            System.out.println("Tasa de Impuesto: " + tasaImpuesto);
            System.out.println("Total: " + total);
	}

        public void guardarArchivo(String nombreArchivo) {
	// Crea un archivo con el nombre dado y escribe la factura.
	}
}
