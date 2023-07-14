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
   
#1. Retrieve the names of all artists who have released albums in a specific genre.
select name from artists ;

select title from albums;

select * from music_library.songs ;

select name from songs;

select names from artists where release_date in( select release_date from albums where release_date='2022');

select title from albums where release_date='2024';

#1. Retrieve the names of all artists who have released albums in a specific genre.
select name from artists;

#2. Retrieve the titles of albums released within a specific date range.
select title from albums where release_date='2019-09-20';

#3. Retrieve the titles of songs with a duration greater than a specific value from a specific album.
select title, duration from songs;
SELECT title, duration from songs where duration >200 in (select album_id from songs where album_id=2);

#4. Retrieve the names of playlists that contain a specific song.
select name from playlists where playlist_id in (select song_id from playlist_songs where song_id=1);

#5. Retrieve the total duration of all songs in a specific genre.
select count(duration) total_duration from songs where genre='Electronic';

#6. Retrieve the names of artists who have songs in more than one genre.
select a.artist_id, a.name, count(*) songs_id
from songs s join artists a ON a.artist_id = s.album_id
group by a.artist_id, a.name
having count(*) > 1;

#7. Retrieve the titles of albums with the most number of songs.
select title from albums;
select album_id, count(album_id)total_songs from albums group by album_id having total_songs=
 (select max(album_id) from (select album_id, count(album_id)total_songs from songs group by album_id) t);
 
#8. Retrieve the names of artists who have songs in all available genres.
select name from artists where (select name from genres where name='Rock');

#9. Retrieve the titles of albums that have at least one song from each genre.
select title from albums where (select name from genres where genre_id=1);

#10. Retrieve the names of playlists that have more than a specific number of songs.
select playlist_id, count(playlist_id)total_songs from playlists group by album_id having total_songs=
 (select max(album_id) from (select album_id, count(album_id)total_songs from albums group by album_id) t);
 
 
 







 
