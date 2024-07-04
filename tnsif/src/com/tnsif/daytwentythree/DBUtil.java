package com.tnsif.daytwentythree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection cn;
	public static Connection getcCn() throws ClassNotFoundException , SQLException	// Static method - is used when we want to make only one reference

	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully !!");
		System.out.println("-----------------------------------------------------------------");
		
		
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jn07","root","123@mysql#");
		System.out.println("Connection establish successfully !!");
		
		return cn;
	}
	
	public void closeConnection() throws SQLException {
		if(cn!= null)
			cn.close();
	}

}
