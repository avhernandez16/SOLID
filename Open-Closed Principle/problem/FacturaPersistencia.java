//El principio de apertura y cierre exige que las clases deban estar abiertas a la extensión y cerradas a la modificación.

//Modificación significa cambiar el código de una clase existente y extensión significa agregar una nueva funcionalidad.


package problem;
//Digamos que nuestro jefe vino a nosotros y dijo que quiere que las facturas se guarden en una base de datos para que podamos buscarlas fácilmente.
public class FacturaPersistencia {
	 	Factura factura;

	    public FacturaPersistencia(Factura factura) {
	        this.factura = factura;
	    }

	    public void guardarArchivo(String nombreArchivo) {
	        // Crea un archivo con el nombre dado y escribe la factura.
	    }

	    public void guardarEnBaseDatos() {
	        // Guarda la factura en la base de datos
	    }

}
