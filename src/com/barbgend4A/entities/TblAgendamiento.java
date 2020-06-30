package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tbl_agendamiento database table.
 * 
 */
@Entity
@Table(name="tbl_agendamiento")
@NamedQuery(name="TblAgendamiento.findAll", query="SELECT t FROM TblAgendamiento t")
public class TblAgendamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AGE_ID_AGENDAMIENTO")
	private int ageIdAgendamiento;

	@Column(name="AGE_CALIFICACION_BARBERO")
	private int ageCalificacionBarbero;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="AGE_FECHA_AGENDAMIENTO")
	private Date ageFechaAgendamiento;

	//bi-directional many-to-one association to TblUsuario
	@ManyToOne
	@JoinColumn(name="AGE_ID_CLIENTE_FK")
	private TblUsuario tblUsuario;

	//bi-directional many-to-one association to TblEstadoagendamiento
	@ManyToOne
	@JoinColumn(name="AGE_ID_ESTADO_FK")
	private TblEstadoagendamiento tblEstadoagendamiento;

	//bi-directional many-to-one association to TblResumenagendamiento
	@OneToMany(mappedBy="tblAgendamiento")
	private List<TblResumenagendamiento> tblResumenagendamientos;

	//bi-directional many-to-one association to TblServicio
	@OneToMany(mappedBy="tblAgendamiento")
	private List<TblServicio> tblServicios;

	public TblAgendamiento() {
	}

	public int getAgeIdAgendamiento() {
		return this.ageIdAgendamiento;
	}

	public void setAgeIdAgendamiento(int ageIdAgendamiento) {
		this.ageIdAgendamiento = ageIdAgendamiento;
	}

	public int getAgeCalificacionBarbero() {
		return this.ageCalificacionBarbero;
	}

	public void setAgeCalificacionBarbero(int ageCalificacionBarbero) {
		this.ageCalificacionBarbero = ageCalificacionBarbero;
	}

	public Date getAgeFechaAgendamiento() {
		return this.ageFechaAgendamiento;
	}

	public void setAgeFechaAgendamiento(Date ageFechaAgendamiento) {
		this.ageFechaAgendamiento = ageFechaAgendamiento;
	}

	public TblUsuario getTblUsuario() {
		return this.tblUsuario;
	}

	public void setTblUsuario(TblUsuario tblUsuario) {
		this.tblUsuario = tblUsuario;
	}

	public TblEstadoagendamiento getTblEstadoagendamiento() {
		return this.tblEstadoagendamiento;
	}

	public void setTblEstadoagendamiento(TblEstadoagendamiento tblEstadoagendamiento) {
		this.tblEstadoagendamiento = tblEstadoagendamiento;
	}

	public List<TblResumenagendamiento> getTblResumenagendamientos() {
		return this.tblResumenagendamientos;
	}

	public void setTblResumenagendamientos(List<TblResumenagendamiento> tblResumenagendamientos) {
		this.tblResumenagendamientos = tblResumenagendamientos;
	}

	public TblResumenagendamiento addTblResumenagendamiento(TblResumenagendamiento tblResumenagendamiento) {
		getTblResumenagendamientos().add(tblResumenagendamiento);
		tblResumenagendamiento.setTblAgendamiento(this);

		return tblResumenagendamiento;
	}

	public TblResumenagendamiento removeTblResumenagendamiento(TblResumenagendamiento tblResumenagendamiento) {
		getTblResumenagendamientos().remove(tblResumenagendamiento);
		tblResumenagendamiento.setTblAgendamiento(null);

		return tblResumenagendamiento;
	}

	public List<TblServicio> getTblServicios() {
		return this.tblServicios;
	}

	public void setTblServicios(List<TblServicio> tblServicios) {
		this.tblServicios = tblServicios;
	}

	public TblServicio addTblServicio(TblServicio tblServicio) {
		getTblServicios().add(tblServicio);
		tblServicio.setTblAgendamiento(this);

		return tblServicio;
	}

	public TblServicio removeTblServicio(TblServicio tblServicio) {
		getTblServicios().remove(tblServicio);
		tblServicio.setTblAgendamiento(null);

		return tblServicio;
	}

}