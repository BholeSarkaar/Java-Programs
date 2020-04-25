import java.sql.*;
import java.io.*;
public class InetDemo {
   public static void main(String[] args)throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        Statement stmt=con.createStatement();
        //stmt.executeUpdate("create table empl(empid number(5),name varchar(9))");
	stmt.executeUpdate("insert into empl values(43,'rohit')");
	stmt.executeUpdate("insert into empl values(41,'tre')");
	stmt.executeUpdate("insert into empl values(44,'rtreter')");
	stmt.executeUpdate("insert into empl values(47,'rrtert')");
        System.out.println("Rollno   Name");
     ResultSet rs=stmt.executeQuery("Select * from empl");
     while(rs.next())
        {
               System.out.println(rs.getInt(1)+"   "+rs.getString(2));
         }
      con.close();
    }
}