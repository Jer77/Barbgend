package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_resumenproducto database table.
 * 
 */
@Entity
@Table(name="tbl_resumenproducto")
@NamedQuery(name="TblResumenproducto.findAll", query="SELECT t FROM TblResumenproducto t")
public class TblResumenproducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblResumenproductoPK id;

	@Column(name="RESP_CANTIDAD")
	private int respCantidad;

	@Column(name="RESP_PRECIO_TOTAL")
	private float respPrecioTotal;

	//bi-directional many-to-one association to TblUsuario
	@ManyToOne
	@JoinColumn(name="RESP_ID_CLIENTE_FK")
	private TblUsuario tblUsuario;

	//bi-directional many-to-one association to TblProducto
	@ManyToOne
	@JoinColumn(name="RESP_ID_PRODUCTO_FK")
	private TblProducto tblProducto;

	public TblResumenproducto() {
	}

	public TblResumenproductoPK getId() {
		return this.id;
	}

	public void setId(TblResumenproductoPK id) {
		this.id = id;
	}

	public int getRespCantidad() {
		return this.respCantidad;
	}

	public void setRespCantidad(int respCantidad) {
		this.respCantidad = respCantidad;
	}

	public float getRespPrecioTotal() {
		return this.respPrecioTotal;
	}

	public void setRespPrecioTotal(float respPrecioTotal) {
		this.respPrecioTotal = respPrecioTotal;
	}

	public TblUsuario getTblUsuario() {
		return this.tblUsuario;
	}

	public void setTblUsuario(TblUsuario tblUsuario) {
		this.tblUsuario = tblUsuario;
	}

	public TblProducto getTblProducto() {
		return this.tblProducto;
	}

	public void setTblProducto(TblProducto tblProducto) {
		this.tblProducto = tblProducto;
	}

}