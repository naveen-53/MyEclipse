package BusResv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO {
	public void displayInfo() throws SQLException {
		String query = "select * from bus";
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Bus no: " +rs.getInt(1)+"\t");
			
			if(rs.getInt(2)==0)
				System.out.print("AC is not available.\t");
			else
				System.out.print("AC is available.\t");
			System.out.println("Capacity : " +rs.getInt(3));
				
		}
	
	}
	
	public int getCapacity(int id) throws SQLException {
		String query= "Select capacity from bus where id="+id;
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		
	}

}
