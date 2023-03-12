//Declara que una subclase debe ser sustituible por su superclase, y si al hacer esto, el programa falla, estaremos violando este principio.

//no todas las clases obligatoriamente implementan estos metodos

package problem;

public interface Vehiculo {
	public void parquear();
	public void aterrizar();
	public void frenar();
	public void acelerar();
	public void despegar();
	
	
}
