package Lista04.Questao03.negocio;

import Lista04.Questao03.dados.*;
import Lista04.Questao03.exceptions.NomeInvalidoException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaArquivos {
    private Map<String, List<Arquivo>> diretorios = new HashMap<>();

    public void criarDocumento(String nome, String diretorio, String texto) throws NomeInvalidoException {
        try {
            Documento documento = new Documento(nome);
            documento.setTexto(texto);
            diretorios.get(diretorio).add(documento);
        } catch (NomeInvalidoException e) {
            e.printStackTrace();
        }
    }
}
