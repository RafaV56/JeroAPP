package tk.jero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import tk.jero.models.*;
import tk.jero.resources.*;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	
	/**
	 * Usuario de la aplicacíon
	 */
	@Autowired
	private Usuario usuario;
	// Valor de la variable que se encuentra en el application.properties
	@Value("${app.title}")
	private String titulo;

	@GetMapping("/ver")
	public String indexUsuario(Model model) {
		usuario.setNombre("Jero");
		usuario.setEdad(new Fecha(04, 10, 2004));
		usuario.setTalla(1.60);
		usuario.pruebasFuncionales.setAbdominal(new Abdominal(true, 56, new Fecha(10, 10, 2019, 20, 15)));
		model.addAttribute("jugador",usuario);
		return "usuario/ver";
	}
	
	/**
	 * Este método es un atributo que siempre llevará el Modelo, algo común para todos como la fecha
	 * @return
	 */
	@ModelAttribute("title")
	public String titulo() {
		return titulo;
	}
	
	
	/**
	 * Este método es un atributo que siempre llevará el Modelo, algo común para todos como la fecha
	 * @return
	 */
	@ModelAttribute("fecha")
	public Fecha fecha() {
		Fecha fecha=Fecha.creaFechaDeAhora();
		return fecha;
	}


}
