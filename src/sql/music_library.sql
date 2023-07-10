create schema music_library;
use music_library;

create table artists(artist_id INT Primary Key Auto_Increment, name VARCHAR(100) Not Null);

create table albums(album_id INT Primary Key Auto_Increment,
   artist_id INT Not Null,
   title VARCHAR(100) Not Null,
   release_date DATE Not Null,
   Foreign Key (artist_id) references artists(artist_id));
   
create table songs(song_id INT Primary Key Auto_Increment,
   album_id INT Not Null,
   title VARCHAR(100) Not Null,
   duration INT Not Null,
   genre VARCHAR(50),
   foreign key (album_id) references albums(album_id));
   
create table playlists(playlist_id INT Primary Key Auto_Increment,
   name VARCHAR(100) Not Null);
   
create table playlist_songs( playlist_song_id INT Primary Key Auto_Increment,
   playlist_id INT, 
   song_id  INT, 
   Foreign Key (playlist_id) references playlists(playlist_id),
   Foreign Key (song_id) references songs(song_id));
   
create table genres( genre_id INT Primary Key Auto_Increment,
   name VARCHAR(50)  Not Null);
   
insert into artists (name) values ('John Smith'),
   ('Alice Johnson'),
   ('Robert Davis');
   
insert into  albums(artist_id,title,release_date) values
   (1,'Album One','2020-05-10'),
   (1,'Album Two','2018-02-15'),
   (2,'Debut Album','2019-09-20'),
   (3,'Collection','2021-11-30');
   
insert into songs(album_id,title,duration,genre) values
   (1,'Song One',240,'Pop'),
   (1,'Song Two',180,'Rock'),
   (2,'Song Three',210,'Pop'),
   (3,'Debut Song',195,'Electronic'),
   (3,'Another Song',220,'Rock'),
   (4,'Collection Song',275,'Pop');

insert into playlists(name) values
   ('Workout'),
   ('Chill'),
   ('Party');
   
insert into playlist_songs(playlist_id,song_id) values
   (1,1),
   (1,3),
   (1,5),
   (2,2),
   (2,4),
   (3,1),
   (3,2),
   (3,6);
   
insert into genres(name) values
   ('Pop'),
   ('Rock'),
   ('Electronic');
   
select * from artists;

select title from albums;

select * from music_library.songs ;

select name from songs;

select names from artists where release_date in( select release_date from albums where release_date='2022');

select title from albums where release_date='2024';











 
