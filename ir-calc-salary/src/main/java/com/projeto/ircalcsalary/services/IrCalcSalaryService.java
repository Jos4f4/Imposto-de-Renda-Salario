package com.projeto.ircalcsalary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.ircalcsalary.entities.IrCalcSalary;
import com.projeto.ircalcsalary.entities.IrPerson;
import com.projeto.ircalcsalary.feignclients.IrPersonFeignClients;

@Service
public class IrCalcSalaryService {
	
	@Autowired
	private IrPersonFeignClients irPersonFeignClient;
	
	public IrCalcSalary getIrCalcSalary(long personId, Double ir) {

		IrPerson person = irPersonFeignClient.findById(personId).getBody();
		return new IrCalcSalary(person.getNome(), person.getCpf(), person.getCargo(), person.getSalario(), ir);
	}
}
