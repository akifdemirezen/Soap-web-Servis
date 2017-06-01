/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataConnection {

    
    public static Connection getConnection() throws ClassNotFoundException{
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql://localhost/musteri", "postgres", "123fb654");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
    
    
}
