package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_usorol database table.
 * 
 */
@Entity
@Table(name="tbl_usorol")
@NamedQuery(name="TblUsorol.findAll", query="SELECT t FROM TblUsorol t")
public class TblUsorol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USRL_ID_USUARIOROL")
	private int usrlIdUsuariorol;

	@Temporal(TemporalType.DATE)
	@Column(name="USRL_FECHA_INGRESO")
	private Date usrlFechaIngreso;

	//bi-directional many-to-one association to TblRole
	@ManyToOne
	@JoinColumn(name="USRL_ID_ROL_FK")
	private TblRole tblRole;

	//bi-directional one-to-one association to TblUsuario
	@OneToOne
	@JoinColumn(name="USRL_ID_USUARIOROL")
	private TblUsuario tblUsuario;

	public TblUsorol() {
	}

	public int getUsrlIdUsuariorol() {
		return this.usrlIdUsuariorol;
	}

	public void setUsrlIdUsuariorol(int usrlIdUsuariorol) {
		this.usrlIdUsuariorol = usrlIdUsuariorol;
	}

	public Date getUsrlFechaIngreso() {
		return this.usrlFechaIngreso;
	}

	public void setUsrlFechaIngreso(Date usrlFechaIngreso) {
		this.usrlFechaIngreso = usrlFechaIngreso;
	}

	public TblRole getTblRole() {
		return this.tblRole;
	}

	public void setTblRole(TblRole tblRole) {
		this.tblRole = tblRole;
	}

	public TblUsuario getTblUsuario() {
		return this.tblUsuario;
	}

	public void setTblUsuario(TblUsuario tblUsuario) {
		this.tblUsuario = tblUsuario;
	}

}