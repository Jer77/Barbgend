package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_marcas database table.
 * 
 */
@Entity
@Table(name="tbl_marcas")
@NamedQuery(name="TblMarca.findAll", query="SELECT t FROM TblMarca t")
public class TblMarca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MAR_ID_MARCA")
	private int marIdMarca;

	@Column(name="MAR_NOMBRE_MARCA")
	private String marNombreMarca;

	//bi-directional many-to-one association to TblProducto
	@OneToMany(mappedBy="tblMarca")
	private List<TblProducto> tblProductos;

	public TblMarca() {
	}

	public int getMarIdMarca() {
		return this.marIdMarca;
	}

	public void setMarIdMarca(int marIdMarca) {
		this.marIdMarca = marIdMarca;
	}

	public String getMarNombreMarca() {
		return this.marNombreMarca;
	}

	public void setMarNombreMarca(String marNombreMarca) {
		this.marNombreMarca = marNombreMarca;
	}

	public List<TblProducto> getTblProductos() {
		return this.tblProductos;
	}

	public void setTblProductos(List<TblProducto> tblProductos) {
		this.tblProductos = tblProductos;
	}

	public TblProducto addTblProducto(TblProducto tblProducto) {
		getTblProductos().add(tblProducto);
		tblProducto.setTblMarca(this);

		return tblProducto;
	}

	public TblProducto removeTblProducto(TblProducto tblProducto) {
		getTblProductos().remove(tblProducto);
		tblProducto.setTblMarca(null);

		return tblProducto;
	}

}