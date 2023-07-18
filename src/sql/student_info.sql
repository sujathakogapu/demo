SELECT * FROM students.student1;

select * from students.student2;

select s1.std_id, s1.std_name, s1.std_marks, s1.std_section from students.student1 s1 inner join students.student2 s2 on s1.std_id=s2.std_id;

create view students.student_info_vw as
select s1.std_id, s1.std_name, s1.std_marks, s1.std_section from students.student1 s1 inner join students.student2 s2 on s1.std_id=s2.std_id;

select * from students.student_info_vw;

select s1.std_id, s1.std_name, s1.std_marks, s1.std_section from students.student1 s1
 inner join students.student2 s2 on s1.std_id=s2.std_id where s1.std_name='Raamu';

DELIMITER //

CREATE FUNCTION get_student_id_by_std_name(std_name_param VARCHAR(100))
RETURNS INT
READS SQL DATA
BEGIN
    DECLARE student_id INT;

    SELECT std_id INTO student_id
    FROM students.student1
    WHERE std_name = std_name_param
    LIMIT 1;

    RETURN student_id;
END //

DELIMITER ;
select students.get_student_id_by_std_name('Raamu') from dual;

