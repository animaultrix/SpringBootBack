package com.misaldo.SpringBootBack.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.misaldo.SpringBootBack.models.entity.Usuario;
import com.misaldo.SpringBootBack.models.services.IUsuarioService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("/usuarios")
	public List<Usuario> index() {
		return usuarioService.findAll();
	}

	@GetMapping("/usuario/{correo}")
	@ResponseStatus(HttpStatus.OK) // OK viene por defecto no es necesario
	public Usuario show(@PathVariable String correo) {
		return usuarioService.findById(correo);
	}

	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}

	@PutMapping("/usuario/{correo}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuarioEntrante, @PathVariable String correo) {

		Usuario usuarioAtual = usuarioService.findById(correo);

		usuarioAtual.setNombreUsuario(usuarioEntrante.getNombreUsuario());

		return usuarioService.save(usuarioAtual);
	}

	@DeleteMapping("/usuario/{correo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String correo) {
		usuarioService.delete(correo);
	}
}
