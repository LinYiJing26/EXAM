package com.Student.service.impl;

import com.Student.student.Student;

import java.sql.Connection;

public interface StudentService {
    Student studentLoginService(Connection connection, Student student);
    Boolean studentRegisterService(Connection connection, Student student);
}
