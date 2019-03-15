package com.youtube.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.youtube.demo.model.Proyecto;
import com.youtube.demo.model.User;

public interface ProyectoRepository extends CrudRepository<Proyecto, Long>{

	@Query("FROM User")
	List<User> findAllUsers();

}
