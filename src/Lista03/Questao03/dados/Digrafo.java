package Lista03.Questao03.dados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Digrafo {
    protected Map<Integer, List<Integer>> matrizAdjacencia = new HashMap<>();
    protected int numVertices = 0;

    public void adicionarVertice() {
        numVertices++;
        List<Integer> novoVertice = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            novoVertice.add(0);
        }

        matrizAdjacencia.put(numVertices - 1, novoVertice);

        for (int i = 0; i < numVertices; i++) {
            matrizAdjacencia.get(i).add(0);
        }
    }

    public void adicionarAresta(int origem, int destino) {
        matrizAdjacencia.get(origem).add(destino, 1);
    }

    public void removerAresta(int origem, int destino) {
        matrizAdjacencia.get(origem).add(destino, 0);
    }

    public String toString(){
        StringBuilder str = new StringBuilder("\t");
        for(int i = 0; i < numVertices; i++){
            str.append(i).append("\t");
        }
        str.append("\n");
        for(int i = 0; i < numVertices; i++){
            str.append(i).append("\t");
            for(int j = 0; j < numVertices; j++){
                str.append(this.matrizAdjacencia.get(i).get(j)).append("\t");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
