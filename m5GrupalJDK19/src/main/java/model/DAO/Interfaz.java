package model.DAO;

import java.util.List;

import modelo.Capacitacion;

public interface Interfaz {
	
    void almacenarCapacitacion(Capacitacion capacitacion);
    
    List<Capacitacion> obtenerCapacitaciones();
    
}
