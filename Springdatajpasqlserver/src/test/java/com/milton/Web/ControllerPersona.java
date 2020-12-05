package com.milton.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.miltonDAO.PersonaDao;

@Controller
public class ControllerPersona {

	@Autowired
	private PersonaDao perDAO;
	
	@GetMapping("/")
	public String Inicio() {
		
		var MostrarPersonas= perDAO.findAll();
		
		for (var iteracion:MostrarPersonas) {
			
			System.out.println(iteracion.getNombre());
			
		}
		return "index";
	}
}
