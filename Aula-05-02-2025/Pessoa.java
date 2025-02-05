public class Pessoa {
    public String nome;
    public int idade;
    public long cpf;

    public Pessoa() {
        this(null, 0, 0);
    }

    public Pessoa(String nome, int idade) {
        this(nome, idade, 0);
    }

    public Pessoa(String nome, int idade, long cpf) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public long getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{"
                + "Nome: " + getNome()
                + " Idade: " + getIdade()
                + " Cpf: " + getCpf();

    }

}