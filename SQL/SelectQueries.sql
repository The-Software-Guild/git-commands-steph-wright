
SELECT employee_id, last_name, job_id, hire_date AS startdate
FROM employees;

SELECT CONCAT(last_name, ", ", job_id) AS "Employee and Title"
FROM employees;

SELECT CONCAT(employee_id, ", " , first_name, ", " ,last_name
, ", " , email, ", " ,phone_number, ", " ,hire_date, ", " ,
job_id, ", " ,salary, ", " ,comission_pct, ", " ,manager_id, ", " ,
department_id) AS THE_OUTPUT
FROM employees;

SELECT last_name, salary FROM employees 
WHERE salary > 12000;

SELECT last_name, job_id, hire_date FROM employees
WHERE last_name = "Matos" OR last_name = "Taylor";