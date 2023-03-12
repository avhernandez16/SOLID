//muchas interfaces especificas son mejores que una gran interfaz que trate de abarcar todo
//No se debe obligar a los clientes a implementar una función que no necesitan.

package problem;

public class BurgerOrderService implements IFoodOrderService {

	@Override
	public void OrderBurger(int cantidad) {
		// codigo para ordenar una hamburguesa
		
	}

	@Override
	public void OrderSteak(int cantidad) {
		// excepcion
		
	}

	@Override
	public void OrderSalad(int cantidad) {
		// excepcion
		
	}

}
