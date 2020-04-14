package com.Student.dao;

import com.Student.student.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDao {
    private final static String DRIVER="com.mysql.jdbc.Driver";
    private final static String URL="jdbc:mysql://localhost:3306/javaweb";
    private final static String USERNAME="root";
    private final static String PASSWORD="root";

    public int insertUser(Student student){
        String sql="insert into java(username,password)values(?,?)";
        PreparedStatement ps=null;
        Connection conn=null;
        int succeed=0;
        try{
            Class.forName(DRIVER);
            conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            ps=conn.prepareStatement(sql);
            ps.setString(1, student.getUsername());
            ps.setString(2, student.getPassword());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                ps.close();
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return succeed;
    }
}
