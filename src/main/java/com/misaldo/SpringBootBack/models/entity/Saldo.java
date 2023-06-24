package com.misaldo.SpringBootBack.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "saldos")
public class Saldo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_saldo")
	private Long idSaldo;
	@Column
	private Date fecha;
	private Long cantidad;
	private String concepto;
	@Column(name = "usuario_correo")
	private String usuarioCorreo;

	public Saldo(Long idSaldo, Date fecha, Long cantidad, String concepto, String usuarioCorreo) {
		super();
		this.idSaldo = idSaldo;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.concepto = concepto;
		this.usuarioCorreo = usuarioCorreo;
	}
	public Saldo() {
		
	}

	public Long getIdSaldo() {
		return idSaldo;
	}

	public void setIdSaldo(Long idSaldo) {
		this.idSaldo = idSaldo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getUsuarioCorreo() {
		return usuarioCorreo;
	}

	public void setUsuarioCorreo(String usuarioCorreo) {
		this.usuarioCorreo = usuarioCorreo;
	}

}
