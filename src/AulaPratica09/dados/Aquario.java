package AulaPratica09.dados;

public class Aquario extends Viveiro {
	private float altura;
	private float temperatura;

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float calculaEspaco() {
		return comprimento * largura * altura;
	}
}
