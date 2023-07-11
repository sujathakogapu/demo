create schema election;

use election;

create table candidates(candidate_id int  primary key auto_increment, candidate_name varchar(100), party_name varchar(100), constituency varchar(100));

create table  Voters(voter_id int primary key auto_increment, voter_name varchar(100), voter_address varchar(100), voter_constituency varchar(100));

create table Votes(vote_id int primary key auto_increment, 
voter_id int not null,
candidate_id int not null,
foreign key (voter_id) references Voters(voter_id),
foreign key (candidate_id) references Candidates(candidate_id));

create table results( candidate_id int not null,
total_votes int not null,
foreign key (candidate_id) references candidates(candidate_id));

insert into candidates(candidate_name,party_name,constituency) values
('John Smith','Independent','Constituency A'),
('Jane Doe','Green Party','Constituency B'),
('Michael Johnson','Liberal Party','Constituency C'),
('Sarah Brown','Conservative Party','Constituency D');

insert into voters(voter_name,voter_address,voter_constituency) values
('Robert Johnson','123 Main St','Constituency A'),
('Emily Davis','456Elm St','Constituency B'),
('William Smith','789 Oak St','Constituency C'),
('Sophia Wilson','321 Maple St','Constituency D'),
('Michael Anderson','567 Pine St','Constituency A'),
('Olivia Martin','890 Cedar St','Constituency B'),
('Ethan Taylor','432 Birch St','Constituency C'),
('Ava Rodriguez','765 Walnut St','Constituency D'),
('Liam Clark','234 Spruce St','Constituency A'),
('Sophia Martinez','567 Fir St','Constituency B');

insert into votes(voter_id,candidate_id) values
(1,2),
(2,3),
(3,1),
(4,4),
(5,1),
(6,2),
(7,3),
(8,4),
(9,2),
(10,1),
(1,4),
(2,1),
(3,3),
(4,2),
(5,4);

insert into results(candidate_id,total_votes) values
(1,4),
(2,4),
(3,3),
(4,4);

select candidate_name from candidates;

select voter_name, voter_address from voters;

select candidate_name, count(*) AS total_votes from results group by candidate_name;

select constituency from candidates where party_name='Green Party';

 select constituency, count(*) AS voter_id from votes group by constituency;
 
 select candidate_name, count(*) as total_votes from votes group by candidate_name order by total_votes desc limit 1;
 
 select candidate_name, party_name from candidates where candidate_name='Jane Doe' and party_name='Independent';
 
 select voter_name from votes where total_votes=(select max(total_votes) from results);
 
 







 





