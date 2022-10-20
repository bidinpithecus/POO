package Lista04.Questao03.negocio;

import Lista04.Questao03.dados.*;
import Lista04.Questao03.exceptions.NomeInvalidoException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaArquivos {
    private final Map<String, List<Arquivo>> diretorios = new HashMap<>();

    public void criarDiretorio(String diretorio) {
        diretorios.put(diretorio, new ArrayList<>());
    }

    public void criarDocumento(String nome, String diretorio, String texto) throws NomeInvalidoException {
        if(!diretorios.containsKey(diretorio)) {
            criarDiretorio(diretorio);
        }
        Documento documento = new Documento(nome);
        documento.setExtensao("txt");
        documento.setTexto(texto);
        diretorios.get(diretorio).add(documento);
    }

    public void criarMusica(String nome, String diretorio, int duracao) throws NomeInvalidoException {
        if(!diretorios.containsKey(diretorio)) {
            criarDiretorio(diretorio);
        }
        Musica musica = new Musica(nome);
        musica.setExtensao("mp3");
        musica.setDuracao(duracao);
        diretorios.get(diretorio).add(musica);
    }

    public void criarVideo(String nome, String diretorio, Qualidade qualidade) throws NomeInvalidoException {
        if(!diretorios.containsKey(diretorio)) {
            criarDiretorio(diretorio);
        }
        Video video = new Video(nome);
        video.setExtensao("mp4");
        video.setQualidade(qualidade);
        diretorios.get(diretorio).add(video);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        diretorios.forEach((chave, valor) -> {
            stringBuilder.append(chave).append(":").append("\n");
            for (Arquivo arquivo : valor) {
                stringBuilder.append(arquivo).append("\n");
            }
            stringBuilder.append("\n");
        });
        return stringBuilder.toString();
    }

}
