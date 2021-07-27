/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.service.impl;

import com.creyes.model.Examen;
import com.creyes.model.repository.IExamenRepo;
import com.creyes.model.repository.IGenericRepo;
import com.creyes.service.IExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class ExamenServiceImpl extends CRUDImpl<Examen, Integer> implements IExamenService{

	@Autowired
	private IExamenRepo repo;

	@Override
	protected IGenericRepo<Examen, Integer> getRepo() {
		return repo;
	}
	
	
}