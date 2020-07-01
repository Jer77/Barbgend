package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.barbgend4A.entities.TblUsuario;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblUsuarioBean {
	
	private TblUsuario tblusuario = new TblUsuario();
	
	public TblUsuarioBean() {
		
	}

	public TblUsuario getTblusuario() {
		return tblusuario;
	}

	public void setTblusuario(TblUsuario tblusuario) {
		this.tblusuario = tblusuario;
	}

}
