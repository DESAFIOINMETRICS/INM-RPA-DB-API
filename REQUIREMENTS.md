# REQUISITOS

_Script_ utilizado para a criação do banco de dados e da tabela:

```
drop database if exists DB_DUMMY_API_REST_EXAMPLE;

create database DB_DUMMY_API_REST_EXAMPLE;

show databases;

use DB_DUMMY_API_REST_EXAMPLE;

create table TB_EMPLOYEE (
ID integer not null auto_increment,
EMPLOYEE_NAME varchar(27) not null,
EMPLOYEE_SALARY double(8,2) not null,
EMPLOYEE_AGE INTEGER(3) not null,
PROFILE_IMAGE varchar(50),
primary key(ID)
);

show tables;

select * from TB_EMPLOYEE;
```

