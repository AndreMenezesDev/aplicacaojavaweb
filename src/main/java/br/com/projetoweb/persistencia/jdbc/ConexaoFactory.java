package br.com.projetoweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {	
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/fabricaweb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","rootfabrica","rootfabrica");
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
	}

}
