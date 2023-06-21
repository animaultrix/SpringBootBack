package com.misaldo.SpringBootBack.models.services;

import java.util.List;

import com.misaldo.SpringBootBack.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();

	public Usuario findById(String correo);

	public Usuario save(Usuario usuario);

	public void delete(String correo);
}
