package modelo;

import model.DAO.Interfaz;

public class Capacitacion implements Interfaz {

	private int idCapacitacion;
	private String nombreCapacitacion;
	private String detalleCapacitacion;

	public Capacitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Capacitacion(int idCapacitacion, String nombreCapacitacion, String detalleCapacitacion) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.nombreCapacitacion = nombreCapacitacion;
		this.detalleCapacitacion = detalleCapacitacion;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}

	public void setNombreCapacitacion(String nombreCapacitacion) {
		this.nombreCapacitacion = nombreCapacitacion;
	}

	public String getDetalleCapacitacion() {
		return detalleCapacitacion;
	}

	public void setDetalleCapacitacion(String detalleCapacitacion) {
		this.detalleCapacitacion = detalleCapacitacion;
	}


	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", nombreCapacitacion=" + nombreCapacitacion
				+ ", detalleCapacitacion=" + detalleCapacitacion + "]";
	}

	
	@Override
	public void obtenerCapacitaciones() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarCapacitacion(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		
	}
	
	

}
