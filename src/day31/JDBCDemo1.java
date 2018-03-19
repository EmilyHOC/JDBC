package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args)  throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url="jdbc:oracle:thin:@127.0.0.1:1521:oracle";
        String username="emily",password="abc";

        Connection con= DriverManager.getConnection(url,username,password);

        Statement st=con.createStatement();
        //拼写查询的sql语句
        String sql="select *from sort";

        //ResultSet executeQuery执行SQL语句中的查询
        ResultSet rs=st.executeQuery(sql);

        //对结果集进行处理
        //ResultSet接口方法boolean next()返回true,有结果集,返回false没有结果集
        while(rs.next()){
            System.out.println((rs.getInt("sid")+rs.getString("sname")+rs.getInt("sprice")+rs.getString("sdesc")));
        }

        //关闭资源
        con.close();
        rs.close();
        st.close();


    }
}
