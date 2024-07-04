package com.tnsif.daytwentytwo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully !!");
			System.out.println("-----------------------------------------------------------------");
			
			
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jn07","root","123@mysql#");
			System.out.println("Connection establish successfully !!");
			
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("SELECT *FROM student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));
			}
			System.out.println("-----------------------------------------------------------------");
			cn.close();
			System.out.println("Connection Close Successfully !!");
			System.out.println("-----------------------------------------------------------------");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
