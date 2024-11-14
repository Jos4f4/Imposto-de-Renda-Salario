package com.projeto.ircalcsalary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.projeto.ircalcsalary.entities.IrCalcSalary;
import com.projeto.ircalcsalary.services.IrCalcSalaryServiceFeign;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Ir Calc Salary")
@RestController
@RequestMapping(value = "/ircalc")
public class IrCalcSalaryController {
	@Autowired
	private IrCalcSalaryServiceFeign service;
	
	@Operation(summary = "Ir Calc Salary")
	@HystrixCommand(fallbackMethod = "getIrCalcSalarytAlternative")
	@GetMapping(value = "/{personId}/salario/{ir}")
	public ResponseEntity<IrCalcSalary> getIrCalcSalary(@PathVariable Long personId, Double salario,@PathVariable Double ir){
		IrCalcSalary calc = service.getIrCalcSalary(personId, ir);
		return ResponseEntity.ok(calc);
	}
	
	public ResponseEntity<IrCalcSalary> getIrCalcSalarytAlternative(Long personId, Double salario, Double ir){
		IrCalcSalary calc = new IrCalcSalary("NOME", "CPF", "CARGO", salario, ir );
		return ResponseEntity.ok(calc);
	}
}
