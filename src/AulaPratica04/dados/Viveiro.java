package AulaPratica04.dados;

public class Viveiro {
	protected String nome;
	protected float comprimento;
	protected float largura;
	protected Animal[] animais;
	protected int numAnimais;

	public Viveiro(int maxAnimais) {
		this.animais = new Animal[maxAnimais];
		numAnimais = 0;
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

	public Animal[] getAnimais() {
		return animais;
	}

	public void setAnimais(Animal[] animais) {
		this.animais = animais;
	}

	public int getNumAnimais() {
		return numAnimais;
	}

	public void setNumAnimais(int numAnimais) {
		this.numAnimais = numAnimais;
	}

	public float calculaEspaco() {
		return comprimento * largura;
	}

	private float espacoOcupado() {
		float area = 0;

		for (int i = 0; i < numAnimais; i++) {
			area += animais[i].calculaEspeacoOcupado();
		}
		return area;
	}

	public float espacoDisponivel() {
		return calculaEspaco() - espacoOcupado();
	}

	public Boolean adicionarAnimal(Animal animal) {
		if (espacoDisponivel() >= animal.calculaEspeacoOcupado() * 0.7) {
			animais[numAnimais++] = animal;
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
		for (int i = 0; i < numAnimais; i++) {
			string.append(animais[i].toString()).append(", ");
		}
		return string.toString();
	}

}