package JDBC_package;

import java.sql.*;
import java.util.Scanner;

public class jdbcDemo {
	
	public static final String url="jdbc:mysql://localhost:3306/jdbcdemo";
	public static final String userName = "root";
	public static final String password = "1234";

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int userop=1;
		while(userop==1) {
			System.out.println("Enter 1 to process and O to Exit...");
			userop = sc.nextInt();
			
			if(userop==1) {
				
				System.out.println("------------------------------------------------- ");
				System.out.print("1. Print the Data\t");
				System.out.println("2. Update the Data ");
				System.out.print("3. Delete the Data\t");
				System.out.println("4. Store Procedure of the Data ");
				System.out.print("5. Commit the Data\t");
				System.out.println("6. Batch Process of the Data ");
				System.out.println("7. RollBack the Data ");
				System.out.println("------------------------------------------------- ");
				
				
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();
				
				switch(choice) {
				
				case 1:
					readData();
					break;
				case 2:
					updateData();
					break;
				case 3:
					deleteData();
					break;
				case 4:
					storeProcedure2();
					break;
				case 5:
					commit();
					break;
				case 6:
					batchProcess();
					break;
				case 7:
					rollBack();
					break;
				default:
					System.out.println("Invalid Data");
					break;
				}
			}
		}
		sc.close();
	}
	
	public static void readData() throws Exception{
		
		String query = "select * from employee";

		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		System.out.println("Emp_id ----  name ----  post ----  salary ");
		System.out.println("------------------------------------ ");
		System.out.println();

		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+"----" + rs.getString(2)+"----"+ rs.getString(3)+"----"+ rs.getInt(4));
			System.out.println();
			
		}

		con.close();
	}
	public static void prepsta() throws Exception{
		
		int id=6;
		String name="Durai";
		String job= "collector";
		int salary= 600000;
		
		String query = "select * from employee";

		Connection con= DriverManager.getConnection(url,userName,password);
		PreparedStatement pst =con.prepareStatement(query);
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(2, job);
		pst.setInt(1, salary);
		
		
		con.close();
	}
	public static void deleteData() throws Exception{
		
		String query = "delete from employee where emp_id=6";

		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("rows affected: "+rows);

		con.close();
	}
	public static void updateData() throws Exception{
		
		String query = "update employee set salary=400000 where emp_id=5";

		Connection con= DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("rows affected: "+rows);

		con.close();
	}
	public static void storeProcedure() throws Exception{
		
		
		Connection con= DriverManager.getConnection(url,userName,password);
		CallableStatement cst = con.prepareCall("{call GetEmp()}");
		ResultSet rs = cst.executeQuery();
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+"----" + rs.getString(2)+"----"+ rs.getString(3)+"----"+ rs.getInt(4));
			System.out.println();
		}

		con.close();
	}
	public static void storeProcedure2() throws Exception{
		
		int id = 1;
		Connection con= DriverManager.getConnection(url,userName,password);
		CallableStatement cst = con.prepareCall("{call GetNameById(?,?)}");
		cst.setInt(1, id);
		cst.registerOutParameter(2, Types.VARCHAR);
		
		cst.execute();
		System.out.println(cst.getString(2));

		con.close();
	}
	public static void commit() throws Exception{
		
		String query1 ="update employee set salary=7000000 where emp_id=1";
		String query2 ="update employee set salary=5000000 where emp_id=2";
		Connection con = DriverManager.getConnection(url,userName,password);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		int rows1 = st.executeUpdate(query1);
		System.out.println("Rows Affected : "+rows1);
		int rows2 = st.executeUpdate(query2);
		System.out.println("Rows Affected : "+rows2);
		
		if(rows1>0 && rows2>0) {
			con.commit();
		}
		
		con.close();
		
	}
	public static void batchProcess() throws Exception{
		String query1 ="update employee set salary=1000000 where emp_id=1";
		String query2 ="update employee set salary=1000000 where emp_id=2";
		String query3 ="update employee set salary=1000000 where emp_id=3";
		String query4 ="update employee set salary=1000000 where emp_id=4";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		
		int[] res = st.executeBatch();
		for(int i : res) {
			System.out.println("Rows Affected: "+i);
		}
		
		
	}
	public static void rollBack() throws Exception{
		String query1 ="update employee set salary=8000000 where emp_id=1";
		String query2 ="update employee set salary=7000000 where emp_id=2";
		String query3 ="update employee set salary=6000000 where emp_id=3";
		String query4 ="update employee set salary=5000000 where emp_id=4";
		
		Connection con = DriverManager.getConnection(url,userName,password);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		
		int[] res = st.executeBatch();
		for(int i : res) {
			if(i>0)
				continue;
			else
				con.rollback();
			
		}
		con.commit();
		
		
	}
	
}