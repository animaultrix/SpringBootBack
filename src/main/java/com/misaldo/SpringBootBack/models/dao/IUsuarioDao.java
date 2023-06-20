package com.misaldo.SpringBootBack.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.misaldo.SpringBootBack.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, String> {

}
