package com.Teacher.controller;

import com.Teacher.service.impl.TeacherService;
import com.Teacher.service.impl.TeacherServiceImpl;
import com.Teacher.teacher.Teacher;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

public class TeacherController extends HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response){
        String  flag=request.getParameter("flag");
        switch (flag){
            case "register":{
                try{
                    registerController(request,response);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }break;
            case "login":{
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
        Teacher teacher = new Teacher();
        teacher.setUsername(username);
        teacher.setPassword(password);

        TeacherService teacherService =new TeacherServiceImpl();
        int succeed= teacherService.insertUserService(teacher);
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
