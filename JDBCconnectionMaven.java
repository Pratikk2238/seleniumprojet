package Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCconnectionMaven {

	public static void main(String[] args) throws SQLException {
		
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "12345678");
		
		Statement stmt=con.createStatement();
		
		String query="SELECT \"number\", first_name, last_name, gender, birth_date, employment_status, annual_salary, tax_file_no\r\n"
				+ "	FROM public.\"Empdata\"";
		
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next()) {
			
			System.out.println(rs.getString("first_name"));
			
			
		}
		
		
		
		
	}

}
