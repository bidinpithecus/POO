package Lista01.Questao04.negocio;

import java.util.Random;
import Lista01.Questao04.dados.Pessoa;

public class Sorteador {
	private Random gerador = new Random();
	private Pessoa[] pessoas = new Pessoa[6];
	private int numPessoas = 0;

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public int getNumPessoas() {
		return numPessoas;
	}

	public void cadastrarPessoa(Pessoa pessoa) {
		pessoas[numPessoas++] = pessoa;
	}

	public void removerPessoa(int index) {
		for (int i = index; i < numPessoas - 1; i++) {
			pessoas[i] = pessoas[i + 1];
		}
		pessoas[numPessoas--] = null;
	}

	public Pessoa sortearProximo() {
		int randomIndex = gerador.nextInt(numPessoas);
		Pessoa pessoa = pessoas[randomIndex];
		removerPessoa(randomIndex);
		return pessoa;
	}
}
