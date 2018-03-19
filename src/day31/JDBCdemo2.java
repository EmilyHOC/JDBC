package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
* Statement 接口的实现类,作用执行SQL语句,返回结果集
* 子接口PrepareStatement 作用:SQL预编译存储,多次高效地执行SQL
* */
public class JDBCdemo2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url="jdbc:oracle:thin:@127.0.0.1:1521:oracle";
        String username="emily",password="abc";

        Connection con= DriverManager.getConnection(url,username,password);

        //调用Connection 接口的方法PrepareStatement
    }
}
