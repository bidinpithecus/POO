package Lista01.Questao04.apresentacao;

import Lista01.Questao04.dados.Pessoa;
import Lista01.Questao04.negocio.Sorteador;

public class Main {
	private static Sorteador sistema = new Sorteador();

	public static void main(String[] args) {
		sistema.cadastrarPessoa(new Pessoa("Maria", 20, 1.51F));
		sistema.cadastrarPessoa(new Pessoa("Clara", 25, 1.54F));
		sistema.cadastrarPessoa(new Pessoa("Marta", 29, 1.67F));
		sistema.cadastrarPessoa(new Pessoa("Mario", 18, 1.70F));
		sistema.cadastrarPessoa(new Pessoa("Tomás", 40, 1.89F));

		System.out.println("Todas as Pessoas:\n");
		for (int i = 0; i < sistema.getNumPessoas(); i++) {
			System.out.println(sistema.getPessoas()[i]);
		}

		System.out.println("\nSorteando pessoa a ser eliminada");
		System.out.println("Pessoa removida: " + sistema.sortearProximo());

		System.out.println("Sorteando próxima pessoa a ser eliminada");
		System.out.println("Pessoa removida: " + sistema.sortearProximo());

		System.out.println("\nLista após remoções:\n");
		for (int i = 0; i < sistema.getNumPessoas(); i++) {
			System.out.println(sistema.getPessoas()[i]);
		}
	}
}
