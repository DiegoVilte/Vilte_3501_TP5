/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Vilte3501Tp5Application;
import ar.edu.unju.fi.model.Equipo;

/**
 * @author Diego
 *
 */
@Repository("equipoImp")
public class EquipoImp implements IEquipo {
	@Autowired
	private Equipo equipo;
	
	public static Logger LOG=LoggerFactory.getLogger(Vilte3501Tp5Application.class);

	@Override
	public void guardar() {
		// guarda el objeto en la bd
		LOG.info("El equipo fue guardado -> "+equipo.getNombre()+", "+equipo.getEstadio());
		
	}

	@Override
	public Equipo mostrar() {
		// se muestra todos los datos del equipo
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto equipo de la bd
		LOG.info("Se elimina el equipo de la bd");

	}

	@Override
	public Equipo modificar() {
		// se modifican los datos del equipo
		LOG.info("Se modificaron los datos del equipo ");
		return equipo;
	}

}
