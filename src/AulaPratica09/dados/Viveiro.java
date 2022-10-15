package AulaPratica09.dados;

import AulaPratica09.exceptions.EspacoIndisponivelException;

import java.util.ArrayList;

public class Viveiro {
	protected float comprimento;
	protected float largura;
	protected ArrayList<Animal> animais;

	public Viveiro() {
		this.animais = new ArrayList<>();
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public void setLargura(float largura) {
		this.largura = largura;
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

	public void adicionarAnimal(Animal animal) throws EspacoIndisponivelException {
		if (espacoDisponivel() >= animal.calculaEspacoOcupado() * 0.7) {
			animais.add(animal);
		}
		throw new EspacoIndisponivelException();
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		if (this instanceof Aquario) {
			string.append("Aquario, ");
		} else {
			string.append("Viveiro, ");
		}
		if (this instanceof Aquario) {
			string.append("Peixes alocados: ");
		} else {
			string.append("Animais alocados: ");
		}
		for (Animal animal : this.animais) {
			string.append(animal.toString()).append(", ");
		}
		return string.toString();
	}

}
