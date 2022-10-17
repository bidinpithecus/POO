package Lista04.Questao02.dados;

import Lista04.Questao02.excptions.PilhaCheiaException;

public class Juiz {
    private String nome;
    private int limite;
    private Pilha<Processo> pilhaProcessos;

    public Juiz(int limite) {
        this.limite = limite;
        pilhaProcessos = new Pilha<>(limite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public Pilha<Processo> getPilhaProcessos() {
        return pilhaProcessos;
    }

    public void setPilhaProcessos(Pilha<Processo> pilhaProcessos) {
        this.pilhaProcessos = pilhaProcessos;
    }

    public void cadastrarProcesso(Processo processo) {
        try {
            pilhaProcessos.inserir(processo);
        } catch (PilhaCheiaException e) {
            e.printStackTrace();
        }
    }
}
