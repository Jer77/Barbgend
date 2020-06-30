package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tbl_servicio database table.
 * 
 */
@Embeddable
public class TblServicioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SER_ID_SERVICIO")
	private int serIdServicio;

	@Column(name="SER_ID_AGENDAMIENTO_FK", insertable=false, updatable=false)
	private int serIdAgendamientoFk;

	public TblServicioPK() {
	}
	public int getSerIdServicio() {
		return this.serIdServicio;
	}
	public void setSerIdServicio(int serIdServicio) {
		this.serIdServicio = serIdServicio;
	}
	public int getSerIdAgendamientoFk() {
		return this.serIdAgendamientoFk;
	}
	public void setSerIdAgendamientoFk(int serIdAgendamientoFk) {
		this.serIdAgendamientoFk = serIdAgendamientoFk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblServicioPK)) {
			return false;
		}
		TblServicioPK castOther = (TblServicioPK)other;
		return 
			(this.serIdServicio == castOther.serIdServicio)
			&& (this.serIdAgendamientoFk == castOther.serIdAgendamientoFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.serIdServicio;
		hash = hash * prime + this.serIdAgendamientoFk;
		
		return hash;
	}
}