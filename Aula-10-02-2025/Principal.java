import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String args[]) {
        Aluno aluno1 = new Aluno("Rafael", 34, 123421321, 1001);
        Aluno aluno2 = new Aluno("vitor", 34, 123421321, 1001);
        Aluno aluno3 = new Aluno("Rogerio", 34, 123421321, 1001);
        Aluno aluno4 = new Aluno("Gabriel", 34, 123421321, 1001);
        System.out.println(aluno1.toString());

        Professor professor1 = new Professor("Nickolas", 21, 321321, 1234);
        System.out.println(professor1.toString());

        List<Aluno> alunos;
        alunos = new ArrayList<Aluno>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        List<Professor> professores;
        professores = new ArrayList<Professor>();
        professores.add(professor1);

        Disciplina sistemas = new Disciplina("Sistemas", 1, alunos, professores);

        System.out.println(sistemas.getProfessor());
        System.out.println(sistemas.getALunos());
        sistemas.addALuno(aluno4);
        System.out.println(sistemas.getALunos());

        System.out.println(sistemas.getInfoAluno("Rafael"));

    }
}