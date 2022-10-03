package Lista02.Questao04.dados;

public class Aluno {
    private String nome;
    private int idade;
    private double[] notas = new double[5];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media /= notas.length;

        return media;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Média: " + calcularMedia();
    }
}
