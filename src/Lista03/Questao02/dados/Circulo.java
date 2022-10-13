package Lista03.Questao02.dados;

public class Circulo extends FormaGeometrica {
    public int calculaArea() {
        return (int) (Math.PI * Math.pow(medida1, 2));
    }

    public int calculaPerimetro() {
        return (int) (2 * Math.PI * medida1);
    }

    public void setRaio(int valor) {
        this.medida1 = this.medida2 = valor;
    }

    public String toString() {
        return "Raio: " + getMedida1() + ", " + super.toString();
    }
}
