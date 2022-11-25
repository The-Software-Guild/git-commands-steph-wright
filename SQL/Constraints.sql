/*
constraints:
NOT NULL
UNIQUE (creates index)
PRIMARY KEY (creates index)
AUTO_INCREMENT
DEFAULT
CHECK
FOREIGN KEY
*/

USE wileyDI001;

CREATE TABLE users (
	userId INT AUTO_INCREMENT PRIMARY KEY,
	userName VARCHAR(25) NOT NULL,
    age INT, 
	password VARCHAR(25) DEFAULT "MyPassword");

INSERT INTO users (userName, age, password)
VALUES ("User1", 34, "user123");

SELECT * FROM users;

INSERT INTO users (userName, password)
VALUES("User2", "userpassword123");

INSERT INTO users (userName, age)
VALUES ("User3", 26);


CREATE TABLE voters (
	voterId INT AUTO_INCREMENT PRIMARY KEY,
	voterName VARCHAR(25),
	address VARCHAR(40),
	age INT CHECK(age >= 18));
    
INSERT INTO voters (voterName, address, age)
VALUES ("aaa", "Address 1", 34);

-- check is voilated
INSERT INTO voters (voterName, address, age)
VALUES ("bbb", "Address 2" 14);

SELECT * FROM voters;

-- show names of tables in current database
SHOW TABLES;

-- shows the structure of the table
DESCRIBE voters;
