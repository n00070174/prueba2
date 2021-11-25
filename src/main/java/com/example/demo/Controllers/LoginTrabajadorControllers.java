package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Usuario;
import com.example.demo.services.IUsuarioService;

@Controller
public class LoginTrabajadorControllers {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/auth/LoginTrabajador")
	public String login(Model model) {
		model.addAttribute("Usuario", new Usuario());
		
		return "loginTrabajador";
	}
	@GetMapping("/auth/registro")
	public String registroForm(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "registro";
		
	}
	
	@PostMapping("/auth/registro")
	public String GuardarRegistro(@Validated @ModelAttribute Usuario usuario, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "redirect:/auth/registro";
		}
		else {
			model.addAttribute("usuario", usuarioService.registrar(usuario));
			
		}
		
		return "redirect:/auth/LoginTrabajador";
			
	}
}
