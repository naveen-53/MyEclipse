package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
	static final String DB_URL="jdbc:mysql://localhost:3306/db";
	static final String USER = "root";
	static final String PASS = "1234";
	static Connection conn1=null;
	static final String query = "select * from employee";
	
	public static void main(String[] args) {
		
		try {
			
			conn1 = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt = conn1.createStatement();
			String sql = "UPDATE employee set department='HR' where employee_Id in (1,2)";
			stmt.executeUpdate(sql);
			ResultSet rs =stmt.executeQuery(query);
			System.out.println("ID\tName\t\tDepartment");
			System.out.println("-------------------------------------------------");
			
			while(rs.next()) {
				System.out.print(rs.getInt("Employee_Id")+"\t");
				System.out.print(rs.getString("emp_name")+"\t\t");
				System.out.println(rs.getString("department"));
			}	
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
