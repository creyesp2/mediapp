/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.model.repository;

import com.creyes.dto.PacienteDto;
import com.creyes.dto.PersonaDto;
import com.creyes.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author carlo
 */
public interface IPersonaRepository extends JpaRepository<Persona, Integer>{
    @Query(value = "select a.id_persona idPersona,a.nombre, a.telefono, a.apelidos from Persona a ",nativeQuery = true)
    List<PacienteDto>getAllDara();
    
   @Query(value = "select a.id_persona idPersona,a.nombre,a.telefono,b.dpi from Persona a "
           + "inner join Paciente b on a.id_persona=b.id_paciente", nativeQuery = true)
   List<PersonaDto>getAllPersonas();
}
