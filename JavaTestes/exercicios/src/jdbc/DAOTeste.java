package jdbc;

public class DAOTeste {

	public static void main(String[] args) {

		DAO dao = new DAO();
		
		String sql = "INSERT INTO PESSOAS (NOME, CODIGO) VALUES (?, ?)";
		System.out.println(dao.incluir(sql, "Ana Richman", 1000));
		
		dao.close();
		
	}

}
