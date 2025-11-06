package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCPreparedStatement {
	static final String DB_URL="jdbc:mysql://localhost:3306/db";
	static final String USER = "root";
	static final String PASS = "1234";
	static Connection conn1=null;
	
	public static void main(String[] args) {
		
		try {
			conn1 = DriverManager.getConnection(DB_URL,USER,PASS);
			String query ="insert into employee values(?,?,?)";
			PreparedStatement stmt = conn1.prepareStatement(query);
			
			stmt.setInt(1,5);
			stmt.setString(2,"Francis");
			stmt.setString(3,"Sales");
			int i= stmt.executeUpdate();
			System.out.println(i+" records inserted");
			
			
			
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
