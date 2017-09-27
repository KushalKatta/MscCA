/*
 * Author: Kushal Katta
 */

import java.sql.*;

public class Display {
	
	public static void main(String[] args)
	{
		Connection cn;
		ResultSet rs;
		Statement st;
		try
		{
			
			//Load the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Establish the Connection
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			st = cn.createStatement();
			String query = "select * from employees";
			rs=st.executeQuery(query);
			
			while(rs.next())
			{
				String firstName = rs.getString("First_Name");
				System.out.println("First Name: " + firstName);
				
				String lastName = rs.getString("Last_Name");
				System.out.println("Last Name: " + lastName);
				
				String salary = rs.getString("Salary");
				System.out.println("Salary: " + salary);
			}
			
			rs.close();
			st.close();
			cn.close();
		}
		catch(ClassNotFoundException ex)
		{
//			System.out.println();
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			
		}
	}
}
