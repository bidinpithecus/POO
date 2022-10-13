package Lista03.Questao02.dados;

public class TrianguloEquilatero extends FormaGeometrica {
    public int calculaArea() {
        return (int) (Math.pow(this.medida1, 2) * Math.sqrt(3) / 4);
    }

    public int calculaPerimetro() {
        return this.medida1 * 3;
    }

    public void setLado(int valor) {
        this.medida1 = this.medida2 = valor;
    }

    public String toString() {
        return "Lado: " + getMedida1() + ", " + super.toString();
    }
}
