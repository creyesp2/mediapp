/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.service;

import com.creyes.dto.ConsultaListaExamenDTO;
import com.creyes.dto.FiltroConsultaDTO;
import com.creyes.model.Consulta;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface IConsultaService extends ICRUD<Consulta, Integer> {
	
	   Consulta registrarTransaccional(ConsultaListaExamenDTO dto) throws Exception;

	   List<Consulta> buscar(FiltroConsultaDTO filtro);

	List<Consulta> buscarFecha(LocalDateTime fecha);
	
}
