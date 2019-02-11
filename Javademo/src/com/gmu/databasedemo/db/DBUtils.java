package com.gmu.databasedemo.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtils {

	public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatement ps =  null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String pass = "root";
        
        Connection con = DriverManager.getConnection(url, user, pass);
        ps = con.prepareStatement(sql);
        
        return ps;
    }
	
}
