package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Usuario;
//import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Vilte3501Tp5Application implements CommandLineRunner {
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	/*
	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo equipo;
	*/

	public static void main(String[] args) {
		SpringApplication.run(Vilte3501Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Inicializacion de las variables del objeto usuario
		usuario.setApellido("Perez");
		usuario.setDireccion("Av Mitre 256");
		usuario.setDni(30215478);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1980, 11, 12));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		usuarioService.guardar();
		
		
	}
	

}
