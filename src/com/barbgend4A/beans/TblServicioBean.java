package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblServicio;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblServicioBean {
	
	private TblServicio tblservicio = new TblServicio();
	
	public TblServicioBean() {
		
	}

	public TblServicio getTblservicio() {
		return tblservicio;
	}

	public void setTblservicio(TblServicio tblservicio) {
		this.tblservicio = tblservicio;
	}

}
