package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_servicio database table.
 * 
 */
@Entity
@Table(name="tbl_servicio")
@NamedQuery(name="TblServicio.findAll", query="SELECT t FROM TblServicio t")
public class TblServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblServicioPK id;

	@Column(name="SER_COSTO_SERVICIO")
	private float serCostoServicio;

	@Column(name="SER_NOMBRE_SERVICIO")
	private String serNombreServicio;

	@Column(name="SER_TECNICA_SERVICIO")
	private String serTecnicaServicio;

	//bi-directional many-to-one association to TblAgendamiento
	@ManyToOne
	@JoinColumn(name="SER_ID_AGENDAMIENTO_FK")
	private TblAgendamiento tblAgendamiento;

	//bi-directional many-to-one association to TblUsuario
	@ManyToOne
	@JoinColumn(name="SER_ID_BARBERO_FK")
	private TblUsuario tblUsuario;

	public TblServicio() {
	}

	public TblServicioPK getId() {
		return this.id;
	}

	public void setId(TblServicioPK id) {
		this.id = id;
	}

	public float getSerCostoServicio() {
		return this.serCostoServicio;
	}

	public void setSerCostoServicio(float serCostoServicio) {
		this.serCostoServicio = serCostoServicio;
	}

	public String getSerNombreServicio() {
		return this.serNombreServicio;
	}

	public void setSerNombreServicio(String serNombreServicio) {
		this.serNombreServicio = serNombreServicio;
	}

	public String getSerTecnicaServicio() {
		return this.serTecnicaServicio;
	}

	public void setSerTecnicaServicio(String serTecnicaServicio) {
		this.serTecnicaServicio = serTecnicaServicio;
	}

	public TblAgendamiento getTblAgendamiento() {
		return this.tblAgendamiento;
	}

	public void setTblAgendamiento(TblAgendamiento tblAgendamiento) {
		this.tblAgendamiento = tblAgendamiento;
	}

	public TblUsuario getTblUsuario() {
		return this.tblUsuario;
	}

	public void setTblUsuario(TblUsuario tblUsuario) {
		this.tblUsuario = tblUsuario;
	}

}