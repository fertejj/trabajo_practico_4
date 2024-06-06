package ar.edu.unju.fi.model;

public class Carrera {
	private String codigo;
	private String nombre;
	private int cantidadDeAños;
	private String estado;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadDeAños() {
		return cantidadDeAños;
	}

	public void setCantidadDeAños(int cantidadDeAños) {
		this.cantidadDeAños = cantidadDeAños;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
