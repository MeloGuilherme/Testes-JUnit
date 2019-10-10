/***********************************************************************
 * Programa: Testes utilizando JUnit
 * @authors: Guilherme Melo and Luiz Henrique
 * Data: 10/10/2019
 * Local: UNITINS
************************************************************************/

package testesComListas;

import java.util.ArrayList;
import java.util.List;

// Classe que cria a lista e armazena nomes
public class Listas {

	private List<String> listaPessoas;
	
	// Cria e adiciona valores na lista
	public void getListaPessoas() {

		listaPessoas = new ArrayList<String>();
		listaPessoas.add("Maria");
		listaPessoas.add("Jose");
		listaPessoas.add("Guilherme");
		listaPessoas.add("Larissa");
		listaPessoas.add("Alex");
	}
	
	// Verifica se o nome existe na lista
	public boolean existeNome(String nome) {
		
		// Resposta
		boolean aux = false;
		getListaPessoas();

		for (int i = 0; i < listaPessoas.size(); i++) {

			if (listaPessoas.contains(nome.trim()))
				aux = true;

			else
				aux = false;
		}
		
		// Resposta
		return aux;
	}

}
