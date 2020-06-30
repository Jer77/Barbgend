package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_roles database table.
 * 
 */
@Entity
@Table(name="tbl_roles")
@NamedQuery(name="TblRole.findAll", query="SELECT t FROM TblRole t")
public class TblRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROL_ID_ROL")
	private int rolIdRol;

	@Column(name="ROL_NOMBRE_ROL")
	private String rolNombreRol;

	//bi-directional many-to-one association to TblUsorol
	@OneToMany(mappedBy="tblRole")
	private List<TblUsorol> tblUsorols;

	public TblRole() {
	}

	public int getRolIdRol() {
		return this.rolIdRol;
	}

	public void setRolIdRol(int rolIdRol) {
		this.rolIdRol = rolIdRol;
	}

	public String getRolNombreRol() {
		return this.rolNombreRol;
	}

	public void setRolNombreRol(String rolNombreRol) {
		this.rolNombreRol = rolNombreRol;
	}

	public List<TblUsorol> getTblUsorols() {
		return this.tblUsorols;
	}

	public void setTblUsorols(List<TblUsorol> tblUsorols) {
		this.tblUsorols = tblUsorols;
	}

	public TblUsorol addTblUsorol(TblUsorol tblUsorol) {
		getTblUsorols().add(tblUsorol);
		tblUsorol.setTblRole(this);

		return tblUsorol;
	}

	public TblUsorol removeTblUsorol(TblUsorol tblUsorol) {
		getTblUsorols().remove(tblUsorol);
		tblUsorol.setTblRole(null);

		return tblUsorol;
	}

}