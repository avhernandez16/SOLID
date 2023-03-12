package solution;

//Cada clase de persistencia implementará este método de guardado.
//ahora si quiero guardar el archivo en otro tipo simplemente creo una clase nueva y implemento la interfaz sin tener que modificar la clase principal
public interface FacturaPersistencia {
	 public void guardar(Factura factura);

}
