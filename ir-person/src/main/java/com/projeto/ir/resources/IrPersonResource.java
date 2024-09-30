package com.projeto.ir.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.ir.entities.IrPerson;
import com.projeto.ir.repositories.IrPersonRepository;

@Service
public class IrPersonResource {
	private Logger logger = LoggerFactory.getLogger(IrPersonResource.class);
	
	@Autowired
	IrPersonRepository repository;

	public List<IrPerson> findAll() {

		logger.info("Finding all persons!");

		return repository.findAll();
	}

	public IrPerson findById(Long id) {
			
		logger.info("Finding one person!");
			
		return repository.findById(id)
			.orElseThrow();
	}
		
	public IrPerson create(IrPerson person) {

		logger.info("Creating one person!");
			
		return repository.save(person);
	}
		
	public IrPerson update(IrPerson person) {
			
		logger.info("Updating one person!");
			
		var entity = repository.findById(person.getId())
			.orElseThrow();

		((IrPerson) entity).setNome(person.getNome());  
		((IrPerson) entity).setCpf(person.getCpf());
		((IrPerson) entity).setCargo(person.getCargo());
			
		return repository.save(person);
	}
		
	public void delete(Long id) {
			
		logger.info("Deleting one person!");
			
		var entity = repository.findById(id)
				.orElseThrow();
		repository.delete(entity);
	}
}
