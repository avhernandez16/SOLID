//Nuestra clase viola el Principio de Responsabilidad Única de múltiples maneras.

//La primera violación es el método imprimeFactura, el cual contiene nuestra lógica de impressión. El PRU establece que nuestra clase solo debería tener una única razón para cambiar, y esa razón debería ser un cambio en el cálculo de la factura para nuestra clase.

//Pero en esta arquitectura, si queremos cambiar el formato de impresión, necesitaríamos cambiar la clase. Esta es la razón por la que no deberíamos tener lógica de impresión mezclada con lógica de negocios en la misma clase.

//Hay otro método que viola el PRU en nuestra clase: el método guardarArchivo. También es un error extremadamente común mezclar la lógica de persistencia con la lógica de negocios.

//No piense solo en términos de escribir en un archivo, podría ser guardarlo en una base de datos, hacer una llamada a la API u otras cosas relacionadas con la persistencia.

package Solution;

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
        double precio = (this.libro.getPrecio() - this.libro.getPrecio() * this.tasaDescuento/100) * this.cantidad;
        double precioConImpuestos = precio * (1 + (this.tasaImpuesto/100));      
        
        return precioConImpuestos;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTasaDescuento() {
		return tasaDescuento;
	}

	public void setTasaDescuento(double tasaDescuento) {
		this.tasaDescuento = tasaDescuento;
	}

	public double getTasaImpuesto() {
		return tasaImpuesto;
	}

	public void setTasaImpuesto(double tasaImpuesto) {
		this.tasaImpuesto = tasaImpuesto;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}	


}
