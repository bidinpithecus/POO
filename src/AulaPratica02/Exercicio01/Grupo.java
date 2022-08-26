package AulaPratica02.Exercicio01;

public class Grupo {
    private int numPessoas;
    private int numAtualPessoas = 0;
    private Pessoa[] pessoas;

    public Grupo(int numPessoas) {
        this.numPessoas = numPessoas;
         pessoas = new Pessoa[numPessoas];
    }

    public void addPessoa(Pessoa pessoa) {
        if (this.numAtualPessoas < this.numPessoas) {
            pessoas[this.numAtualPessoas] = pessoa;
            this.numAtualPessoas++;
        } else {
            System.out.println("Máximo de pessoas já adicionadas");
        }
    }

    public Pessoa[] getPessoas() {
        return this.pessoas;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void sort() {
        for (int i = 0; i < this.numPessoas; i++) {
            for (int j = i + 1; j < this.numPessoas; j++) {
                if (this.pessoas[j].GetImc() > this.pessoas[i].GetImc()) {
                    Pessoa temp = this.pessoas[j];
                    this.pessoas[j] = this.pessoas[i];
                    this.pessoas[i] = temp;
                }
            }
        }
    }

}
