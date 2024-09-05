package model.DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Capacitacion;

public class ImplementacionInterfaz{

	
	private List<Capacitacion> listaCapacitaciones;
	
	public ImplementacionInterfaz() {
	    listaCapacitaciones = new ArrayList<>();
	}

	
	public void listarCapacitaciones() {
		boolean hayCapacitaciones = false;
		for (Capacitacion capacitacion : listaCapacitaciones) {
			System.out.println(capacitacion);
			hayCapacitaciones = true;
		}
		if (!hayCapacitaciones) {
			System.out.println("\n[------ No existen capacitaciones registradas. ------]\n");

		}
	}

	
    public void cargarCapacitacionesPredeterminadas() {
        Capacitacion capacitacion1 = new Capacitacion(1234, "Uso del Mouse", "Cómo usar correctamente el mouse");
        Capacitacion capacitacion2 = new Capacitacion(1235, "Teclado", "Curso sobre el uso eficiente del teclado");
        Capacitacion capacitacion3 = new Capacitacion(1236, "Monitor", "Aprender a ajustar correctamente el monitor");

        listaCapacitaciones.add(capacitacion1);
        listaCapacitaciones.add(capacitacion2);
        listaCapacitaciones.add(capacitacion3);
    }
	
		public void almacenarCapacitacion(Capacitacion capacitacion) {
		listaCapacitaciones.add(capacitacion);
	}
		
	    public List<Capacitacion> getListaCapacitaciones() {
	        return listaCapacitaciones;
	    }
}
