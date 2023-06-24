package com.misaldo.SpringBootBack.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.misaldo.SpringBootBack.models.entity.Saldo;

public interface ISaldoDao extends CrudRepository<Saldo, Long> {

}
