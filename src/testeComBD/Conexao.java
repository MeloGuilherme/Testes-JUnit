package testeComBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static boolean criarCon() {

		boolean aux = false;
		Connection conn = null;

		try {
			// registrando o drive do prostgres
			Class.forName("org.postgresql.Driver");
			// estabelecendo uma conexao com o banco de dados
			conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/junit", "engenharia", "123456");
			System.out.println("Conexao realizada com sucesso.");
			aux = true;

		}

		catch (SQLException e) {
			System.out.println("Falha ao conectar ao banco de dados.");
			e.printStackTrace();
			aux = false;

		}

		catch (ClassNotFoundException e) {
			System.out.println("Falha ao resgistrar o Driver do banco");
			e.printStackTrace();
			aux = false;
		}

		return aux;
	}

}
