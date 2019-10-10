package testeComBD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestadorDeConexao {

	@Test
	void testCriarCon() {
		
		//Retorna TRUE se a conexao funcionar
		assertEquals(true, Conexao.criarCon());
	}

}
