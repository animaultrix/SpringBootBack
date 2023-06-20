package com.misaldo.SpringBootBack.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misaldo.SpringBootBack.models.entity.Usuario;
import com.misaldo.SpringBootBack.models.services.IUsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired	
	private IUsuarioService usuarioService;
	@GetMapping("/usuarios")
	public List<Usuario> index(){
		return usuarioService.findAll();
	}
}
