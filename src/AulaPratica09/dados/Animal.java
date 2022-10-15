package AulaPratica09.dados;

public class Animal {
	private String nome;
	private String cor;
	private String especie;
	private int idade;
	protected float largura;
	protected float comprimento;
	protected float altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calculaEspacoOcupado() {
		return comprimento * largura;
	}

	public String toString() {
		return "Nome: " + this.nome + ", Cor: " + this.cor + ", Especie: " + this.especie + ", Idade: " + this.idade;
	}

}
