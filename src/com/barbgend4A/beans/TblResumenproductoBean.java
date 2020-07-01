package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.barbgend4A.entities.TblResumenproducto;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblResumenproductoBean {
	
	private TblResumenproducto tblresumenproducto = new TblResumenproducto();
	
	public TblResumenproductoBean() {
		
	}

	public TblResumenproducto getTblresumenproducto() {
		return tblresumenproducto;
	}

	public void setTblresumenproducto(TblResumenproducto tblresumenproducto) {
		this.tblresumenproducto = tblresumenproducto;
	}
}
