package demo3;

import day31.JDBCUtilsConfig;

import java.sql.Connection;

public class TestJDBCUtils2 {
    public static void main(String[] args) {
        Connection con= JDBCUtilsConfig.getConnection();
        System.out.println(con);
    }
}
