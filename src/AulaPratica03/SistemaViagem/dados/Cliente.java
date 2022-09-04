package AulaPratica03.SistemaViagem.dados;

public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private int numReservas = 0;
    private Reserva[] reservas = new Reserva[50];

    public Reserva[] getReservas() {
        return reservas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumReservas() {
        return numReservas;
    }

    public void setNumReservas(int numReservas) {
        this.numReservas = numReservas;
    }

    public void reservarIda(Reserva reserva) {
        this.reservas[numReservas++] = reserva;
    }

    public void reservarVolta(Reserva ida, Reserva volta) {
        ida.setIdaEvolta(true);
        ida.setVolta(volta);
        reservarIda(ida);
    }

    @Override
    public String toString() {
        return
                "Nome: " + nome + ", " +
                "Cpf: " + cpf + ", " +
                "Endereço: " + endereco + ", " +
                "Telefone: " + telefone;
    }
}
