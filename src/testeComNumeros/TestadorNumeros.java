package testeComNumeros;

import static org.junit.Assert.assertEquals;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class TestadorNumeros {
	
	private Numeros num = new Numeros();

	@Test
	public void testTestaPar() {
		
		String in = JOptionPane.showInputDialog("(Teste PAR) -> Digite o numero: ");
		int n = Integer.parseInt(in);
		assertEquals(true, num.testaPar(n));

	}

	@Test
	public void testTestaImpar() {
		
		String in = JOptionPane.showInputDialog("(Teste IMPAR) -> Digite o numero: ");
		int n = Integer.parseInt(in);
		assertEquals(true, num.testaImpar(n));
	}

}
