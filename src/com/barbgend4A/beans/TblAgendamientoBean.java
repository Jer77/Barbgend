package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblAgendamiento;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblAgendamientoBean {
	
	private TblAgendamiento tblagendamiento = new TblAgendamiento();
	
	public TblAgendamientoBean() {
		
	}

	public TblAgendamiento getTblagendamiento() {
		return tblagendamiento;
	}

	public void setTblagendamiento(TblAgendamiento tblagendamiento) {
		this.tblagendamiento = tblagendamiento;
	}
}
