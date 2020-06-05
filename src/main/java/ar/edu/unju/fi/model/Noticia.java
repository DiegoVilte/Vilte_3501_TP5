/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * @author Diego
 *
 */@Component
public class Noticia {
	private LocalDate fecha;
	private String titulo;
	private String resumen;
	
//-------------->>>-CONSTRUCTORES-<<<--------------------
	/**
	 * 
	 */
	public Noticia() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param fecha
	 * @param titulo
	 * @param resumen
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}
//-------------MOTOCOS ACCESORES GETTERS Y SETTERS---------------
	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}
	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
}
