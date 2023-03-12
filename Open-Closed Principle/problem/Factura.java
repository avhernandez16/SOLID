package problem;

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
