package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_catalogobarbero database table.
 * 
 */
@Entity
@Table(name="tbl_catalogobarbero")
@NamedQuery(name="TblCatalogobarbero.findAll", query="SELECT t FROM TblCatalogobarbero t")
public class TblCatalogobarbero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAT_ID_CATALOGO")
	private int catIdCatalogo;

	@Column(name="CAT_DESCRIPCION")
	private String catDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="CAT_FECHA_INGRESO")
	private Date catFechaIngreso;

	@Lob
	@Column(name="CAT_IMG")
	private byte[] catImg;

	//bi-directional many-to-one association to TblUsuario
	@ManyToOne
	@JoinColumn(name="CAT_ID_BARBERO_FK")
	private TblUsuario tblUsuario;

	public TblCatalogobarbero() {
	}

	public int getCatIdCatalogo() {
		return this.catIdCatalogo;
	}

	public void setCatIdCatalogo(int catIdCatalogo) {
		this.catIdCatalogo = catIdCatalogo;
	}

	public String getCatDescripcion() {
		return this.catDescripcion;
	}

	public void setCatDescripcion(String catDescripcion) {
		this.catDescripcion = catDescripcion;
	}

	public Date getCatFechaIngreso() {
		return this.catFechaIngreso;
	}

	public void setCatFechaIngreso(Date catFechaIngreso) {
		this.catFechaIngreso = catFechaIngreso;
	}

	public byte[] getCatImg() {
		return this.catImg;
	}

	public void setCatImg(byte[] catImg) {
		this.catImg = catImg;
	}

	public TblUsuario getTblUsuario() {
		return this.tblUsuario;
	}

	public void setTblUsuario(TblUsuario tblUsuario) {
		this.tblUsuario = tblUsuario;
	}

}