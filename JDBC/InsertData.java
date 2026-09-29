package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
public class InsertData {
    public static void main(String[] args) {
        try{
            Connection con=ConnectionJDBC.getConnection();
            Statement stmt=con.createStatement();
            String sql="Insert into user(name,email) values('Sangita ghosh','sangi@gmail.com'),('Ravindra nayak','ravi@gmail.com')";
            int row=stmt.executeUpdate(sql);
            System.out.println("Total record insert"+ row);
            stmt.close();
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
/*
Compile
javac -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC/ConnectionJDBC.java JDBC/InsertData.java
Run
java -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC.InsertData
 */

