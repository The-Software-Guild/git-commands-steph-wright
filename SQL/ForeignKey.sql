/*
foreign key
CONSTRAINT <constraint name>
FOREIGN KEY (<fieldname>)
REFERENCES <parenttablename>(<primarykeyname>);
ON DELETE <reference option>
ON UPDATE <reference option>

cascade - if row from parent is d/u, matching rows in child automatically d/u
set null - if row from the parent table is d/u, the values of the foreign key column in child table is set to null
restrict - if a row from the parent table has a matching row in the child table, mysql rejects deleting or updating rows in the parent table
*/

CREATE TABLE emp (
empid INT PRIMARY KEY,
name VARCHAR(20),
departmentid INT,
designation VARCHAR(20),
salary DOUBLE,
CONSTRAINT deptid_FK
FOREIGN KEY (departmentid)
REFERENCES departments(department_id));

DESCRIBE emp;

DESCRIBE departments;

INSERT INTO departments
VALUES (6, "PR", 56, 56);

INSERT INTO emp 
VALUES (1, "aaa", 6, "Sr", 30000);