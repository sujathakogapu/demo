SELECT * FROM sakila.film;

select title from sakila.film where release_year='2006';

select title,rating,length from sakila.film where release_year='2006' and title like '%OR%' and rating='R' and  length>100 and language_id in
 (select language_id from sakila.language where name='English');#in clause(sub query)
 
select title,rating,length from sakila.film where length>100 or rating='R' order by rating asc;

select distinct rating from sakila.film;

select * from sakila.film limit 4;

select language_id, count(title) from sakila.film group by language_id;

select rating, count(title) total_movies from sakila.film group by rating having count(title)<200;





