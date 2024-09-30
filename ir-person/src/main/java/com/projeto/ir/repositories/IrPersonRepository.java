package com.projeto.ir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.ir.entities.IrPerson;

public interface IrPersonRepository extends JpaRepository<IrPerson, Long> {

}
