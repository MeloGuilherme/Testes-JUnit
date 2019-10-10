package testesComListas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	private List<String> listaPessoas;
	
	public static void main(String[] args) {
		
		Listas l = new Listas();
		System.out.println(l.existeNome("Cebola"));
	}

	public void getListaPessoas() {

		listaPessoas = new ArrayList<String>();
		listaPessoas.add("Maria");
		listaPessoas.add("Jose");
		listaPessoas.add("Guilherme");
		listaPessoas.add("Larissa");
		listaPessoas.add("Alex");
	}

	public boolean existeNome(String nome) {
		
		boolean aux = false;
		getListaPessoas();

		for (int i = 0; i < listaPessoas.size(); i++) {

			if (listaPessoas.contains(nome.trim()))
				aux = true;

			else
				aux = false;
		}
		
		return aux;
	}

}
