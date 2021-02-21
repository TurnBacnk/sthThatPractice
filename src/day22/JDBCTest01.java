
package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest01 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try {
            DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://192.168.2.219/LeetCodePrograming.Test01", "root", "wutawuai.12");
            System.out.println("数据库连接" + conn.toString());
            statement = conn.createStatement();
            String sql = "delete from dept where deptno = 60";
            int count = statement.executeUpdate(sql);
            System.out.println(count == 1 ? "successful" : "failure");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            try {
                if (conn != null) conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }
    }
}
