public class Principal {
    public static void main(String args[]) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa("nick",21);
        Pessoa pessoa3 = new Pessoa("nick",21,323232);

        System.out.println(pessoa.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
    }
}