package com.Student.controller;

import com.Student.student.Student;
import com.Student.service.impl.StudentService;
import com.Student.service.impl.StudentServiceImpl;
//import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
//                loginController(request,response);
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

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        Student student = new Student();
        student.setUsername(username);
        student.setPassword(password);

        StudentService studentService =new StudentServiceImpl();
        int succeed= studentService.insertUserService(student);
        if (succeed>=1){
            try {
                response.getWriter().print("注册成功");
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }else {
            try {
                response.getWriter().print("注册失败");
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }
    }
}
