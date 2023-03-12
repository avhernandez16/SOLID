package solution;
//El principio de inversión de dependencia establece que nuestras clases deben depender de interfaces o clases abstractas en lugar de clases y funciones concretas.

//esta clase ya no depende de datadog ahora depende de la abstraccion
public class OrderService {
	
	
	public OrderService(IEventNotificationService eventos) {
		//todo lo rotulado con esta interfaz realiza el codigo
	}
	
	public void GenerateOrder(Order order, IEventNotificationService eventos) {
		// codigo para crear la orden
		
		//enviar la notificacion a datadog
		eventos.LogEvent("la orden fue creada exitosamente");
		
	}
}
