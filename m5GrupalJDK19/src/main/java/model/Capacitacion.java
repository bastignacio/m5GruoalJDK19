package model;

public class Capacitacion {

	private String nombreCapacitacion;
	private String fechaCapacitacion;
	private String duracionCapacitacion;
	private String descripcionCapacitacion;

	public Capacitacion() {

	}

	public Capacitacion(String nombreCapacitacion, String fechaCapacitacion, String duracionCapacitacion,
			String descripcionCapacitacion) {
		super();
		this.nombreCapacitacion = nombreCapacitacion;
		this.fechaCapacitacion = fechaCapacitacion;
		this.duracionCapacitacion = duracionCapacitacion;
		this.descripcionCapacitacion = descripcionCapacitacion;

	}

	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}

	public void setNombreCapacitacion(String nombreCapacitacion) {
		this.nombreCapacitacion = nombreCapacitacion;
	}

	public String getFechaCapacitacion() {
		return fechaCapacitacion;
	}

	public void setFechaCapacitacion(String fechaCapacitacion) {
		this.fechaCapacitacion = fechaCapacitacion;
	}

	public String getDuracionCapacitacion() {
		return duracionCapacitacion;
	}

	public void setDuracionCapacitacion(String duracionCapacitacion) {
		this.duracionCapacitacion = duracionCapacitacion;
	}

	public String getDescripcionCapacitacion() {
		return descripcionCapacitacion;
	}

	public void setDescripcionCapacitacion(String descripcionCapacitacion) {
		this.descripcionCapacitacion = descripcionCapacitacion;
	}

	@Override
	public String toString() {
		return "Capacitacion [nombreCapacitacion=" + nombreCapacitacion + ", fechaCapacitacion=" + fechaCapacitacion
				+ ", duracionCapacitacion=" + duracionCapacitacion + ", descripcionCapacitacion="
				+ descripcionCapacitacion + "]";
	}

}
