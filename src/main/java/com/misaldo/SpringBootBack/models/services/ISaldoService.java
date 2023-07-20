package com.misaldo.SpringBootBack.models.services;

import java.util.List;

import com.misaldo.SpringBootBack.models.entity.Saldo;

public interface ISaldoService {

	public List<Saldo> findAll();

	public Saldo findById(Long id);

	public Saldo save(Saldo saldo);

	public void delete(Long id);
	
	public List<Saldo> findByUsuarioCorreo(String usuarioCorreo);
}
