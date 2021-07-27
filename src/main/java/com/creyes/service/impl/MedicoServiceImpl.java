/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.service.impl;

import com.creyes.model.Medico;
import com.creyes.model.repository.IGenericRepo;
import com.creyes.model.repository.IMedicoRepo;
import com.creyes.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class MedicoServiceImpl extends CRUDImpl<Medico, Integer> implements IMedicoService{

	@Autowired
	private IMedicoRepo repo;

	@Override
	protected IGenericRepo<Medico, Integer> getRepo() {
		return repo;
	}
	
	
}
