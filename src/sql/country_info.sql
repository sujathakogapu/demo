SELECT * FROM world.country;

select cn.Code, cn.Name, cn.Continent, cn.Population from world.country cn inner join world.city ct on cn.Population=ct.Population 
 inner join world.countrylanguage cl on cn.Code=cl.CountryCode;
 
select Population from world.country where Name='Afghanistan';

create view world.countries_population_info_vw as
select cn.Code, cn.Name, cn.Continent, cn.Population from world.country cn inner join world.city ct on cn.Population=ct.Population 
 inner join world.countrylanguage cl on cn.Code=cl.CountryCode;

 select Population from world.country where Name='Afghanistan';
 
 DELIMITER //
  CREATE FUNCTION world.get_country_population_by_Name(country_name_param VARCHAR(255))
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

select world.get_country_population_by_Name('Afghanistan') from dual;
 