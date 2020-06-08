/**
 * 
 */
package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuario;

/**
 * @author Diego
 *
 */
@Repository
public class UsuarioServiceImp implements IUsuarioService {
	@Autowired
	private IUsuario iusuario;

	@Override
	public void guardar() {
		// accion wue guarda un objeto en la bd
		iusuario.guardar();
	}

	@Override
	public Usuario mostrar() {
		// se recuperan todos los datos del usuario
		Usuario usuario=iusuario.mostrar();
		return usuario;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iusuario.eliminar();

	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		Usuario usuario=iusuario.modifiacar();
		return usuario;
	}

}
