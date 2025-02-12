public class Professor extends Pessoa {
    private long matriculaProfessor;

    public Professor() {
        this("", 0, 0, 0);
    }

    public Professor(String nome, int idade) {
        this(nome, idade, 0, 0);
    }

    public Professor(String nome, int idade, long cpf, long matriculaProfessor) {
        super(nome, idade, cpf);
        this.matriculaProfessor = matriculaProfessor;
    }

    public void setMatriculaProfessor(long matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public long getMatriculaProfessor() {
        return this.matriculaProfessor;
    }

    @Override
    public String toString(){
        return "Professor(" + super.toString() +
        ", matricula=" + getMatriculaProfessor() + "})";
    }


}