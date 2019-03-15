package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.Proyecto;
import com.youtube.demo.model.User;

public interface ProyectoService {

	Proyecto save(Proyecto proy);

	List<Proyecto> findAll();

	void delete(Proyecto proy);

	List<User> findAllUsers();

}
