package Lista03.Questao02.dados;

public abstract class FormaGeometrica {
    protected int medida1;
    protected int medida2;

    public abstract int calculaArea();
    public abstract int calculaPerimetro();

    public int getMedida1() {
        return medida1;
    }

    public int getMedida2() {
        return medida2;
    }

    public String toString() {
        return "Área: " + calculaArea() + ", Perímetro: " + calculaPerimetro();
    }

}
