package Lista01.Questao03.dados;

public class Imovel {
	private double largura;
	private double comprimento;
	private double preco;
	private double area;

	public Imovel(double largura, double comprimento, double preco) {
		this.largura = largura;
		this.comprimento = comprimento;
		this.preco = preco;
		calcularArea();
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getArea() {
		return area;
	}

	public void calcularArea() {
		this.area = this.largura * this.comprimento;
	}

	public String toString() {
		return "Comprimento: " + this.comprimento + ", Largura: " + this.largura + ", Área: " + this.area + ", Preço: R$" + String.format("%.2f", this.preco);
	}
}
