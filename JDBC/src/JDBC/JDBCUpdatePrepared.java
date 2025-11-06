package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUpdatePrepared {
	
	static final String DB_URL="jdbc:mysql://localhost:3306/db";
	static final String USER = "root";
	static final String PASS = "1234";
	static Connection conn1=null;
	
	public static void main(String[] args) {
		
		try {
			
			conn1 = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "UPDATE employee set department=? , emp_name=? where employee_Id=?";
			PreparedStatement pst = conn1.prepareStatement(sql);
			pst.setInt(1, 2);
			pst.setString(2, "Leon");
			pst.setString(3,"IT");
			pst.executeUpdate();
			
			String query = "select * from employee";
			ResultSet rs = pst.executeQuery(query);
		
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
