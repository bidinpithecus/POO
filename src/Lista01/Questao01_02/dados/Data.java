package Lista01.Questao01_02.dados;

public class Data {
    private String ano;
    private String mes;
    private String dia;

    public Data() {
    }

    public Data(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }

    public String toString() {
        return this.dia + '/' + this.mes + '/' + this.ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return ano.equals(data.ano) && mes.equals(data.mes) && dia.equals(data.dia);
    }

}
