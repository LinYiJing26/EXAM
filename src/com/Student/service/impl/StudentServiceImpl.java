package com.Student.service.impl;

import com.Student.student.Student;
import com.Student.dao.StudentDao;

import java.sql.Connection;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student studentLoginService(Connection connection, Student student) {
        StudentDao studentDao = new StudentDao();
        return studentDao.studentLogin(connection,student);
    }
    @Override
    public Boolean studentRegisterService(Connection connection, Student student) {
        StudentDao studentDao = new StudentDao();
        return studentDao.studentRegister(connection,student);
    }
}
