/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Vilte3501Tp5Application;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author Diego
 *
 */
@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {
	@Autowired
	private Usuario usuario;
	public static Logger LOG =LoggerFactory.getLogger(Vilte3501Tp5Application.class);

	@Override
	public void guardar() {
		// guarda un objeto usuario de la bd en este caso log muestra por consola
		LOG.info("el usuario fue guardado "+usuario.getApellido()+", "+usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		// recuperamos los datos del usuario
		LOG.info("Mostrar los datos del usuario");
		return null;
	}

	@Override
	public void eliminar() {
		// se elimina el objeto usuario de la bd 
		LOG.info("Se elimino el usuario de la bd");

	}

	@Override
	public Usuario modifiacar() {
		// modifica los datos del usuario en la bd
		LOG.info("Se modifico el usuario");
		return null;
	}

}
