package com.misaldo.SpringBootBack.controllers;

import java.io.Serializable;
import java.util.Date;
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

import com.misaldo.SpringBootBack.models.services.ISaldoService;
import com.misaldo.SpringBootBack.models.entity.Saldo;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class SaldoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	ISaldoService saldoService;

	@GetMapping("/saldos")
	public List<Saldo> getSaldos() {
		return saldoService.findAll();
	}

	@GetMapping("/saldo/{id}")
	public Saldo getSaldo(@PathVariable Long id) {
		return saldoService.findById(id);
	}

	@PostMapping("/saldo")
	@ResponseStatus(HttpStatus.CREATED)
	public Saldo createSaldo(@RequestBody Saldo saldo) {
		saldo.setFecha(new Date());
		return saldoService.save(saldo);
	}

	@PutMapping("/saldo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Saldo updateSaldo(@PathVariable Long id, @RequestBody Saldo nuevoSaldo) {
		Saldo saldoActual = saldoService.findById(id);
		saldoActual.setCantidad(nuevoSaldo.getCantidad());
		saldoActual.setConcepto(nuevoSaldo.getConcepto());
		saldoActual.setFecha(nuevoSaldo.getFecha());
		return saldoService.save(saldoActual);
	}

	@DeleteMapping("/saldo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteSaldo(@PathVariable Long id) {
		saldoService.delete(id);
	}

}
