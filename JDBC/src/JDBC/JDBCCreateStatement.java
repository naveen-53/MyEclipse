package JDBC;

/*
 * Class.forN6ame("com.mysql.cj.jdbc.Driver")
 * Connection conn = DriverManager.getConnection()
 * Statement st = conn.createStatement();
 * st.executeQuery
 * close the connection
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreateStatement {
	static final String DB_URL="jdbc:mysql://localhost:3306/db";
	static final String USER = "root";
	static final String PASS = "1234";
	static Connection conn1=null;
	
	public static void main(String[] args) {
		
		try {
			conn1 = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt = conn1.createStatement();
			String sql ="select * from employee";
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println("ID\tName\t\tDepartment");
			System.out.println("-------------------------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t\t");
				System.out.println(rs.getString(3));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
