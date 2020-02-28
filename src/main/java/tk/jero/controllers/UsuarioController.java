package tk.jero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import tk.jero.models.Jugador;
import tk.jero.resources.Fecha;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	// Valor de la variable que se encuentra en el application.properties
	@Value("${app.title}")
	private String titulo;

	@GetMapping("/ver")
	public String indexUsuario(Model model) {
		jugador.setNombre("Jero");
		jugador.setEdad(new Fecha(04, 10, 2004));
		jugador.setTalla(1.60);
		model.addAttribute("jugador",jugador);
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
	
	@Autowired
	private Jugador jugador;
	
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
