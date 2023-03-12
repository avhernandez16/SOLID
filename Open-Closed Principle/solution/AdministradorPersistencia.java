package solution;

public class AdministradorPersistencia {
	FacturaPersistencia facturaPersistencia;
   
    //aqui usamos persistencia donde esta rotulado todo lo que hereda de esta interfaz
    public AdministradorPersistencia(FacturaPersistencia facturaPersistencia) {
        this.facturaPersistencia = facturaPersistencia;    
    }
}
