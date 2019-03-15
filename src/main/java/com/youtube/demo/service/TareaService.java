package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.Proyecto;
import com.youtube.demo.model.Tarea;
import com.youtube.demo.model.User;

public interface TareaService {

	Tarea save(Tarea tar);

	List<Tarea> findAll();

	void delete(Tarea tar);

}
