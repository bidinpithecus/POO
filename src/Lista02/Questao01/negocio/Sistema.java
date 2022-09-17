package Lista02.Questao01.negocio;

import Lista02.Questao01.dados.*;

import java.util.*;

public class Sistema {
	Map<String, List<Pessoa>> pessoas = new HashMap<>();
	String[] chaves = {"Crianças", "Adolescentes", "Jovens", "Adultos", "Idosos"};

	public Sistema() {
		for (String chave : chaves) {
			pessoas.put(chave, new ArrayList<>());
		}
	}

	public void adicionarPessoa(Pessoa pessoa) {
		int idade = pessoa.getIdade();
		List<Pessoa> list;
		if (idade < 1) {
			return;
		} else if (idade <= 12) {
			list = pessoas.get(chaves[0]);
		} else if (idade <= 18) {
			list = pessoas.get(chaves[1]);
		} else if (idade <= 25) {
			list = pessoas.get(chaves[2]);
		} else if (idade <= 59) {
			list = pessoas.get(chaves[3]);
		} else {
			list = pessoas.get(chaves[4]);
		}
		list.add(pessoa);
	}

	public void print() {
		pessoas.forEach((chave, list) -> {
			System.out.println(chave.toUpperCase() + ":");
			for (Pessoa pessoa : list) {
				System.out.println("\t" + pessoa);
			}
		});
	}

	public void ordenar() {
		for (String chave : chaves) {
			List<Pessoa> list = pessoas.get(chave);
			list.sort(Comparator.comparing(Pessoa::getNome));
			pessoas.put(chave, list);
		}
	}

}
