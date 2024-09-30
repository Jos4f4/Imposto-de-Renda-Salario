package com.projeto.ircalcsalary.entities;

public class IrCalcSalary {
	
	private String nome;
	private String cpf;
	private String cargo;
	private Double salario;
	
	public IrCalcSalary() {
		
	}

	public IrCalcSalary(String nome, String cpf, String cargo, Double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double getSalario() {
		if(salario < 0) {
			return -(salario * 0);
		}
		if(salario>=0 && salario<=2259.20) {
			return salario * 0;
		}
		if(salario>2259.20 && salario<=2826.65) {
			return salario * (7.5/100);
		}
		if(salario>1826.65 && salario<=3751.05) {
			return salario * (15/100);
		}
		if(salario>3751.05 && salario<=4661.68) {
			return salario * (22.5/100);
		}
		return salario * (27.5/100);
	}
	
}
