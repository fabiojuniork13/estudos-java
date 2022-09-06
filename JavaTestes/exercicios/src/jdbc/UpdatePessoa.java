package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdatePessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o id do usuário:");
		int id = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM PESSOAS WHERE CODIGO = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nomePessoa = resultado.getString("nome");
			
			pessoas.add(new Pessoa(codigo, nomePessoa));
			
		}
		
		pessoas.forEach(p -> System.out.println(
				"PESSOA ENCONTRADA: " + p.getCodigo() + " ==> " + p.getNome()));
		
		entrada.nextLine();
		
		System.out.println("Informe o novo nome:");
		String nome = entrada.nextLine();
		
		sql = "UPDATE PESSOAS SET NOME = ? WHERE CODIGO = ?";
		stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setInt(2, id);
		
		stmt.execute();
		
		System.out.println("Nome alterado com sucesso");
		
		stmt.close();
		conexao.close();
		entrada.close();
		
	}
	
}
