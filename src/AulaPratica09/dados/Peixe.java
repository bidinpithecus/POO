package AulaPratica09.dados;

public class Peixe extends Animal {
	private float temperaturaIdeal;

	public float getTemperaturaIdeal() {
		return temperaturaIdeal;
	}

	public void setTemperaturaIdeal(float temperaturaIdeal) {
		this.temperaturaIdeal = temperaturaIdeal;
	}

	public float calculaEspacoOcupado() {
		return super.calculaEspacoOcupado() * altura;
	}

	public String toString() {
		return super.toString() + ", Temperatura ideal: " + this.temperaturaIdeal;
	}
}
