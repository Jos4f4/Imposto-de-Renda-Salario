package com.projeto.ircalcsalary.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projeto.ircalcsalary.entities.IrPerson;

@Component
@FeignClient(name = "ir-person", path = "/person")
public interface IrPersonFeignClients {
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<IrPerson> findById(@PathVariable Long id);
}