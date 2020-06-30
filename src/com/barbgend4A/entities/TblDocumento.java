package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_documentos database table.
 * 
 */
@Entity
@Table(name="tbl_documentos")
@NamedQuery(name="TblDocumento.findAll", query="SELECT t FROM TblDocumento t")
public class TblDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblDocumentoPK id;

	@Column(name="DOC_TIPO_DOCUMENTO")
	private String docTipoDocumento;

	//bi-directional many-to-one association to TblUsuario
	@ManyToOne
	@JoinColumn(name="DOC_ID_USUARIO_FK")
	private TblUsuario tblUsuario;

	public TblDocumento() {
	}

	public TblDocumentoPK getId() {
		return this.id;
	}

	public void setId(TblDocumentoPK id) {
		this.id = id;
	}

	public String getDocTipoDocumento() {
		return this.docTipoDocumento;
	}

	public void setDocTipoDocumento(String docTipoDocumento) {
		this.docTipoDocumento = docTipoDocumento;
	}

	public TblUsuario getTblUsuario() {
		return this.tblUsuario;
	}

	public void setTblUsuario(TblUsuario tblUsuario) {
		this.tblUsuario = tblUsuario;
	}

}