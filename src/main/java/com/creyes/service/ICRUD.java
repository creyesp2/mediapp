/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creyes.service;

/**
 *
 * @author carlo
 */
import java.util.List;

public interface ICRUD<T, ID> {

	T registrar(T t) throws Exception;
	T modificar(T t) throws Exception;
	List<T> listar() throws Exception;
	T listarPorId(ID id) throws Exception;
	void eliminar(ID id) throws Exception;
}
