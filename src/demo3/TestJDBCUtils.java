package demo3;

import JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBCUtils {
    public static void main(String[] args) throws Exception {

        Connection con= JDBCUtils.getConnection();
        PreparedStatement pst=con.prepareStatement("select sname FROM sort");
        ResultSet rs=pst.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("sname"));
        }
        JDBCUtils.close(con,pst,rs);
    }
}
