package com.trifulcas.jjee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import javax.validation.Valid;

@Controller
@RequestMapping("/alumno")
public class InicioController {
	@RequestMapping("")
	public String verPagina() {
		return "inicio";
	}
	
	@RequestMapping("/form")
	public String verform(Model modelo) {
			Alumno alumno = new Alumno();
			modelo.addAttribute("alumno", alumno);
			return "form-alumno";
	}
	
	@RequestMapping("/procesar")
	public String procesarForm(@Valid @ModelAttribute("alumno") Alumno alumno, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form-alumno";
		} else {
			return "ver-alumno";
		}
	}
}
