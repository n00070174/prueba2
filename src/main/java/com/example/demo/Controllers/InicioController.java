package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
	
	//@RequestMapping("/")
	@GetMapping({"/","/MenuPrincipal"})
	public String MenuPrincipal() {
		return "MenuPrincipal"	;
	}
}
