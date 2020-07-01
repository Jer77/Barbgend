package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblMarca;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblMarcaBean {
	
	private TblMarca tblmarca = new TblMarca();
	
	public TblMarcaBean() {
		
	}
	public TblMarca getTblmarca() {
		return tblmarca;
	}
	public void setTblmarca(TblMarca tblmarca) {
		this.tblmarca = tblmarca;
	}
}
