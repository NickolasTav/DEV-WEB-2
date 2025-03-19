package dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity //entidade de domínio
@DiscriminatorValue("C")
public class Cliente extends Pessoa {
	
	//private static final long serialVersionUID = 1L; //Id padrão do Serializable
	
	private int codigoCliente;
	
	public Cliente() {
		this("",0,0);
	}
	
	public Cliente(String nome, int idade, int codigoCliente) {
		super(nome,idade);
		setCodigoCliente(codigoCliente);
	}
	
	public int getCodigoCliente() {
		return this.codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	@Override
	public String toString() {
		return "Cliente [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + ", CodigoCliente= "
		+ getCodigoCliente() + "]";
	}
	
	public void imprimeDados() {
		System.out.println("Nome: "+ super.getNome());
		System.out.println("Idade: "+ super.getIdade());
		System.out.println("Matricula Aluno: "+ getCodigoCliente());
	}
}