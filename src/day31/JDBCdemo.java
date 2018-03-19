package day31;

import java.sql.*;
import java.util.Properties;

/*jdbc操作数据库的步骤
*1.注册驱动
*       告诉JVM使用的是哪一个数据库的驱动
*2.获得链接
*       使用JDBC中的类.,完成对数据库的链接
* 3.获得语句执行平台
*       通过链接对象获取对SQL语句的执行者对象
* 4.执行sql语句
*       使用执行者对象那个,向数据库执行SQL语句
*       获取到数据库的执行就的结果集
* 5.处理结果
* 6.释放资源
*       close()
*
*
* */
public class JDBCdemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
        //使用java.sql.DriverManager类静态方法registerDriver(Driver driver)
        //Driver是一个接口,参数传递,数据库驱动的实现类
       // DriverManager.registerDriver(new Driver());//注册了两次
        //Class.forName("com.oracle.jdbc.Driver");
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //2.获得数据库连接 DriverManager类中的静态方法
        //static Connection getConnection(String url,String user,String password)
        //返回值是Connection接口的实现类,早数据库的驱动程序里面
        //url:数据库的链接地址:jdbc:oracle:连接地址:端口号:数据库名字
        //String url="jdbc:oracle://localhost:1521/oracle";

        String url="jdbc:oracle:thin:@127.0.0.1:1521:oracle";
        String username="emily",password="abc";

        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println(con);

        //3.通过数据库的连接对象获取SQL语句的执行者对象
        //con调用方法 Statement createStatement()获取Statement对象,将SQL语句发送到数据库
        Statement cs=con.createStatement();

        //4.执行者对象调用方法执行sql语句
        //int executeUpdate(String sql) 执行数据库中的sql语句 insert delete,update

         int row=cs.executeUpdate("insert into sort values(9,'汽车2',69000,'价格疯狂涨')");

         cs.close();
         con.close();



    }
}
