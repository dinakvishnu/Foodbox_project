package com.db.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {
    public static Connection init() {
    	 Connection con = null;
		 try {
   		 Class.forName("com.mysql.jdbc.Driver");
   		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Food_Box","root","FLyhigh1!");
		 }
		 catch(ClassNotFoundException | SQLException e){
   		 e.printStackTrace();
   	     }   //catch
		 return con;
    }
}