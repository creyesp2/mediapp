/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.dto;

import com.creyes.model.Consulta;
import com.creyes.model.Examen;
import java.util.List;
import javax.validation.constraints.NotNull;

/**
 *
 * @author carlo
 */
public class ConsultaListaExamenDTO {

	@NotNull
	private Consulta consulta;

	@NotNull
	private List<Examen> lstExamen;

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<Examen> getLstExamen() {
		return lstExamen;
	}

	public void setLstExamen(List<Examen> lstExamen) {
		this.lstExamen = lstExamen;
	}

}
