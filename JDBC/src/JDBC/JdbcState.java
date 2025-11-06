package JDBC;

import java.sql.*;

public class JdbcState {
	
	static final String url = "jdbc:mysql://localhost:3306/naveen";
	static final String username = "root";
	static final String password = "1234";
	Connection con = null;

	public static void main(String[] args) {
		
		try {
			String query = "select * from student";
			Connection con = DriverManager.getConnection(url,username,password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t| ");
				System.out.print(rs.getString(2)+"\t|");
				System.out.print(rs.getString(3)+"\t");
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
