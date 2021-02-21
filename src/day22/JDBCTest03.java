package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JDBCTest03 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc1");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            statement = conn.createStatement();
            String sql = "update dept set dname = '销售部',loc = '天津' where deptno = 20";
            int count = statement.executeUpdate(sql);
            System.out.println(count == 1 ? "successful":"fail");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if(statement !=null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            }
        }
    }
}
