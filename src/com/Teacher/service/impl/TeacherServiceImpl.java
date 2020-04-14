package com.Teacher.service.impl;

import com.Teacher.dao.TeacherDao;
import com.Teacher.teacher.Teacher;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public int insertUserService(Teacher teacher){
        TeacherDao teacherDao =new TeacherDao();
        return teacherDao.insertUser(teacher);
    }
}
