package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:postgresql://localhost:5432/";
		final String usuario = "postgres";
		final String senha = "postgres";
		
		Connection conexao = 
				DriverManager.getConnection(url, usuario, senha);

		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE curso_java");
		
		System.out.println("Banco criado com sucesso");
		conexao.close();
		
	}
	
}
