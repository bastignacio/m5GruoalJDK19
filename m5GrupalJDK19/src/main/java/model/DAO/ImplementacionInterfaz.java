package model.DAO;

import java.util.ArrayList;
import java.util.List;

import modelo.Capacitacion;

public class ImplementacionInterfaz implements Interfaz {
	
    private static List<Capacitacion> capacitaciones = new ArrayList<>();  // Lista estática compartida

    @Override
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
        // Imprime en consola para verificar que la capacitación se almacena correctamente
        //System.out.println("Capacitación almacenada: " + capacitacion.getNombreCapacitacion() + ", " + capacitacion.getDetalleCapacitacion());
    }

    @Override
    public List<Capacitacion> obtenerCapacitaciones() {
        return capacitaciones;
    }
}


	
    

