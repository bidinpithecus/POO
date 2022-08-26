package AulaPratica02.Exercicio01;

public class Main {

    public static void main(String[] args) {
        Grupo grupo = new Grupo(5);
        Pessoa p1 = new Pessoa("Lissi", 77, 1.5, 138);
        Pessoa p2 = new Pessoa("Elena",37,1.83,139);
        Pessoa p3 = new Pessoa("Tate",34,2.0,58);
        Pessoa p4 = new Pessoa("Tonya",22,1.85,55);
        Pessoa p5 = new Pessoa("Britney",38,1.89,138);

        grupo.addPessoa(p1);
        grupo.addPessoa(p2);
        grupo.addPessoa(p3);
        grupo.addPessoa(p4);
        grupo.addPessoa(p5);

        grupo.sort();

        for (int i = 0; i < grupo.getNumPessoas(); i++) {
            System.out.println("\nPessoa " + (i + 1) + ":");
            grupo.getPessoas()[i].printPessoa();
        }
    }
}
