#########CRUD operation syntax##########
#INSERT INTO table_name (column1, column2, ...) VALUES (value1, value2, ...);
#INSERT INTO table_name (column1, column2, ...) VALUES (value1, value2, ...), (value1, value2, ...), ...;
#SELECT * FROM table_name;
#SELECT column1, column2, ... FROM table_name;
#SELECT column1, column2, ... FROM table_name WHERE condition;
#UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE condition;
#DELETE FROM table_name WHERE condition;
##############implementation###################
select * from sakila.actor;
insert into sakila.actor (first_name, last_name) values ( 'sujatha', 'kogapu');
select * from sakila.actor where first_name='sujatha';
delete from sakila.actor where actor_id=203;
update sakila.actor set first_name='SUJATHA', last_name='KOGAPU' where actor_id=201;