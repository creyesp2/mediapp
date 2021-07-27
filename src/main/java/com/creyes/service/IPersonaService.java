/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.service;

import com.creyes.dto.PacienteDto;
import com.creyes.dto.PersonaDto;
import com.creyes.model.Persona;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface IPersonaService {
    public List<Persona> findAll();
    public Persona save(Persona persona);
    public Persona findById(Integer id);
    public void delete(Integer id);
    public List<PacienteDto>getAllData();
    public List<PersonaDto>getAllPersona();
}
