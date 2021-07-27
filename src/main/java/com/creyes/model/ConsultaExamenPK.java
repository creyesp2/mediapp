/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.model;

/**
 *
 * @author carlo
 */
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ConsultaExamenPK implements Serializable {

	//[idConsulta(FK) idExamen(FK)] PK

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_consulta", nullable = false)
	private Consulta consulta;
	
	@ManyToOne
	@JoinColumn(name = "id_examen", nullable = false)
	private Examen examen;

	@Override
	public int hashCode() {
		return Objects.hash(consulta, examen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaExamenPK other = (ConsultaExamenPK) obj;
		return Objects.equals(consulta, other.consulta) && Objects.equals(examen, other.examen);
	}
	
	
	
	
}