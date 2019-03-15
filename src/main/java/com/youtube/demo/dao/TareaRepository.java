package com.youtube.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.youtube.demo.model.Tarea;

public interface TareaRepository extends CrudRepository<Tarea,Long>{

}
