Requirement: 
MySQL Community Server + MySQL workbench

MySQL Connector Java = Version 8.0.13

Before compiling the .java files, go to MySQL Workbench and compile these lines of codes: 

Start from here:

create database user_demo;
-- USE user_demo;
CREATE TABLE user_list 
( id int NOT NULL,
  name varchar(250) NOT NULL,
  password varchar(250),
  first_name varchar(250) NOT NULL,
  last_name varchar(250) NOT NULL,
  email_id varchar(250) NOT NULL,
  mobile_number varchar(250) NOT NULL, 
);

INSERT INTO user_list (id, name, password)
value (1, 'YOUR-USER-NAME','YOUR-PASSWORD'); 

:End from here.

For the last line, you can input whichever values you want ! 

After that, the following steps must be followed: 

1. 
  a)Go to UserLogin.java
  
  b)Look at line 102 and 103, change the user and password to your local host counterparts (you will have these AFTER you have setup your MySQL Community Server).
  
2. 
  a) Go to ChangePassword.java
  
  b) Look at line 74 and 75, do as instructed in 1b). 
  
If any problems occur, feel free to contact me via my WhatsApp. 

That's all, team !
UPDATED: Registration is in process. 
