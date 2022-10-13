package Lista03.Questao03.dados;

public class Grafo extends Digrafo {
    public void adicionarAresta(int origem, int destino) {
        super.adicionarAresta(origem, destino);
        super.adicionarAresta(destino, origem);
    }

    public void removerAresta(int origem, int destino) {
        super.removerAresta(origem, destino);
        super.removerAresta(destino, origem);
    }
}
