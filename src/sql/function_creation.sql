SELECT * FROM employee.employees;

alter table employee.employees drop column salary;

select first_name, last_name, email, name department_name, salary from employee.employees e inner join employee.departments d on e.department_id=d.id 
inner join employee.salaries s on e.id = s.employee_id;

create view employee.employee_details_vw as
select first_name, last_name, email, name department_name, salary from employee.employees e inner join employee.departments d on e.department_id=d.id 
inner join employee.salaries s on e.id = s.employee_id;

select * from employee.employee_details_vw;

select salary from employee.employees e 
inner join employee.salaries s on e.id = s.employee_id where first_name='john';

DELIMITER //

CREATE FUNCTION get_employee_id_by_firstname(first_name_param VARCHAR(255))
RETURNS INT
READS SQL DATA
BEGIN
    DECLARE emp_id INT;
    
    SELECT id INTO emp_id
    FROM employee.employees
    WHERE first_name = first_name_param
    LIMIT 1;
    
    RETURN emp_id;
END //

DELIMITER ;

select employee.get_employee_id_by_firstname('john') from dual;

DELIMITER //

CREATE FUNCTION get_employee_salary_by_firstname(first_name_param VARCHAR(255))
RETURNS DECIMAL(10, 2)
READS SQL DATA
BEGIN
    DECLARE emp_salary DECIMAL(10, 2);
    
    SELECT s.salary INTO emp_salary
    FROM employee.employees e
    INNER JOIN employee.salaries s ON e.id = s.employee_id
    WHERE e.first_name = first_name_param
    LIMIT 1;
    
    RETURN emp_salary;
END //

DELIMITER ;

select employee.get_employee_salary_by_firstname('Jane') from dual;

