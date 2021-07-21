package demo;
import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        //使用JDBC 链接数据库步骤
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            //1、加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取链接
            conn = DriverManager.getConnection("jdbc:mysql://localhost/java3","root","Hjj1010.");
            //3、编写sql语句
            String sql= "select * from emp";
            //4、获取执行对象
            pstm = conn.prepareStatement(sql);
            //5、执行sql语句
            rs = pstm.executeQuery();
            //6、处理结果集
            while (rs.next()){
                System.out.println(rs.getString("ename"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                rs.close();
                pstm.close();
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
