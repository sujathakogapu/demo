SELECT * FROM world.country;

select cn.Code, cn.Name, cn.Continent, cn.Population from world.country cn inner join world.city ct on cn.Population=ct.Population 
 inner join world.countrylanguage cl on cn.Code=cl.CountryCode;

select Population from world.country where Name='Afghanistan';

create view world.countries_population_info_vw as
select cn.Code, cn.Name, cn.Continent, cn.Population from world.country cn;
 
 select * from world.countries_population_info_vw;

 select Population from world.country where Name='Afghanistan';

 DELIMITER //
  CREATE FUNCTION world.get_country_population_by_name(country_name_param VARCHAR(255))
   RETURNS int
   READS SQL DATA
   BEGIN
      DECLARE country_population int;
      SELECT Population INTO country_population
      from world.country
      where Name=country_name_param
      LIMIT 1;
      RETURN country_population;
	END //
DELIMITER //

select world.get_country_population_by_name('Afghanistan') from dual;

DELIMITER //
create procedure sakila.get_film_description_specil_features(in film_id_p int, out film_description_p varchar(200), out film_special_features_p varchar(200))
begin
select description into film_description_p from sakila.film where film_id=film_id_p;
select special_features into film_special_features_p from sakila.film where film_id=film_id_p;
end //
set @film_description=0;
set @film_special_features=0;
call sakila.get_film_description_specil_features(1,@film_description,@film_special_features);
select @film_description,@film_special_features;




