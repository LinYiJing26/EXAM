package net.jdbc.test;

import java.math.BigDecimal;
import java.sql.*;

public class JDBC {
    //数据库url、用户名和密码
    //static final String DB_URL = "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    //https://www.cnblogs.com/yongdongma/p/9911393.html
    private String DB_URL = "jdbc:mysql://localhost:3306/exam?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    private String USER = "root";
    private String PASS = "root";
    private String jdbcName = "com.mysql.cj.jdbc.Driver";

    /**
     * 获取数据库连接
     * @return
     * @throws Exception
     */
    public Connection getCon() throws Exception {
            //1.注册JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取数据库连接
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            //3.操作数据库
            //Statement statement = connection.createStatement();//获取操作数据库的对象

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

            /*

            String sql="select * from bookinfo";
            ResultSet resultSet = statement.executeQuery(sql);//执行sql，获取结果集

            while(resultSet.next()){ //遍历结果集，取出数据
                int book_id = resultSet.getInt("book_id");
                String book_name = resultSet.getString("book_name");
                BigDecimal price = resultSet.getBigDecimal("price");
                Date public_date = resultSet.getDate("public_date");
                String store = resultSet.getString("store");
                //输出数据
                System.out.print("图书编号："+book_id);
                System.out.print("，图书名称："+book_name);
                System.out.print("，价格"+price);
                System.out.print("，出版日期"+public_date);
                System.out.print(",库存"+store);
                System.out.println();
            }

            */
        return connection;
    }

    /**
     * 关闭数据库连接
     * @param connection
     * @throws Exception
     */
    public void closeCon(Connection connection)throws Exception{
        if (connection!=null)
            connection.close();
    }

}
