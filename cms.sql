CREATE TABLE user
(
	userid int,
	name varchar(150),
	email varchar(250),
	password varchar(150),
	PRIMARY KEY(userid)
);

INSERT INTO user VALUES(1,'Suhel', 'suhel@cms.com', 'xyz');
INSERT INTO user VALUES(2,'Aftab', 'aftab@cms.com', 'xyz');
INSERT INTO user Values(3, 'Nadim', 'nadim@cms.com', 'xyz');

UPDATE USER set name='Naddy'WHERE userid=3;