package com.misaldo.SpringBootBack.models.entity;

import java.util.Date;

public class Saldo {

	private Long idSaldo;
	private Date fecha;
	private Long cantidad;
	private String concepto;
	private String usuarioCorreo;	
	
	public Saldo(Long idSaldo, Date fecha, Long cantidad, String concepto, String usuarioCorreo) {
		super();
		this.idSaldo = idSaldo;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.concepto = concepto;
		this.usuarioCorreo = usuarioCorreo;
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
