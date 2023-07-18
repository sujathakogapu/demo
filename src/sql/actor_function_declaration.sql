SELECT * FROM sakila.film;

select count(*) from sakila.actor;# 200

select count(*) from sakila.film;

select count(*) from sakila.film_actor;

select a.first_name,a.last_name,count(f.title) total_movies  from sakila.actor a  inner join sakila.film_actor fa on a.actor_id=fa.actor_id 
inner join sakila.film f on f.film_id=fa.film_id group by a.first_name,a.last_name order by total_movies desc limit 3 ;

select count(*) from sakila.language;

select count(*) from sakila.film;

select count(*) from sakila.language l inner join sakila.film f on l.language_id=f.language_id;

select * from sakila.language l left join sakila.film f  on l.language_id=f.language_id where f.film_id is null; 

select count(*) from sakila.language l right join sakila.film f on l.language_id= f.language_id;

select count(*) from sakila.language l cross join sakila.film f ; # 

select * from sakila.language l left join sakila.film f  on l.language_id=f.language_id;

select * from sakila.language l right join sakila.film f on l.language_id= f.language_id ;

  ################ view creation ################
  
create view sakila.movie_details_vw as 
select a.first_name,a.last_name,count(f.title) total_movies  from sakila.actor a  inner join sakila.film_actor fa on a.actor_id=fa.actor_id 
inner join sakila.film f on f.film_id=fa.film_id group by a.first_name,a.last_name order by total_movies desc limit 5;

select * from sakila.movie_details_vw;

select actor_id from sakila.actor a 
inner join sakila.film_actor fa on a.actor_id = fa.actor_id where actor_id=1;

DELIMITER //
CREATE FUNCTION get_actor_id_by_firstname(first_name_param VARCHAR(100))
RETURNS INT
READS SQL DATA
BEGIN
    DECLARE actor_id INT;
    
    SELECT actor_id INTO actor_id
    FROM sakila.actor
    WHERE first_name = first_name_param
    LIMIT 1;
    
    RETURN actor_id;
END //

DELIMITER ;

select employee.get_employee_id_by_firstname('john') from dual;

DELIMITER //

CREATE FUNCTION get_actor_last_update_by_firstname(first_name_param VARCHAR(100))
RETURNS date
READS SQL DATA
BEGIN
    DECLARE last_update date;
    
    SELECT fa.last_update INTO last_update
    FROM sakila.actor a
    INNER JOIN sakila.film_actor fa ON a.actor_id = fa.actor_id
    WHERE a.first_name = first_name_param
    LIMIT 1;
    
    RETURN actor_last_update;
END //

DELIMITER ;

select sakila.get_actor_last_update_by_firstname('NICK') from dual;
									