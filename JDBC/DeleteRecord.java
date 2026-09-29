package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {
    public static void main(String[] args) {
        try{
            Connection con=ConnectionJDBC.getConnection();
            Statement stmt=con.createStatement();
            String sql="Delete from user where id=8";
            int row=stmt.executeUpdate(sql);
            System.out.println("Delete "+row+" rows");
            stmt.close();
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
/*
For compile
javac -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC/ConnectionJdbc.java JDBC/DeleteRecord.java
For execute
java -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC.DeleteRecord       
*/
