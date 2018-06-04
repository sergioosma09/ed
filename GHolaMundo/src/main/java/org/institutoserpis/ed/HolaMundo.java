package org.institutoserpis.ed;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class HolaMundo {

	public static void main(String[] args)  throws SQLException, ClassNotFoundException{
		Class.forName("org.sqlite.JDBC");
		java.sql.Connection connection=DriverManager.getConnection("jdbc:sqlite:sample.db");
		
		connection.close();
		System.out.println("Hola Mundo desde eclipse desde gradle");
	}

}
