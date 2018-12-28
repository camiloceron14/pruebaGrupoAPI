package com.app.pruebaGrupo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="grupo")
public class Grupo {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long codigo;
	
	@Column(name="codGrupo")
	private Long codGrupo;
	
	@Column(name="nombre")
	private String nombre;
		
	@Column(name="codPadre")
	private Long codPadre;
	
	@Column(name="orden")
	private int orden;

	/**
	 * 
	 */
	public Grupo() {
	}

	/**
	 * @param id
	 * @param codGrupo
	 * @param nombre
	 * @param codPadre
	 * @param orden
	 */
	public Grupo(Long codigo, Long codGrupo, String nombre, Long codPadre, int orden) {		
		this.codigo = codigo;
		this.codGrupo = codGrupo;
		this.nombre = nombre;
		this.codPadre = codPadre;
		this.orden = orden;
	}

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the codGrupo
	 */
	public Long getCodGrupo() {
		return codGrupo;
	}

	/**
	 * @param codGrupo the codGrupo to set
	 */
	public void setCodGrupo(Long codGrupo) {
		this.codGrupo = codGrupo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the codPadre
	 */
	public Long getCodPadre() {
		return codPadre;
	}

	/**
	 * @param codPadre the codPadre to set
	 */
	public void setCodPadre(Long codPadre) {
		this.codPadre = codPadre;
	}

	/**
	 * @return the orden
	 */
	public int getOrden() {
		return orden;
	}

	/**
	 * @param orden the orden to set
	 */
	public void setOrden(int orden) {
		this.orden = orden;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Grupo [codGrupo=" + codGrupo + ", nombre="
				+ nombre + ", codPadre=" + codPadre + ", orden=" + orden + "]";
	}
}
