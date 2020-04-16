package com.Student.dao;

import com.Student.student.Student;

import java.sql.*;

public class StudentDao {

    //注册功能
    public boolean studentRegister(Connection connection, Student student) {
        boolean flag = false;
        PreparedStatement ps = null;
        String sql = "INSERT INTO student(studentID,studentPassword)VALUES(?,?)";
        try {
            Statement statement = connection.createStatement();//获取操作数据库的对象

            ps = connection.prepareStatement(sql);
            ps.setString(1, student.getStudentID());
            ps.setString(2, student.getStudentPassword());
            if (ps.executeUpdate() > 0) {
                flag = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return flag;
        }
    }

    //登录功能
    public Student studentLogin(Connection connection, Student student) {
        Student resultStudent = null;
        String sql = "SELECT * FROM student WHERE studentID=? AND studentPassword=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getStudentID());
            ps.setString(2, student.getStudentPassword());
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                resultStudent = new Student();
                resultStudent.setStudentID(resultSet.getString("studentID"));
                resultStudent.setStudentPassword(resultSet.getString("studentPassword"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return resultStudent;
        }
    }
}
