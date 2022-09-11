package Lista01.Questao03.negocio;

import Lista01.Questao03.dados.Imovel;

import java.util.Arrays;

public class Imobiliaria {

	private String nome;
	private Imovel[] imoveis = new Imovel[50];
	private int numImoveis = 0;

	public Imobiliaria(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Imovel[] getImoveis() {
		return imoveis;
	}

	public void setImoveis(Imovel[] imoveis) {
		this.imoveis = imoveis;
	}

	public int getNumImoveis() {
		return numImoveis;
	}

	public void setNumImoveis(int numImoveis) {
		this.numImoveis = numImoveis;
	}

	public void cadastrarImovel(Imovel imovel) {
		this.imoveis[numImoveis++] = imovel;
	}

	public Imovel[] filtrarPorArea(float x) {
		Imovel[] imoveis = new Imovel[numImoveis];
		int temp = 0;

		for (int i = 0; i < numImoveis; i++) {
			if (this.imoveis[i].getArea() >= x) {
				imoveis[temp++] = this.imoveis[i];
			}
		}
		return Arrays.copyOf(imoveis, temp);
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < numImoveis; i++) {
			string.append(imoveis[i].toString()).append('\n');
		}
		return string.toString();
	}

}
