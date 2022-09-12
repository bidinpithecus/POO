package AulaPratica04.dados;

import java.util.ArrayList;

public class Viveiro {
	protected String nome;
	protected float comprimento;
	protected float largura;
	protected ArrayList<Animal> animais;

	public Viveiro() {
		this.animais = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public float calculaEspaco() {
		return comprimento * largura;
	}

	private float espacoOcupado() {
		float area = 0;

		for (Animal animal : this.animais) {
			area += animal.calculaEspacoOcupado();
		}
		return area;
	}

	public float espacoDisponivel() {
		return calculaEspaco() - espacoOcupado();
	}

	public Boolean adicionarAnimal(Animal animal) {
		if (espacoDisponivel() >= animal.calculaEspacoOcupado() * 0.7) {
			animais.add(animal);
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		if (this instanceof Aquario) {
			string.append("Aquario: ");
		} else {
			string.append("Viveiro: ");
		}
		string.append(nome).append(", ");
		if (this instanceof Aquario) {
			string.append(". Peixes alocados: ");
		} else {
			string.append(". Animais alocados: ");
		}
		for (Animal animal : this.animais) {
			string.append(animal.toString()).append(", ");
		}
		return string.toString();
	}

}