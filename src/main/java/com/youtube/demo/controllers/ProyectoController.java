package com.youtube.demo.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.demo.model.Proyecto;
import com.youtube.demo.model.User;
import com.youtube.demo.service.ProyectoService;
import com.youtube.demo.util.RestResponse;

@RestController
public class ProyectoController {
	
	@Autowired
	protected ProyectoService proyectoService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveOrUpdatePro",method = RequestMethod.POST )
	public RestResponse saveOrUpdatePro(@RequestBody String proyectJson) throws JsonParseException, JsonMappingException, IOException
	{
		this.mapper= new ObjectMapper();
		Proyecto proy = this.mapper.readValue(proyectJson, Proyecto.class);
		
		this.proyectoService.save(proy);
		
		return new RestResponse(HttpStatus.OK.value(), "Operación Exitosa");
	}
	
	@RequestMapping(value = "/getProjects",method = RequestMethod.GET)
	public List<Proyecto> getUsersPro() {
		return this.proyectoService.findAll();
	}
	
	@RequestMapping(value = "/deleteProject",method = RequestMethod.POST)
	public void deleteProject(@RequestBody String proyectJson) throws Exception {
		this.mapper= new ObjectMapper();
		Proyecto proy = this.mapper.readValue(proyectJson,Proyecto.class);
		
		if(String.valueOf(proy.getId()) == null)
		{
			throw new Exception("El id esta nulo");
		}
		
		this.proyectoService.delete(proy);
	}
	
	@RequestMapping(value = "/usuarios",method = RequestMethod.GET)
	public List<User> ListarProjects() {
		return proyectoService.findAllUsers();
	}
	
}
