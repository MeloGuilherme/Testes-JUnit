package testesComListas;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class TestadorListas {

	@Test
	void testExisteNome() {
		
		Listas l = new Listas();
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		assertTrue(l.existeNome(nome));
	}

}
