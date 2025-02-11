import java.util.ArrayList;
import java.util.List;

public class Disciplina{
    private String nomeDisciplina;
    private int idDisciplina;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Disciplina(){
        this("",0,new ArrayList<>(),new ArrayList<>());
    }

    public Disciplina(String nomeDisciplina, int idDisciplina,List<Aluno> alunos, List<Professor> professores){
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = idDisciplina;
        this.alunos = alunos;
        this.professores = professores;
    }

    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }

    public int getidDisciplina(){
        return this.idDisciplina;
    }

    public List<Aluno> getALunos(){
        return this.alunos;
    }

    public List<Professor> getProfessor(){
        return this.professores;
    }

    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setidDisciplina(int idDisciplina){
        this.idDisciplina = idDisciplina;
    }

    public void addALuno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void setALunos(List<Aluno> alunos){
        this.alunos = alunos;
    }

    public void setProfessor(List<Professor> professores){
        this.professores = professores;
    }

    public Boolean getInfoAluno(String nomeALuno){
        return alunos.stream().anyMatch((aluno -> aluno.getNome().equals(nomeALuno)));

    }

}