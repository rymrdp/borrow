drop database if exists elib;

create database elib;

use elib;


-- create tables

create table admin(admin_id integer primary key auto_increment,admin_fn varchar(50), admin_ln varchar(50), admin_email varchar(255), admin_pw varchar(50) );

create table librarian(lib_id integer primary key auto_increment,lib_fn varchar(50), lib_ln varchar(50), lib_num varchar(15), lib_email varchar(255), lib_pw varchar(50) );

create table books(callno varchar(400) primary key, book_name varchar(4000), book_author varchar(400), book_qty integer, issued_qty integer);
            
create table issued(callno varchar(400), student_id varchar(20), student_name varchar(100), student_phone varchar(15), student_email varchar(255), issue_date DATE, return_status varchar(10));
                   
-- inserting data to tables
insert into admin values(1,'admin','admin','admin@borrowlib.com','admin123');
