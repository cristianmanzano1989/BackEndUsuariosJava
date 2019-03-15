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

import com.youtube.demo.model.Tarea;
import com.youtube.demo.service.TareaService;
import com.youtube.demo.util.RestResponse;

@RestController
public class TareasController {
	
	
	@Autowired
	protected TareaService tareaService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveOrUpdateTareas",method = RequestMethod.POST )
	public RestResponse saveOrUpdateTareas(@RequestBody String tareaJson) throws JsonParseException, JsonMappingException, IOException
	{
		this.mapper= new ObjectMapper();
		Tarea tar = this.mapper.readValue(tareaJson, Tarea.class);
		
		this.tareaService.save(tar);
		
		return new RestResponse(HttpStatus.OK.value(), "Operación Exitosa");
	}
	
	@RequestMapping(value = "/getTareas",method = RequestMethod.GET)
	public List<Tarea> getTareas() {
		return this.tareaService.findAll();
	}
	
	@RequestMapping(value = "/deleteTarea",method = RequestMethod.POST)
	public void deleteTarea(@RequestBody String tareaJson) throws Exception {
		this.mapper= new ObjectMapper();
		Tarea tar = this.mapper.readValue(tareaJson,Tarea.class);
		
		if(String.valueOf(tar.getId()) == null)
		{
			throw new Exception("El id esta nulo");
		}
		
		this.tareaService.delete(tar);
	}
	

}
