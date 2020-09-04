# REQUIREMENTS

To run this project, you will need to have a database and table. Configure them through the script below:

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

After created the database and table, set the constants **SERVER**, **PORT**, **USER** and **PASSWORD** in the class 
**DatabaseConfiguration**.

The site where the data have been disponible is at http://dummy.restapiexample.com/.

Execute the project through the class **ExtractionExecution**