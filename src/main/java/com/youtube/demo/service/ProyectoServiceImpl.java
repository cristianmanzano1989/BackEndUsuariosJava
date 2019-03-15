package com.youtube.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo.dao.ProyectoRepository;
import com.youtube.demo.model.Proyecto;
import com.youtube.demo.model.User;

@Service
public class ProyectoServiceImpl implements ProyectoService{
	
	@Autowired
	protected ProyectoRepository proyectoRepository;

	@Override
	public Proyecto save(Proyecto proy) {
		// TODO Auto-generated method stub
		return this.proyectoRepository.save(proy);
	}

	@Override
	public List<Proyecto> findAll() {
		
		return (List<Proyecto>) this.proyectoRepository.findAll();
	}

	@Override
	public void delete(Proyecto proy) {
		this.proyectoRepository.delete(proy);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return this.proyectoRepository.findAllUsers();
	}

}
