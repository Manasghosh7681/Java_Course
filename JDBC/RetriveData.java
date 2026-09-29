package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
    public static void main(String[] args) {
        try{
            Connection con=ConnectionJDBC.getConnection();
            Statement stmt=con.createStatement();
            String sql="Select * from user";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("id")+rs.getString("name")+rs.getString("email"));;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
/*
Compile
javac -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC/ConnectionJDBC.java JDBC/RetriveData.java
Run
java -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC.RetriveData */
