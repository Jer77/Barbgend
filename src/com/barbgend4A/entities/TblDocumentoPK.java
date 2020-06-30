package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tbl_documentos database table.
 * 
 */
@Embeddable
public class TblDocumentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="DOC_ID_DOCUMENTO")
	private int docIdDocumento;

	@Column(name="DOC_ID_USUARIO_FK", insertable=false, updatable=false)
	private int docIdUsuarioFk;

	public TblDocumentoPK() {
	}
	public int getDocIdDocumento() {
		return this.docIdDocumento;
	}
	public void setDocIdDocumento(int docIdDocumento) {
		this.docIdDocumento = docIdDocumento;
	}
	public int getDocIdUsuarioFk() {
		return this.docIdUsuarioFk;
	}
	public void setDocIdUsuarioFk(int docIdUsuarioFk) {
		this.docIdUsuarioFk = docIdUsuarioFk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblDocumentoPK)) {
			return false;
		}
		TblDocumentoPK castOther = (TblDocumentoPK)other;
		return 
			(this.docIdDocumento == castOther.docIdDocumento)
			&& (this.docIdUsuarioFk == castOther.docIdUsuarioFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.docIdDocumento;
		hash = hash * prime + this.docIdUsuarioFk;
		
		return hash;
	}
}