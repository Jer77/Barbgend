package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblRole;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblRoleBean {
	
	private TblRole tblrole = new TblRole();
	
	public TblRoleBean () {
		
	}

	public TblRole getTblrole() {
		return tblrole;
	}

	public void setTblrole(TblRole tblrole) {
		this.tblrole = tblrole;
	}

}
