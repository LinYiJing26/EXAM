# EXAM

### 登录 （陈 LinYiJing26、秦 resposiii）
1.教师和学生 登录/改密/注册
2.管理员 登录/改密 （主）

### 学生 （傅 josartfu17）
1.个人信息管理 （主）
**2.考试**
3.查询成绩

### 教师 （孙 SheldorKop）
1.个人信息管理 （主）
2.试卷管理
3.查询成绩

### 管理员 （许 Darrenreally）
1.信息管理 （主）
2.试卷管理
3.查询成绩

#### 工具
1.GitHub Desktop https://desktop.github.com/
2.IntelliJ IDEA 2020.1 x64 https://www.jetbrains.com/idea/download/
3.MySQL 5.7 https://www.mysql.com/
4.MySQL Workbench https://dev.mysql.com/downloads/workbench/
5.apache Tomcat 9.0.20 http://tomcat.apache.org/

#### 数据库
CREATE DATABASE EXAM;
USE EXAM;
CREATE TABLE Student
(studentID varchar(50) not null,studentName varchar(50) not null,Sex int not null,CardID varchar(50) not null,SUsername varchar(50) not null,SPassword varchar(50) not null);
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

---
ccc
---
qqq
---
fff
---
yabaiyabaiyabai
---
xxx