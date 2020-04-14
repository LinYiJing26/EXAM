package com.Student.service.impl;

import com.Student.student.Student;
import com.Student.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
    @Override
    public int insertUserService(Student student){
        StudentDao studentDao =new StudentDao();
        return studentDao.insertUser(student);
    }
}
