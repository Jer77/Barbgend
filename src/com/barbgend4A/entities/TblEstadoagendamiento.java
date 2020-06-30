package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_estadoagendamiento database table.
 * 
 */
@Entity
@Table(name="tbl_estadoagendamiento")
@NamedQuery(name="TblEstadoagendamiento.findAll", query="SELECT t FROM TblEstadoagendamiento t")
public class TblEstadoagendamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ESA_ID_ESTADO")
	private int esaIdEstado;

	@Column(name="ESA_STATUS")
	private String esaStatus;

	//bi-directional many-to-one association to TblAgendamiento
	@OneToMany(mappedBy="tblEstadoagendamiento")
	private List<TblAgendamiento> tblAgendamientos;

	public TblEstadoagendamiento() {
	}

	public int getEsaIdEstado() {
		return this.esaIdEstado;
	}

	public void setEsaIdEstado(int esaIdEstado) {
		this.esaIdEstado = esaIdEstado;
	}

	public String getEsaStatus() {
		return this.esaStatus;
	}

	public void setEsaStatus(String esaStatus) {
		this.esaStatus = esaStatus;
	}

	public List<TblAgendamiento> getTblAgendamientos() {
		return this.tblAgendamientos;
	}

	public void setTblAgendamientos(List<TblAgendamiento> tblAgendamientos) {
		this.tblAgendamientos = tblAgendamientos;
	}

	public TblAgendamiento addTblAgendamiento(TblAgendamiento tblAgendamiento) {
		getTblAgendamientos().add(tblAgendamiento);
		tblAgendamiento.setTblEstadoagendamiento(this);

		return tblAgendamiento;
	}

	public TblAgendamiento removeTblAgendamiento(TblAgendamiento tblAgendamiento) {
		getTblAgendamientos().remove(tblAgendamiento);
		tblAgendamiento.setTblEstadoagendamiento(null);

		return tblAgendamiento;
	}

}