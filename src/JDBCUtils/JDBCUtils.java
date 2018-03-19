package JDBCUtils;

import java.sql.*;

public class JDBCUtils {
    private JDBCUtils(){}
    private  static Connection  con;

    static {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@127.0.0.1:1521:oracle";
            String username="emily";
            String password="abc";
            con= DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            throw new RuntimeException(e+"数据库连接失败");
        }
    }

    public static Connection getConnection(){
        return con;
    }
    public static void close(Connection con, Statement stat, ResultSet rs){
        if(rs!=null){
            try{
                rs.close();
            } catch (SQLException e) {

            }
        }
        if(stat!=null){
            try{
                rs.close();
            } catch (SQLException e) {

            }
        }
        if(con!=null){
            try{
                rs.close();
            } catch (SQLException e) {

            }
        }

    }
}
