package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblEstadoagendamiento;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblEstadoagendamientoBean {
	
	private TblEstadoagendamiento tblestadoagendamiento = new TblEstadoagendamiento();
	
	public TblEstadoagendamientoBean() {}

	public TblEstadoagendamiento getTblestadoagendamiento() {
		return tblestadoagendamiento;
	}

	public void setTblestadoagendamiento(TblEstadoagendamiento tblestadoagendamiento) {
		this.tblestadoagendamiento = tblestadoagendamiento;
	}

}
