/**
 * 
 */
package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;

/**
 * @author Diego
 *
 */
@RequestMapping("/")
public class MainController {
	@Autowired
	private IUsuarioService usuarioService;
	@RequestMapping("index")
	public String main(Model model) {
		model.addAttribute("usuario", usuarioService.mostrar().getNombre());
		return "index";
	}
	
}
