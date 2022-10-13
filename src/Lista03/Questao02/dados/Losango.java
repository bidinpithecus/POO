package Lista03.Questao02.dados;

public class Losango extends FormaGeometrica {
    public int calculaArea() {
        return (int) (medida1 * medida2 / 2);
    }

    public int calculaPerimetro() {
        return (int) (4 * (Math.sqrt((Math.pow(medida1, 2) / 4) + (Math.pow(medida2, 2) / 4))));
    }

    public void setD(int valor) {
        this.medida1 = valor;
    }

    public void setd(int valor) {
        this.medida2 = valor;
    }

    public String toString() {
        return "Diagonal principal: " + medida1 + ", " + "Diagonal secunadária: " + medida2 + ", " + super.toString();
    }
}
