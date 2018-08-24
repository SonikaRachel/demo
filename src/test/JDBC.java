package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

	public void insert(String name, String age, String gender, String email, String mobile, String userid,
			String password) {
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sonoo","root","root");  
			 
			PreparedStatement ps=con.prepareStatement("insert into demo(name,age,gender,email,mobile,userid,password)"+"  values(?,?,?,?,?,?,?)"); 
			
			
			
			
		ps.execute();  
				
			ps.setString(1, name);
			ps.setString(2, age);
			ps.setString(3, gender);
			ps.setString(4, email);
			ps.setString(5, mobile);
			ps.setString(6, userid);
			ps.setString(7, password);
			//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			
		}catch (Exception e)
		
		
		{e.printStackTrace();}	
	}
	
}
