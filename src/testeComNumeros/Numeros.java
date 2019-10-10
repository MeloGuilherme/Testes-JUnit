/***********************************************************************
 * Programa: Testes utilizando JUnit
 * @authors: Guilherme Melo and Luiz Henrique
 * Data: 10/10/2019
 * Local: UNITINS
************************************************************************/

package testeComNumeros;

// Classe que controla os metodos para numeros par/impar
public class Numeros {
	
	// Metodo para verificar se o numero é par
	public boolean testaPar(int num) {
		
		return (num % 2 == 0);
	}
	
	// Metodo para verificar se o numero é impar
	public boolean testaImpar(int num) {
		
		return (num % 2 == 1);
	}

}
