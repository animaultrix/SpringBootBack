package com.misaldo.SpringBootBack.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.misaldo.SpringBootBack.models.entity.Saldo;

public interface ISaldoDao extends CrudRepository<Saldo, Long> {	

	//Por "Conversión de nombre de método"
	List<Saldo> findByUsuarioCorreo(String usuarioCorreo);
	
	/*
	//Por "Query"
	@Query("SELECT s FROM Saldo s WHERE s.usuarioCorreo = :correo")
	List<Saldo> findByUsuarioCorreo(@Param("correo") String correo);
	*/
}
