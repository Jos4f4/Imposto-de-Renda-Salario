# Imposto-de-Renda-Salario

### About CRUD de simulacao de desconto de renda baseado no salário cadastrado, baseado na arquitetura de microsserviços Java 11 e Spring Boot.
## Person
### http://localhost:8765/person/person
### http://localhost:8765/person/person/1
## IrCalcSalary
### http://localhost:8765/ircalc/ircalc/3/salario/1

## CREATE
### http://localhost:8765/person/person
### 
### {
###    "id": 6,
###    "nome": "Joana",
###    "cpf": "00000000006",
###    "cargo": "Gerente de TI",
###    "salario": 15000.00
### }
### 
## UPDATE
### http://localhost:8765/person/person
### {
###    "id": 6,
###    "nome": "Joana",
###    "cpf": "00000000006",
###    "cargo": "Gerente de TI",
###    "salario": 16000.00
### }

## DELETE
### http://localhost:8765/person/person/6

## SWAGGER
### http://localhost:{PORTA}/v3/api-docs
### http://localhost:{PORTA}/swagger-ui.html

### EUREKA http://localhost:8761
### DB localhost:{PORTAcars}/db-persons

 
