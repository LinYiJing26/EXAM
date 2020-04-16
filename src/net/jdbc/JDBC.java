package net.jdbc;

import java.math.BigDecimal;
import java.sql.*;

public class JDBC {
    //数据库url、用户名和密码
    //static final String DB_URL = "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    //https://www.cnblogs.com/yongdongma/p/9911393.html

    static final String DB_URL = "jdbc:mysql://localhost:3306/EXAM?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    static final String USER = "root";
    static final String PASS = "root";
    static final String jdbcName = "com.mysql.cj.jdbc.Driver";
    /**
     * 获取数据库连接
     *
     * @return
     * @throws Exception
     */
    public Connection getCon() throws Exception {

        //1.注册JDBC驱动
        Class.forName(jdbcName);
        //2.获取数据库连接
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);

        return connection;
    }

    /**
     * 关闭数据库连接
     *
     * @param connection
     * @throws Exception
     */
    public void closeCon(Connection connection) throws Exception {
        if (connection != null)
            connection.close();
    }

    /**
     * test
     */
    public static void main(String[] args){
        try {
            JDBC jdbc = new JDBC();
            Connection connection = jdbc.getCon();
            //PreparedStatement ps = null;

            //3.操作数据库
            Statement statement = connection.createStatement();//获取操作数据库的对象
                    /*
https://blog.csdn.net/hju22/article/details/87364956?utm_source=app

-- 创建数据库
create database book;
use book;

-- 创建图书信息表
create table bookinfo(
book_id int primary key auto_increment,
book_name varchar(20) not null,
price float(6,2) not null,
public_date date not null,
store int not null
);

-- 插入图书数据
insert into bookinfo(book_name,price,public_date,store) values('Android权威指南',58.8,'2016-02-01',3);
insert into bookinfo(book_name,price,public_date,store) values('linux私房菜',76.5,'2015-09-21',10);
insert into bookinfo(book_name,price,public_date,store) values('Java编程思想',110,'2008-05-30',12);
insert into bookinfo(book_name,price,public_date,store) values('JavaScript DOM 编程艺术',49.0,'2016-02-01',4);
insert into bookinfo(book_name,price,public_date,store) values('英语常用口语100句',28,'2002-04-25',6);

                    */
            String sql = "select * from student";
            ResultSet resultSet = statement.executeQuery(sql);//执行sql，获取结果集

            while (resultSet.next()) { //遍历结果集，取出数据
                String studentID = resultSet.getString("studentID");
                String studentName = resultSet.getString("studentName");
                BigDecimal Sex = resultSet.getBigDecimal("Sex");
                String CardID = resultSet.getString("CardID");
                String studentPassword = resultSet.getString("studentPassword");
                //输出数据
                System.out.print("学号：" + studentID);
                System.out.print("，姓名：" + studentName);
                System.out.print("，性别" + Sex);
                System.out.print("，身份证号" + CardID);
                System.out.print(",密码" + studentPassword);
                System.out.println();
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
