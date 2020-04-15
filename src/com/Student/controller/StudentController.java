package com.Student.controller;

import com.Student.student.Student;
import com.Student.dao.StudentDao;
import com.Student.service.impl.StudentService;
import com.Student.service.impl.StudentServiceImpl;
import net.jdbc.test.JDBC;
//import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;

public class StudentController extends HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response){
        String flag=request.getParameter("flag");
        switch (flag){
            case "studentRegister":{
                try{
                    registerController(request,response);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }break;
            case "studentLogin":{
                try{
                    LoginController(request,response);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }break;
        }
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
        doPost(request,response);
    }

    private void registerController(HttpServletRequest request,HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        String studentID=request.getParameter("studentRegisterID");
        String studentPassword=request.getParameter("studentRegisterPassword");

        JDBC jdbc = new JDBC();
        Student student = new Student();
        student.setStudentID(studentID);
        student.setStudentPassword(studentPassword);
        StudentDao studentdao = new StudentDao();

        try{
            Connection connection=jdbc.getCon();

            if(studentdao.studentRegister(connection,student)==true){
                response.sendRedirect("StudentWeb/studentLogin.jsp");
                System.out.println("Register success");
            }else{
                response.sendRedirect("http://localhost:8080/JavaWeb_war_exploded/StudentWeb/studentLogin.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void LoginController(HttpServletRequest request,HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        String studentID=request.getParameter("studentRegisterID");
        String studentPassword=request.getParameter("studentRegisterPassword");

        JDBC jdbc = new JDBC();
        Student student = new Student();
        student.setStudentID(studentID);
        student.setStudentPassword(studentPassword);
        StudentDao studentdao = new StudentDao();

        try{
            Connection connection=jdbc.getCon();

            if(studentdao.studentLogin(connection,student)==student){
                response.sendRedirect("student.jsp");
                System.out.println("Login success");
            }else{
                response.sendRedirect("http://localhost:8080/JavaWeb_war_exploded/StudentWeb/studentLogin.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
