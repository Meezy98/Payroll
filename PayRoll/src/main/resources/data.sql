create table employee(
    employeeId serial primary key,
    departmentId integer unique not null,
    roleId integer unique not null,
    first_name text not null,
    last_name text not null,
    phone integer unique,
    email varchar unique,
    salary integer not null,
    hire_date Date not null,
    foreign key departmentId references department(departmentId),
    foreign key roleId references role(roldId)
);

create table role (
    roleId serial primary key,
    title text unique not null
);

create table department (
    departmentId serial primary key,
    deptName text unique not null
) ;