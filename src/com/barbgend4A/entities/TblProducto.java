package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_producto database table.
 * 
 */
@Entity
@Table(name="tbl_producto")
@NamedQuery(name="TblProducto.findAll", query="SELECT t FROM TblProducto t")
public class TblProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRO_ID_PRODUCTO")
	private int proIdProducto;

	@Column(name="PRO_DESCRIPCION_PRODUCTO")
	private String proDescripcionProducto;

	@Column(name="PRO_NOMBRE_PRODUCTO")
	private String proNombreProducto;

	@Column(name="PRO_PRECIO_UNITARIO")
	private float proPrecioUnitario;

	@Column(name="PRO_PRESENTACION")
	private String proPresentacion;

	//bi-directional many-to-one association to TblMarca
	@ManyToOne
	@JoinColumn(name="PRO_ID_MARCA_FK")
	private TblMarca tblMarca;

	//bi-directional many-to-one association to TblResumenproducto
	@OneToMany(mappedBy="tblProducto")
	private List<TblResumenproducto> tblResumenproductos;

	public TblProducto() {
	}

	public int getProIdProducto() {
		return this.proIdProducto;
	}

	public void setProIdProducto(int proIdProducto) {
		this.proIdProducto = proIdProducto;
	}

	public String getProDescripcionProducto() {
		return this.proDescripcionProducto;
	}

	public void setProDescripcionProducto(String proDescripcionProducto) {
		this.proDescripcionProducto = proDescripcionProducto;
	}

	public String getProNombreProducto() {
		return this.proNombreProducto;
	}

	public void setProNombreProducto(String proNombreProducto) {
		this.proNombreProducto = proNombreProducto;
	}

	public float getProPrecioUnitario() {
		return this.proPrecioUnitario;
	}

	public void setProPrecioUnitario(float proPrecioUnitario) {
		this.proPrecioUnitario = proPrecioUnitario;
	}

	public String getProPresentacion() {
		return this.proPresentacion;
	}

	public void setProPresentacion(String proPresentacion) {
		this.proPresentacion = proPresentacion;
	}

	public TblMarca getTblMarca() {
		return this.tblMarca;
	}

	public void setTblMarca(TblMarca tblMarca) {
		this.tblMarca = tblMarca;
	}

	public List<TblResumenproducto> getTblResumenproductos() {
		return this.tblResumenproductos;
	}

	public void setTblResumenproductos(List<TblResumenproducto> tblResumenproductos) {
		this.tblResumenproductos = tblResumenproductos;
	}

	public TblResumenproducto addTblResumenproducto(TblResumenproducto tblResumenproducto) {
		getTblResumenproductos().add(tblResumenproducto);
		tblResumenproducto.setTblProducto(this);

		return tblResumenproducto;
	}

	public TblResumenproducto removeTblResumenproducto(TblResumenproducto tblResumenproducto) {
		getTblResumenproductos().remove(tblResumenproducto);
		tblResumenproducto.setTblProducto(null);

		return tblResumenproducto;
	}

}