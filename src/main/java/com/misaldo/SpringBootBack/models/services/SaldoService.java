package com.misaldo.SpringBootBack.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.misaldo.SpringBootBack.models.dao.ISaldoDao;
import com.misaldo.SpringBootBack.models.entity.Saldo;

@Service
public class SaldoService implements ISaldoService {

	@Autowired
	private ISaldoDao saldoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Saldo> findAll() {
		return (List<Saldo>) saldoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Saldo findById(Long id) {
		return saldoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Saldo save(Saldo saldo) {
		return saldoDao.save(saldo);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		saldoDao.deleteById(id);
	}

	@Override
    @Transactional(readOnly = true)
    public List<Saldo> findByUsuarioCorreo(String usuarioCorreo) {
        return saldoDao.findByUsuarioCorreo(usuarioCorreo);
    }
}
