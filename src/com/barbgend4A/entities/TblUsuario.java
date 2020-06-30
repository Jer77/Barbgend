package com.barbgend4A.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tbl_usuario database table.
 * 
 */
@Entity
@Table(name="tbl_usuario")
@NamedQuery(name="TblUsuario.findAll", query="SELECT t FROM TblUsuario t")
public class TblUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USU_ID_USUARIO")
	private int usuIdUsuario;

	@Column(name="USU_EMAIL")
	private String usuEmail;

	@Temporal(TemporalType.DATE)
	@Column(name="USU_FECHA_NACIMIENTO")
	private Date usuFechaNacimiento;

	@Column(name="USU_NUMERO_DOCUMENTO")
	private int usuNumeroDocumento;

	@Column(name="USU_PASSWORD")
	private String usuPassword;

	@Column(name="USU_PRIMER_APELLIDO")
	private String usuPrimerApellido;

	@Column(name="USU_PRIMER_NOMBRE")
	private String usuPrimerNombre;

	@Column(name="USU_SEGUNDO_APELLIDO")
	private String usuSegundoApellido;

	@Column(name="USU_SEGUNDO_NOMBRE")
	private String usuSegundoNombre;

	@Column(name="USU_STATUS")
	private String usuStatus;

	@Column(name="USU_TELEFONO_FIJO")
	private int usuTelefonoFijo;

	@Column(name="USU_TELEFONO_MOVIL")
	private int usuTelefonoMovil;

	//bi-directional many-to-one association to TblAgendamiento
	@OneToMany(mappedBy="tblUsuario")
	private List<TblAgendamiento> tblAgendamientos;

	//bi-directional many-to-one association to TblCatalogobarbero
	@OneToMany(mappedBy="tblUsuario")
	private List<TblCatalogobarbero> tblCatalogobarberos;

	//bi-directional many-to-one association to TblDocumento
	@OneToMany(mappedBy="tblUsuario")
	private List<TblDocumento> tblDocumentos;

	//bi-directional many-to-one association to TblResumenproducto
	@OneToMany(mappedBy="tblUsuario")
	private List<TblResumenproducto> tblResumenproductos;

	//bi-directional many-to-one association to TblServicio
	@OneToMany(mappedBy="tblUsuario")
	private List<TblServicio> tblServicios;

	//bi-directional one-to-one association to TblUsorol
	@OneToOne(mappedBy="tblUsuario")
	private TblUsorol tblUsorol;

	public TblUsuario() {
	}

	public int getUsuIdUsuario() {
		return this.usuIdUsuario;
	}

	public void setUsuIdUsuario(int usuIdUsuario) {
		this.usuIdUsuario = usuIdUsuario;
	}

	public String getUsuEmail() {
		return this.usuEmail;
	}

	public void setUsuEmail(String usuEmail) {
		this.usuEmail = usuEmail;
	}

	public Date getUsuFechaNacimiento() {
		return this.usuFechaNacimiento;
	}

	public void setUsuFechaNacimiento(Date usuFechaNacimiento) {
		this.usuFechaNacimiento = usuFechaNacimiento;
	}

	public int getUsuNumeroDocumento() {
		return this.usuNumeroDocumento;
	}

	public void setUsuNumeroDocumento(int usuNumeroDocumento) {
		this.usuNumeroDocumento = usuNumeroDocumento;
	}

	public String getUsuPassword() {
		return this.usuPassword;
	}

	public void setUsuPassword(String usuPassword) {
		this.usuPassword = usuPassword;
	}

	public String getUsuPrimerApellido() {
		return this.usuPrimerApellido;
	}

	public void setUsuPrimerApellido(String usuPrimerApellido) {
		this.usuPrimerApellido = usuPrimerApellido;
	}

	public String getUsuPrimerNombre() {
		return this.usuPrimerNombre;
	}

	public void setUsuPrimerNombre(String usuPrimerNombre) {
		this.usuPrimerNombre = usuPrimerNombre;
	}

	public String getUsuSegundoApellido() {
		return this.usuSegundoApellido;
	}

	public void setUsuSegundoApellido(String usuSegundoApellido) {
		this.usuSegundoApellido = usuSegundoApellido;
	}

	public String getUsuSegundoNombre() {
		return this.usuSegundoNombre;
	}

	public void setUsuSegundoNombre(String usuSegundoNombre) {
		this.usuSegundoNombre = usuSegundoNombre;
	}

	public String getUsuStatus() {
		return this.usuStatus;
	}

	public void setUsuStatus(String usuStatus) {
		this.usuStatus = usuStatus;
	}

	public int getUsuTelefonoFijo() {
		return this.usuTelefonoFijo;
	}

	public void setUsuTelefonoFijo(int usuTelefonoFijo) {
		this.usuTelefonoFijo = usuTelefonoFijo;
	}

	public int getUsuTelefonoMovil() {
		return this.usuTelefonoMovil;
	}

	public void setUsuTelefonoMovil(int usuTelefonoMovil) {
		this.usuTelefonoMovil = usuTelefonoMovil;
	}

	public List<TblAgendamiento> getTblAgendamientos() {
		return this.tblAgendamientos;
	}

	public void setTblAgendamientos(List<TblAgendamiento> tblAgendamientos) {
		this.tblAgendamientos = tblAgendamientos;
	}

	public TblAgendamiento addTblAgendamiento(TblAgendamiento tblAgendamiento) {
		getTblAgendamientos().add(tblAgendamiento);
		tblAgendamiento.setTblUsuario(this);

		return tblAgendamiento;
	}

	public TblAgendamiento removeTblAgendamiento(TblAgendamiento tblAgendamiento) {
		getTblAgendamientos().remove(tblAgendamiento);
		tblAgendamiento.setTblUsuario(null);

		return tblAgendamiento;
	}

	public List<TblCatalogobarbero> getTblCatalogobarberos() {
		return this.tblCatalogobarberos;
	}

	public void setTblCatalogobarberos(List<TblCatalogobarbero> tblCatalogobarberos) {
		this.tblCatalogobarberos = tblCatalogobarberos;
	}

	public TblCatalogobarbero addTblCatalogobarbero(TblCatalogobarbero tblCatalogobarbero) {
		getTblCatalogobarberos().add(tblCatalogobarbero);
		tblCatalogobarbero.setTblUsuario(this);

		return tblCatalogobarbero;
	}

	public TblCatalogobarbero removeTblCatalogobarbero(TblCatalogobarbero tblCatalogobarbero) {
		getTblCatalogobarberos().remove(tblCatalogobarbero);
		tblCatalogobarbero.setTblUsuario(null);

		return tblCatalogobarbero;
	}

	public List<TblDocumento> getTblDocumentos() {
		return this.tblDocumentos;
	}

	public void setTblDocumentos(List<TblDocumento> tblDocumentos) {
		this.tblDocumentos = tblDocumentos;
	}

	public TblDocumento addTblDocumento(TblDocumento tblDocumento) {
		getTblDocumentos().add(tblDocumento);
		tblDocumento.setTblUsuario(this);

		return tblDocumento;
	}

	public TblDocumento removeTblDocumento(TblDocumento tblDocumento) {
		getTblDocumentos().remove(tblDocumento);
		tblDocumento.setTblUsuario(null);

		return tblDocumento;
	}

	public List<TblResumenproducto> getTblResumenproductos() {
		return this.tblResumenproductos;
	}

	public void setTblResumenproductos(List<TblResumenproducto> tblResumenproductos) {
		this.tblResumenproductos = tblResumenproductos;
	}

	public TblResumenproducto addTblResumenproducto(TblResumenproducto tblResumenproducto) {
		getTblResumenproductos().add(tblResumenproducto);
		tblResumenproducto.setTblUsuario(this);

		return tblResumenproducto;
	}

	public TblResumenproducto removeTblResumenproducto(TblResumenproducto tblResumenproducto) {
		getTblResumenproductos().remove(tblResumenproducto);
		tblResumenproducto.setTblUsuario(null);

		return tblResumenproducto;
	}

	public List<TblServicio> getTblServicios() {
		return this.tblServicios;
	}

	public void setTblServicios(List<TblServicio> tblServicios) {
		this.tblServicios = tblServicios;
	}

	public TblServicio addTblServicio(TblServicio tblServicio) {
		getTblServicios().add(tblServicio);
		tblServicio.setTblUsuario(this);

		return tblServicio;
	}

	public TblServicio removeTblServicio(TblServicio tblServicio) {
		getTblServicios().remove(tblServicio);
		tblServicio.setTblUsuario(null);

		return tblServicio;
	}

	public TblUsorol getTblUsorol() {
		return this.tblUsorol;
	}

	public void setTblUsorol(TblUsorol tblUsorol) {
		this.tblUsorol = tblUsorol;
	}

}