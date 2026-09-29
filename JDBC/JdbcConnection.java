package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    public static void main(String[] args) {
        try{
            String url="jdbc:mysql://localhost:3306/bbsrcsm";
            String user="root";
            String password="";
            Connection con=DriverManager.getConnection(url,user,password);
            System.out.println("Connection Success");
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
/*
Compile
javac -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC/JdbcConnection.java
Run
java -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC.JdbcConnection */