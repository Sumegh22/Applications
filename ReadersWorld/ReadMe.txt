1. Download mySql server and Workbench : choose appropriate version
link:- https://dev.mysql.com/downloads/installer/

2. Create following Data base :
command:- create database Readers_World

3. use created database, to create a table
command:- 

4. create table
command:- create table Collection(book_id int(15) primary key auto_increment, book_name varchar(200) not null,
					author_name varchar(100), book_is_with varchar(200), user_phone varchar(20),
					book_owner varchar(200), owner_phone varchar(20));


5. Configure the ConnectionProvider class with your username and password to make use of the Application

