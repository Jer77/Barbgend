package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblProducto;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblProductoBean {
	
	private TblProducto tblproducto = new TblProducto();
	
	public TblProductoBean() {
		
	}

	public TblProducto getTblproducto() {
		return tblproducto;
	}

	public void setTblproducto(TblProducto tblproducto) {
		this.tblproducto = tblproducto;
	}

}
