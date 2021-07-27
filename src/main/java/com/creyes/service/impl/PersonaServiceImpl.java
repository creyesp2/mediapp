/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.service.impl;

import com.creyes.dto.PacienteDto;
import com.creyes.dto.PersonaDto;
import com.creyes.model.Persona;
import com.creyes.model.repository.IPersonaRepository;
import com.creyes.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class PersonaServiceImpl  implements IPersonaService{
@Autowired
private IPersonaRepository personaRepository;
    @Override
    public List<Persona> findAll() {
        return this.personaRepository.findAll();
    }

    @Override
    public Persona save(Persona persona) {
        return this.personaRepository.save(persona);
    }

    @Override
    public Persona findById(Long id) {
       return this.personaRepository.getById(id);
    }

    @Override
    public void delete(Long id) {
        this.personaRepository.deleteById(id);
    }

    @Override
    public List<PacienteDto> getAllData() {
    return this.personaRepository.getAllDara();
    }

    @Override
    public List<PersonaDto> getAllPersona() {
        return this.personaRepository.getAllPersonas();
    }
    
}
 