package com.tap.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
	
	public static Connection requestConnection() throws ClassNotFoundException,SQLException{
		String url="jdbc:mysql://localhost:3306/tastyfoods";
		String username="root";
		String password="root";
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,username,password);
	
	return con;
	
}
}
