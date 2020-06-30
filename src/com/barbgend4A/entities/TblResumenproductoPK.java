package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tbl_resumenproducto database table.
 * 
 */
@Embeddable
public class TblResumenproductoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="RESP_ID_RESUMEN")
	private int respIdResumen;

	@Column(name="RESP_ID_PRODUCTO_FK", insertable=false, updatable=false)
	private int respIdProductoFk;

	public TblResumenproductoPK() {
	}
	public int getRespIdResumen() {
		return this.respIdResumen;
	}
	public void setRespIdResumen(int respIdResumen) {
		this.respIdResumen = respIdResumen;
	}
	public int getRespIdProductoFk() {
		return this.respIdProductoFk;
	}
	public void setRespIdProductoFk(int respIdProductoFk) {
		this.respIdProductoFk = respIdProductoFk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblResumenproductoPK)) {
			return false;
		}
		TblResumenproductoPK castOther = (TblResumenproductoPK)other;
		return 
			(this.respIdResumen == castOther.respIdResumen)
			&& (this.respIdProductoFk == castOther.respIdProductoFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.respIdResumen;
		hash = hash * prime + this.respIdProductoFk;
		
		return hash;
	}
}