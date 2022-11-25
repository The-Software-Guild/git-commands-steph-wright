CREATE TABLE departments(
	department_id INT PRIMARY KEY,
	department_name VARCHAR(30) NOT NULL,
	manager_id INT,
	location_id INT
);

CREATE TABLE jobs (
	job_id VARCHAR(10) PRIMARY KEY,
	job_title VARCHAR(35) NOT NULL,
	min_salary INT,
	max_salary INT
);

CREATE TABLE employees (
	employee_id INT PRIMARY KEY,
	first_name VARCHAR(20),
	last_name VARCHAR(20) NOT NULL,
	email VARCHAR(20) NOT NULL,
	phone_number VARCHAR(20),
	hire_date DATE NOT NULL,
	job_id VARCHAR(10) NOT NULL,
	salary DOUBLE,
	comission_pct DOUBLE,
	manager_id INT,
	department_id INT,

	CONSTRAINT jobid_FK
	FOREIGN KEY(job_id)
	REFERENCES jobs(job_id),

	CONSTRAINT deptid_FK
	FOREIGN KEY(department_id)
	REFERENCES departments(department_id)
);

INSERT INTO departments
	VALUES (101, "IT", 1, 1),
	(102, "Sales", 2, 2),
	(103, "HR", 3, 3),
	(104, "PR", 4, 4),
	(105, "Finance", 5, 5);

INSERT INTO jobs (job_id, job_title)
	VALUES (1, "CEO"),
	(2, "SEO"),
	(3, "Executive"),
	(4, "Senior"),
	(5, "Associate");

INSERT INTO employees 
	VALUES (1, "aaa", "aaa", "aaa@aaa.co.uk", "07123456", "2022-11-15", 1, 300000, 100000, null, null),
	(2, "bbb", "bbb", "bbb@aaa.co.uk", "07123457", "2022-11-15", 2, 200000, 50000, null, null),
	(3, "ccc", "ccc", "ccc@aaa.co.uk", "07123458", "2022-11-15", 3, 100000, 10000, 1, 101),
	(4, "ddd", "ddd", "ddd@aaa.co.uk", "07123459", "2022-11-15", 3, 100000, 10000, 2, 102),
	(5, "eee", "eee", "eee@aaa.co.uk", "07123460", "2022-11-1", 4, 50000, 5000, 3, 103);

SELECT * FROM employees;
SELECT * FROM employees WHERE first_name = "aaa";
SELECT * FROM employees WHERE department_id IS NOT NULL;

SELECT * FROM jobs;
SELECT * FROM departments;employees