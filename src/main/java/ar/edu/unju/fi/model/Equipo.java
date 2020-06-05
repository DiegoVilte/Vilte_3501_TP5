/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

/**
 * @author Diego
 *
 */
@Component
public class Equipo {
	private String nombre;
	private Estadio estadio;
//-----------------CONSTRUCTORES-----------------------
	/**
	 * Constructor por defecto sin parametros
	 */
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	/**Constructor sobre cargado
	 * @param nombre nombre del equipo
	 * @param estadio del equipo de tipo Estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}
//----------METODOS ACCESORES GETTERS Y SETTERS---------
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}
	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
}
