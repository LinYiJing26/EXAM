CREATE DATABASE EXAM;
USE EXAM;
CREATE TABLE Student
(studentID varchar(50) not null,studentName varchar(50) not null,Sex int not null,CardID varchar(50) not null,studentPassword varchar(50) not null);
CREATE TABLE Teacher
(teacharID int auto_increment primary key not null,teacherName varchar(50) not null,Sex int not null,Password varchar(50) not null);
CREATE TABLE Administrator
(ManagerID int auto_increment primary key not null,ManagerName varchar(50) not null,Password varchar(20) not null);
CREATE TABLE Questions
(Id int auto_increment primary key not null,Subject varchar(50) not null,Chart varchar(50) not null,Title varchar(50) not null,Type varchar(50) not null,Ans1 varchar(50) not null,Ans2 varchar(50) not null,Ans3 varchar(50) not null,Ans4 varchar(50) not null,Answer int not null,Public int not null);
CREATE TABLE Demand
(CardID varchar(50) not null,studentID int not null,studentName varchar(50) not null,ObjectlvesScore int not null,SubjectlvesScore int not null,TotalScore float not null);
CREATE TABLE Affiche
(ID int not null,Title varchar(50) not null);
