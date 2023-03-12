package problem;
//El principio de inversión de dependencia establece que nuestras clases deben depender de interfaces o clases abstractas en lugar de clases y funciones concretas.

// si nos fijamos datadog es una clase concreta y si cambio de servicio debo cambiar todo el codigo
//se debe abstraer el servicio de notificaciones con una interfaz
public class OrderService {
	
	public DataDogService _datadogService;
	
	public OrderService(DataDogService _datadogService) {
		_datadogService = new DataDogService();
	}
	
	public void GenerateOrder(Order order) {
		// codigo para crear la orden
		
		//enviar la notificacion a datadog
		_datadogService.LogEvent("la orden fue creada exitosamente");
		
	}
}
