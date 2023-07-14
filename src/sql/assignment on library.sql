create schema library;
use library;
create table authors(
id INT   Primary Key AUTO_INCREMENT,
author_name  VARCHAR(100)  Not Null
);
create table geners(
id int Primary Key AUTO_INCREMENT,
genre_name VARCHAR(50)  Not Null
);

create table members(
id  INT Primary Key Auto_Increment,
member_name  VARCHAR(100)   Not Null,
email  VARCHAR(100)  Not Null unique,
address  VARCHAR(200));

create table books(
book_id   INT   Primary Key AUTO_INCREMENT,
 title   VARCHAR(100)  Not Null,
 author_id  INT  Not Null,

publication_date  DATE Not Null,
isbn  VARCHAR(13)  Not Null,
genre_id   INT  Not Null,

available  BOOLEAN   Not Null
Default True,
Foreign Key(author_id)references authors(id),
Foreign Key (genre_id) references geners(id)
);

SELECT * FROM library.reviews;
select book_id,avg(rating) from reviews group by book_id;
select book_id,count(review_id) from reviews group by book_id;


SELECT * FROM library.members;

SELECT * FROM library.loans;
select book_id from loans where member_id=9;
select * from books where book_id in (select book_id from loans where member_id=2);
select return_date from loans where loan_id=3;

SELECT * FROM library.geners;
SELECT * FROM library.books

create table loans(
 loan_id    INT  Primary Key Auto_Increment,
   book_id  INT  Not Null, 
   member_id   INT  Not Null, 
   loan_date  DATE  Not Null,
   return_date  DATE,
   Foreign Key (book_id)references books(book_id),
   Foreign Key (member_id)references members(id)
   );



create table reviews( review_id INT  Primary Key Auto_Increment,
    book_id INT Not Null,
    member_id  INT   Not Null,
    rating  INT  Not Null,
	comments    VARCHAR(500),
    Foreign Key (book_id)references books(book_id),
    Foreign Key (member_id)references members(id)
    );



select * from reviews;
insert into authors(author_name)
values
('JaneSmith'),
('JohnDoe'),
('EmilyBrown'),
('MichaelJohnson'),
('SarahWilson');

insert into geners(genre_name)
values
('Fiction'),
('Mystery'),
('Romance'),
('Science Fiction'),
('Non-Fiction');

insert into books(title,author_id,publication_date,isbn,genre_id,available)
values('The Great Gatsby',1,'1925-04-10','9780743273565',1,true),
('Pride and Prejudice',2,'1813-01-28','9780141439518',3,true),
('Gone Girl',3,'2012-06-05','9780307588364',2,true),
('1984',4,'1949-06-08','9780451524935',4,true),
('To Kill a Mockingbird',1,'1960-07-11','9780446310789',1,false);




insert into members(member_name,email,address)
values
('JohnSmith','johnsmith@example.com', " 123Main Street"),
('Jane Doe','janedoe@example.com','456 Elm Street'),
('Robert Johnson','robertjohnson@example.com','789 Oak Street'),
('Emily Davis','emilydavis@example.com','567 Pine Avenue'),
('David Anderson','davidanderson@example.com','890 Maple Road'),
('Lisa Wilson','lisawilson@example.com','234 Cedar Lane'),
('Michael Brown','michaelbrown@example.com','567 Oak Avenue'),
('Susan Miller','susanmiller@example.com','789 Elm Street'),
('Andrew Clark','andrewclark@example.com','123 Pine Avenue'),
('Jessica Taylor','jessicataylor@example.com','456 Maple Road');



insert into loans(book_id,member_id,loan_date,return_date) values 
(1,1,'2023-06-01','2023-06-15'), 
(2,2,'2023-06-02','2023-06-16'), 
(3,5,'2023-06-05','2023-06-19'), 
(4,6,'2023-06-06','2023-06-20'), 
(5,9,'2023-06-07','2023-06-21');
insert into reviews(book_id,member_id,rating,comments)
values
(1,1,4,'Great book!'),
(2,2,5,'Highly recommended!'),
(3,3,3,'Average read.'),
(4,4,4,'Enjoyed it.'),
(5,5,2,'Disappointed.'),
(1,6,4,'Well-written and engaging.'),
(2,7,3,'Not what I expected.'),
(3,8,5,'One of my favorites!'),
(4,9,4,'Incredible storyline.'),
(5,10,2,'Couldnt finish it.');


#1. Retrieve the titles and publication dates of all books written by a specific author.
select title,publication_date from library.books where author_id=2;

#2. Retrieve the names of authors who have written books in a specific genre.
select author_name from library.authors  where id in(select id from library.geners where id=1);

#3. Retrieve the number of available books for each genre.
select genre_id,available from library.books;

#4. Retrieve the titles of books that have been borrowed by a specific member.
select b.title from  library.books b  join library.members m on b.book_id=m.id  where m.id= 3;

#5. Retrieve the names of members who have borrowed books in a specific genre.
select m.member_name from library.members m join library.books b on b.genre_id=m.id where b.genre_id=1 group by m.member_name ;

#6. Retrieve the titles of books that have not been reviewed.
select b.title from library.books b join library.reviews r on b.book_id = r.review_id  group by  b.title;

#7. Retrieve the member names and loan dates for books that were borrowed within a specific date range.
select m.member_name,l.loan_date from library.members m join library.loans l where loan_date='2023-06-07' group by m.member_name;

#8. Retrieve the average rating for books written by a specific author.
select r.book_id ,avg(r.rating ) from library.reviews r join library.authors a on r.book_id=a.id  where a.id=5 group by r.book_id  ;

#9. Retrieve the titles of books that have been reviewed with a rating higher than a specific value.
SELECT title FROM library.books WHERE book_id  in (SELECT book_id FROM library.reviews WHERE rating >4) ORDER BY title;

#10. Retrieve the member names and their corresponding loan dates for books with a specific publication year
select m.member_name,l.loan_date from library.members m join library.books b join library.loans l where publication_date = '2012-06-05';

