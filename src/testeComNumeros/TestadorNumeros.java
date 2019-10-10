/***********************************************************************
 * Programa: Testes utilizando JUnit
 * @authors: Guilherme Melo and Luiz Henrique
 * Data: 10/10/2019
 * Local: UNITINS
************************************************************************/

package testeComNumeros;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

// Classe para testar se o numero corresponde ao tipo definido (Par/Impar)
class TestadorNumeros {
	
	private Numeros num = new Numeros();

	@Test
	public void testTestaPar() {
		
		// Entrda do numero
		String in = JOptionPane.showInputDialog("(Teste PAR) -> Digite o numero: ");
		
		// Converte para int
		int n = Integer.parseInt(in);
		
		assertEquals(true, num.testaPar(n));

	}

	@Test
	public void testTestaImpar() {
		
		// Entrada do numero
		String in = JOptionPane.showInputDialog("(Teste IMPAR) -> Digite o numero: ");
		
		// Converte para int
		int n = Integer.parseInt(in);
		
		assertEquals(true, num.testaImpar(n));
	}

}
