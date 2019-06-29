package br.com.liandro.javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	//java.sql = Connection, Statement, ResultSet
	//DriverManager
	public Connection getConexao() {
		String url = "jdbc:mysql://localhost:3306/agencia?useTimezone=true&serverTimezone=America/Sao_Paulo";
		String user = "root";
		String password = "";
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println(connection);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
