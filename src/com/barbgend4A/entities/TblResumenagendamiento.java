package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_resumenagendamiento database table.
 * 
 */
@Entity
@Table(name="tbl_resumenagendamiento")
@NamedQuery(name="TblResumenagendamiento.findAll", query="SELECT t FROM TblResumenagendamiento t")
public class TblResumenagendamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RESA_ID_RESUMEN")
	private int resaIdResumen;

	@Column(name="RESA_PRECIO_TOTAL")
	private float resaPrecioTotal;

	//bi-directional many-to-one association to TblAgendamiento
	@ManyToOne
	@JoinColumn(name="RESA_ID_AGENDAMIENTO_FK")
	private TblAgendamiento tblAgendamiento;

	public TblResumenagendamiento() {
	}

	public int getResaIdResumen() {
		return this.resaIdResumen;
	}

	public void setResaIdResumen(int resaIdResumen) {
		this.resaIdResumen = resaIdResumen;
	}

	public float getResaPrecioTotal() {
		return this.resaPrecioTotal;
	}

	public void setResaPrecioTotal(float resaPrecioTotal) {
		this.resaPrecioTotal = resaPrecioTotal;
	}

	public TblAgendamiento getTblAgendamiento() {
		return this.tblAgendamiento;
	}

	public void setTblAgendamiento(TblAgendamiento tblAgendamiento) {
		this.tblAgendamiento = tblAgendamiento;
	}

}