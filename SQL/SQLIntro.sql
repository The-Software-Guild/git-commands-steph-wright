-- create database
CREATE DATABASE wileyDI001;

-- use database
USE wileyDI001;

-- delete database
DROP DATABASE wileyDI001;

-- show databases
SHOW DATABASES;

-- assignment: create table
CREATE TABLE departments(
department_id INT PRIMARY KEY,
department_name VARCHAR(30),
manager_id INT,
location_id INT);

-- add 5 records to the table
INSERT INTO departments
VALUES (101, "IT", 1, 1),
(102, "Finance", 2, 2),
(103, "Sales", 3, 3),
(104, "HR", 4, 4),
(105, "M&E", 5, 5);
