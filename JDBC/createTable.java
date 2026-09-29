package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
public class createTable {
    public static void main(String[] args) {
        try{
            Connection con=ConnectionJDBC.getConnection();
            Statement stmt=con.createStatement();
            String sql="Create table if not exists user(id int auto_increment primary key,name varchar(25), email varchar(50) unique)";
            stmt.executeUpdate(sql);
            System.out.println("Table created Succesfully");
            stmt.close();
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
/*Compile
javac -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC/ConnectionJDBC.java JDBC/createTable.java
Run
java -cp ".;JDBC/lib/mysql-connector-j-9.7.0.jar" JDBC.createTable
 */
