package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblDocumento;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblDocumentoBean {
	
	private TblDocumento tbldocumento = new TblDocumento();
	
	public TblDocumentoBean() {
		
	}

	public TblDocumento getTbldocumento() {
		return tbldocumento;
	}

	public void setTbldocumento(TblDocumento tbldocumento) {
		this.tbldocumento = tbldocumento;
	}

}
