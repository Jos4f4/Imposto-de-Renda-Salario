package com.projeto.ir.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ir.entities.IrPerson;
import com.projeto.ir.services.IrPersonService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Person project")
@RestController
@RequestMapping("/person")
public class IrPersonController {
	
	@Autowired
	private IrPersonService service;
	
	@Operation(summary = "Find all persons")
	@RequestMapping(method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<IrPerson> findAll() {
		return service.findAll();
	}
	
	@Operation(summary = "Find a specific person by ID")
	@RequestMapping(value = "/{id}",
			method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public IrPerson findById(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}
	
	@Operation(summary = "Create person")
	@RequestMapping(method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public IrPerson create(@RequestBody IrPerson person) {
		return service.create(person);
	}
	
	@Operation(summary = "Update person")
	@RequestMapping(method=RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public IrPerson update(@RequestBody IrPerson person) {
		return service.update(person);
	}
	
	@Operation(summary = "Delete person")
	@RequestMapping(value = "/{id}",
			method=RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}
}
