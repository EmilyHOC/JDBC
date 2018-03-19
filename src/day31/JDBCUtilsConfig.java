package day31;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*便携JDBC工具类,获取数据库的连接
*采取读取配置文件的方式
* 读取配置文件,获取连接,执行一次,static{}
* */
public class JDBCUtilsConfig  {
   private static Connection con;
   private static String driverClass;
   private static String username;
   private static String password;

   static {
       InputStream in=JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
       Properties pro=new Properties();
       try {
           readConfig();
           pro.load(in);
           String driverClass=pro.getProperty("driverClass");
           String url=pro.getProperty("url");
           String username=pro.getProperty("username");
           String password=pro.getProperty("password");
           Class.forName(driverClass);
           con= DriverManager.getConnection(url,username,password);
       } catch (Exception e) {
          throw new RuntimeException("数据库连接失败");
       }

   }
   private static void readConfig() throws Exception{
       InputStream in=JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
       Properties pro=new Properties();
       pro.load(in);
       String driverClass=pro.getProperty("driverClass");
       String url=pro.getProperty("url");
       String username=pro.getProperty("username");
       String password=pro.getProperty("password");
   }
   public static Connection getConnection(){
       return con;
   }
}
