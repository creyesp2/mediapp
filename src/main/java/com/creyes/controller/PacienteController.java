/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creyes.controller;

import com.creyes.dto.PacienteDto;
import com.creyes.dto.PersonaDto;
import com.creyes.model.Persona;
import com.creyes.service.IPersonaService;
import exception.ModeloNotFoundException;
import java.util.List;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlo
 */
@RestController
@RequestMapping("/api/pacientes")
@CrossOrigin(origins = {"*"})
public class PacienteController {
    @Autowired
    private IPersonaService personaService;
    @GetMapping("/all")
    public List<Persona> getAllPersonas(){
    return this.personaService.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Persona>listarPorId(@PathVariable("id") Integer id)throws Exception{
    Persona  obj = personaService.findById(id);
        if (obj==null) {
            throw new ModeloNotFoundException("ID no encontrado"+id);
        }
        
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    
    
    @PostMapping("/save")
    public ResponseEntity<Persona>save(@RequestBody Persona p){
    return new ResponseEntity<>(this.personaService.save(p),HttpStatus.OK);
    }
    
        @GetMapping("/allData")
    public List<PacienteDto> getAllData(){
    return this.personaService.getAllData();
    }
    
       @GetMapping("/allPersonas")
    public List<PersonaDto> getAllPersona(){
    return this.personaService.getAllPersona();
    
    }
}
