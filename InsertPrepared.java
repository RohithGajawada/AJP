package com.nt;
import java.sql.*;    
class InsertPrepared {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
            PreparedStatement stmt=con.prepareStatement("select * from emp values(?,?)");
            stmt.setInt(1, 102);
            stmt.setString(1, "Hello");

            int i=stmt.executeUpdate();
            System.out.println("Records inserted"+i);
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception is raised:"+e);
        }
    }
}
