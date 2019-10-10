/***********************************************************************
 * Programa: Testes utilizando JUnit
 * @authors: Guilherme Melo and Luiz Henrique
 * Data: 10/10/2019
 * Local: UNITINS
************************************************************************/

package testeComBD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// Classe que testa a conexao
class TestadorDeConexao {

	@Test
	void testCriarCon() {
		
		//Retorna TRUE se a conexao funcionar
		assertEquals(true, Conexao.criarCon());
	}

}
