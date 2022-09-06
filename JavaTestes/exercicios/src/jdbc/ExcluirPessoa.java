package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o codigo: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM PESSOAS WHERE CODIGO = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("PESSOA EXCLUIDA COM SUCESSO!");
		} else {
			System.out.println("NADA FEITO");
		}
		
		entrada.close();
		conexao.close();
	}

}
