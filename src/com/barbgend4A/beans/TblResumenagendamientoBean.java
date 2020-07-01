package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblResumenagendamiento;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblResumenagendamientoBean {
	
	private TblResumenagendamiento tblresumenagendamiento = new TblResumenagendamiento();
	
	public TblResumenagendamientoBean() {
		
	}

	public TblResumenagendamiento getTblResumenagendamiento() {
		return tblresumenagendamiento;
	}

	public void setTblResumenagendamiento(TblResumenagendamiento tblresumenagendamiento) {
		this.tblresumenagendamiento = tblresumenagendamiento;
	}

}
