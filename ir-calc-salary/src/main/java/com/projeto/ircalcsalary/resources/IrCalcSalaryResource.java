package com.projeto.ircalcsalary.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.projeto.ircalcsalary.entities.IrCalcSalary;
import com.projeto.ircalcsalary.services.IrCalcSalaryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Ir Calc Salary")
@RestController
@RequestMapping(value = "/ircalc")
public class IrCalcSalaryResource {
	@Autowired
	private IrCalcSalaryService service;
	
	@Operation(summary = "Ir Calc Salary")
	@HystrixCommand(fallbackMethod = "getIrCalcSalarytAlternative")
	@GetMapping(value = "/{personId}/salario/{salario}")
	public ResponseEntity<IrCalcSalary> getPayment(@PathVariable Long personId, @PathVariable Double salario){
		IrCalcSalary calc = service.getIrCalcSalary(personId, salario);
		return ResponseEntity.ok(calc);
	}
	
	public ResponseEntity<IrCalcSalary> getIrCalcSalarytAlternative(Long personId, Double salario){
		IrCalcSalary calc = new IrCalcSalary("NOME", "CPF", "CARGO", salario);
		return ResponseEntity.ok(calc);
	}
}