# REQUISITOS

Para executar este projeto, você precisará ter um banco de dados e uma tabela. Configure-os por meio do script abaixo:

```
drop database if exists DB_DUMMY_API_REST_EXAMPLE;

create database DB_DUMMY_API_REST_EXAMPLE;

show databases;

use DB_DUMMY_API_REST_EXAMPLE;

create table TB_EMPLOYEES (
ID integer not null auto_increment,
EMPLOYEE_NAME varchar(27) not null,
EMPLOYEE_SALARY double(8,2) not null,
EMPLOYEE_AGE INTEGER(3) not null,
PROFILE_IMAGE varchar(50),
primary key(ID)
);

show tables;

select * from TB_EMPLOYEES;
```

Depois de criar o banco de dados e a tabela, defina as constantes **SERVER**, **PORT**, **USER** e **PASSWORD** na clasee 
**DatabasesConfiguration**.

O site onde os dados estão disponíveis está em http://dummy.restapiexample.com/.

Execute o projeto pela classe **ExtractionExecution**.