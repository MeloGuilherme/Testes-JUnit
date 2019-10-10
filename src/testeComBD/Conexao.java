/***********************************************************************
 * Programa: Testes utilizando JUnit
 * @authors: Guilherme Melo and Luiz Henrique
 * Data: 10/10/2019
 * Local: UNITINS
************************************************************************/

package testeComBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Classe para criar uma conexao com o BD (PostgreSQL)
public class Conexao {

	public static boolean criarCon() {
		
		// resposta
		boolean aux = false;
		
		Connection conn = null;

		try {
			// registrando o drive do prostgres
			Class.forName("org.postgresql.Driver");
			
			// estabelecendo uma conexao com o banco de dados
			// usuario == engenharia - senha == 123456
			// tabela == junit
			conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/junit", "engenharia", "123456");
			System.out.println("Conexao realizada com sucesso.");
			
			// resposta
			aux = true;
		}

		catch (SQLException e) {
			
			System.out.println("Falha ao conectar ao banco de dados.");
			e.printStackTrace();
			
			// resposta
			aux = false;

		}

		catch (ClassNotFoundException e) {
			
			System.out.println("Falha ao resgistrar o Driver do banco");
			e.printStackTrace();
			
			// resposta
			aux = false;
		}
		
		// resposta
		return aux;
	}

}
