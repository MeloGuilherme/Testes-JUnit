/***********************************************************************
 * Programa: Testes utilizando JUnit
 * @authors: Guilherme Melo and Luiz Henrique
 * Data: 10/10/2019
 * Local: UNITINS
************************************************************************/

package testesComListas;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

// Classe para testar se o nome digitado existe na lista
class TestadorListas {

	@Test
	void testExisteNome() {
		
		Listas l = new Listas();
		
		// Entrada do nome
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		
		assertTrue(l.existeNome(nome));
	}

}
