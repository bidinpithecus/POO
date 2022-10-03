package Lista02.Questao04.dados;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Equipe<Aluno>> separarEmEquipes() {
        return null;
    }

    private void ordenaAlunosPorMedia() {
        // anonymous function (lambda)
        alunos.sort((aluno1, aluno2) -> {
            if (aluno1.calcularMedia() == aluno2.calcularMedia()) {
                return 0;
            }
            return aluno1.calcularMedia() < aluno2.calcularMedia() ? -1 : 1;
        });
    }
}
