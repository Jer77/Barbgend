package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblCatalogobarbero;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblCatalogobarberoBean {
	
	private TblCatalogobarbero  tblcatalogobarbero = new TblCatalogobarbero();
	
	public TblCatalogobarberoBean() {
		
	}

	public TblCatalogobarbero getTblcatalogobarbero() {
		return tblcatalogobarbero;
	}

	public void setTblcatalogobarbero(TblCatalogobarbero tblcatalogobarbero) {
		this.tblcatalogobarbero = tblcatalogobarbero;
	}

}
