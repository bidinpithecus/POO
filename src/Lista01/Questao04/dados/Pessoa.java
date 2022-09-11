package Lista01.Questao04.dados;

public class Pessoa {
	private String nome;
	private int idade;
	private float altura;

	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Nome: " + this.nome + ", Idade: " + this.idade + ", Altura: " + String.format("%.2f", this.altura);
	}
}
