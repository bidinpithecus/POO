package Lista03.Questao01.dados;

public abstract class Animal {
    protected String name;

    public abstract String emitirSom();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
