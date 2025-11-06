package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCallableStatement {
	
	static final String DB_URL="jdbc:mysql://localhost:3306/db";
	static final String USER = "root";
	static final String PASS = "1234";
	static Connection conn1=null;
	
	public static void main(String[] args) {
		
		try {
			conn1 = DriverManager.getConnection(DB_URL,USER,PASS);
			CallableStatement cst = conn1.prepareCall("{call db.Insert_values(?,?,?)}");
			cst.setInt(1, 6);
			cst.setString(2, "John");
			cst.setString(3, "HR");
			cst.executeQuery();
			System.out.println("record inserted");
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
