package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static Connection getConnection () throws SQLException{
        String url="jdbc:mysql://localhost:3306/bbsrcsm";
        Connection con =DriverManager.getConnection(url,"root","");
        System.out.println("Connection Succesfully");
        return con;
    }
}
