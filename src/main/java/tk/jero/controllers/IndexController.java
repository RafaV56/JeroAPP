package tk.jero.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller  //Controladores tienen que ir en un paquete debajo del paquete principal
@RequestMapping("/")//Ruta url para poder acceder a cada url de los metodos
public class IndexController {
	
	@Value("${app.title}")
	private String titulo;
	
	@GetMapping({"/index","/","home"})//puedes asignar distintas urls a la mismo controlador
	public String index(@RequestParam(name = "name",required = false,defaultValue = "usuario")String name,Model model) {
		model.addAttribute("name",name);//Usamos la clase Model para pasar parametros a las vistas. con el método addAtribute
		model.addAttribute("title",titulo);//Usamos un atributo de la clase properties
		return "index";
	}

}
