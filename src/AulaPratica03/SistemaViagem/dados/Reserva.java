package AulaPratica03.SistemaViagem.dados;

public class Reserva {
    private int numReserva;
    private String dataVoo;
    private String horaVoo;
    private double preco;
    private String classeVoo;
    private Boolean idaEvolta;
    private String poltrona;
    private Reserva volta;
    private Cidade origem;
    private Cidade destino;

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }

    public void setHoraVoo(String horaVoo) {
        this.horaVoo = horaVoo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setClasseVoo(String classeVoo) {
        this.classeVoo = classeVoo;
    }

    public void setIdaEvolta(Boolean idaEvolta) {
        this.idaEvolta = idaEvolta;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    public void setVolta(Reserva volta) {
        this.volta = volta;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        String stringIdaEVolta;
        if (idaEvolta == Boolean.TRUE) {
            stringIdaEVolta = "Sim";
        } else {
            stringIdaEVolta = "Não";
        }

        String reserva = "Numero Reserva: " + numReserva + ", " +
                "Origem: " + origem + ", " +
                "Destino: " + destino + ", " +
                "Data: : " + dataVoo + ", " +
                "Hora: " + horaVoo + ", " +
                "Preço: R$" + preco + ", " +
                "Classe: " + classeVoo + ", " +
                "Ida e volta: " + stringIdaEVolta + ", " +
                "Poltrona: " + poltrona;

        if (this.volta != null) {
            reserva += " " + this.volta.toString();
        }
        return reserva;
    }
}
