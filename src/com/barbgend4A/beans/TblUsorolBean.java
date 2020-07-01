package com.barbgend4A.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.barbgend4A.entities.TblUsorol;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class TblUsorolBean {
	
	private TblUsorol tblusorol = new TblUsorol();
	
	public TblUsorolBean() {
		
	}

	public TblUsorol getTblusorol() {
		return tblusorol;
	}

	public void setTblusorol(TblUsorol tblusorol) {
		this.tblusorol = tblusorol;
	}

}
