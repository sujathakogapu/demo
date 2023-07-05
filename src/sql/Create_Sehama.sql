create schema university;
use university;

create table students(id INT primary key, first_name varchar(50) not null, last_name varchar(50) not null, email varchar(50)  not null, date_of_birth date not null);

select * from students;

insert into students(id,first_name,last_name,email,date_of_birth) 
values
(1,'John','Doe','johndoe@example.com','2000-05-10'),
(2,'Jane','Smith','janesmith@example.com','1999-09-15'),
(3,'Michael','Johnson','michaeljohnson@example.com','2001-02-28'),
(4,'Emily','Williams','emilywilliams@example.com','2002-11-20'),
(5,'David','Brown','davidbrown@example.com','2003-07-08');

select * from students;

create table courses(id INT primary key, course_name varchar(50) not null,instructor varchar(50) not null,credits integer not null);

select * from courses;

insert into courses (id, course_name, instructor, credits) 
values (1,'Mathematics','Dr. Johnson',3),
(2,'Physics','Prof. Smith',4),
(3,'Computer Science','Dr. Williams',5),
(4,'English','Lecturer Brown',3),
(5,'Chemistry','Prof. Davis',4);

create table enrollments (id INT primary key auto_increment,
student_id INT not null,
course_id INT not null,
enrollment_date date not null, 
foreign key (student_id) references students(id),
foreign key (course_id) references courses(id)
);

insert into enrollments(student_id,course_id,enrollment_date)
values
(1,1,'2022-09-01'),
(1,3,'2022-09-01'),
(2,2,'2022-09-05'),
(3,1,'2022-09-08'),
(4,4,'2022-09-08'),
(5,2,'2022-09-10'),
(5,3,'2022-09-10');

select * from enrollments;

select * from university.students where id=5;

select * from university.students where id=7;

select * from university.enrollments where student_id=3;

select * from university.enrollments where course_id=1;

select * from university.courses where course_name='sujatha';




