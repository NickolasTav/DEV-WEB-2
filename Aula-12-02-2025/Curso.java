import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nomeCurso;
    private List<Disciplina> disciplinas;

    public Curso() {
        this("");
    }

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.disciplinas = new ArrayList<Disciplina>();
    }


    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }


    public int calcularCargaHorariaTotal() {
        return disciplinas.stream()
                          .mapToInt(Disciplina::getCargaHoraria)
                          .sum();
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

}