create schema students;
use students;
create table student1(std_id int primary key auto_increment,
std_name varchar(100) not null,
std_section varchar(100) not null,
std_marks int not null);

create table student2(std_id int primary key auto_increment,
std_name varchar(100) not null,
std_section varchar(100) not null,
std_marks int not null);

insert into student1(std_name,std_section,std_marks) values
('Raamu', 'secA', 92),
('Raani', 'secB', 95),
('Raaju', 'secC', 89);

select * from student1;

insert into student2(std_name,std_section,std_marks) values
('priya', 'secD', 82),
('Raani', 'secB', 55),
('hema', 'secA', 99);

select * from student2;

select std_id, std_name from student1 union select std_id, std_name from student2;

select std_marks from student1 where std_marks=82 union select std_section from student2 where std_section='secB';

select std_id, std_name from student1  select std_id, std_name from student2;

select std_id, std_name from student1 intersect  select std_id, std_name from student2;

select std_id, std_name from student1 except select std_id, std_name from student2;
