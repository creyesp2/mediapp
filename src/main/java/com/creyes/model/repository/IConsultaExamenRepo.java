/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.model.repository;

import com.creyes.model.ConsultaExamen;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author carlo
 */
public interface IConsultaExamenRepo extends IGenericRepo<ConsultaExamen, Integer>{ 
	
	//@Transactional
	@Modifying
	@Query(value = "INSERT INTO consulta_examen(id_consulta, id_examen) VALUES (:idConsulta, :idExamen)", nativeQuery = true)
	Integer registrar(@Param("idConsulta") Integer idConsulta, @Param("idExamen") Integer idExamen);
	
	@Query("FROM ConsultaExamen ce where ce.consulta.idConsulta = :idConsulta")
	   List<ConsultaExamen> listarExamenesPorConsulta(@Param("idConsulta") Integer idconsulta);
	
}
