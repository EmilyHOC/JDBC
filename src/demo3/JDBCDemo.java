package demo3;

import JDBCUtils.JDBCUtils;
import domain.Sort;

import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        Connection con= JDBCUtils.getConnection();
        PreparedStatement pst=con.prepareStatement("select * FROM sort");
        ResultSet rs=pst.executeQuery();

        //创建一个集合对象
        List<Sort> list=new ArrayList<Sort>();

        //对结果进行处理
        while (rs.next()){
            Sort s=new Sort(rs.getInt("sid"),rs.getString("sname"),rs.getInt("sprice"),rs.getString("sdesc"));
            //封装Sort对象,存储在集合中
            list.add(s);
        }
        //list集合
        for(Sort s:list){
            System.out.println(s);
        }
        JDBCUtils.close(con,pst,rs);
    }
}
