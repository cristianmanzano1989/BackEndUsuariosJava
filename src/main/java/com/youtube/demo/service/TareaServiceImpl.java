package com.youtube.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo.dao.TareaRepository;
import com.youtube.demo.model.Tarea;
import com.youtube.demo.model.User;



@Service
public class TareaServiceImpl implements TareaService{
	
	@Autowired
	protected TareaRepository tareaRepository;

	@Override
	public Tarea save(Tarea tar)
	{
		return this.tareaRepository.save(tar);
	}

	@Override
	public List<Tarea> findAll() {
		
		return (List<Tarea>) this.tareaRepository.findAll();
	}

	@Override
	public void delete(Tarea tar) {
		this.tareaRepository.delete(tar);
	}

}
