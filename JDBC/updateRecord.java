package JDBC;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class updateRecord {
    public static void main(String[] args) {
        try{
            Connection con=ConnectionJDBC.getConnection();
            Statement stmt=con.createStatement();
            String sql="update user set email='ravi123@gmail.com' where id=10";
            int row=stmt.executeUpdate(sql);
            System.out.println("Record update"+ row);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
/*
Compile
javac -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC/ConnectionJDBC.java JDBC/updateRecord.java
Run
java -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC.updateRecord
*/
