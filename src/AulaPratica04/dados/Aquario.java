package AulaPratica04.dados;

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

	public Boolean adicionaAnimal(Animal animal) {
		if (espacoDisponivel() >= (animal.calculaEspacoOcupado() * 0.7)) {
			if (animal instanceof Peixe) {
				Peixe peixe = (Peixe) animal;

				if ((peixe.getTemperaturaIdeal() < (temperatura - 3)) || (peixe.getTemperaturaIdeal() > temperatura + 3)) {
					return false;
				}
			} else {
				return false;
			}
			animais.add(animal);
			return true;
		} else {
			return false;
		}
	}
}
