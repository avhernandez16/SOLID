package Solution;

public class test {

	public static void main(String[] args) {
		Libro book = new Libro("one player","pepito", 2010, 1000, "az-240");
		
		Factura fact = new Factura(book,2,10,10);
		
		FacturaImpresion f = new FacturaImpresion(fact);
		
		f.imprimir();
		
	}

}
