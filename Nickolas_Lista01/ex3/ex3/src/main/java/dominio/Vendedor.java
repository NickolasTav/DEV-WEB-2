package dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Vendedor extends Pessoa {
		
	private int codigoVendedor;
	
	public Vendedor() {
		this("",0,0);
	}
	
	public Vendedor(String nome, int idade, int codigoVendedor) {
		super(nome,idade);
		setcodigoVendedor(codigoVendedor);
	}
	
	public int getcodigoVendedor() {
		return this.codigoVendedor;
	}

	public void setcodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}
	
	@Override
	public String toString() {
		return "Vendedor [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + ", codigoVendedor= "
		+ getcodigoVendedor() + "]";
	}
	
	public void imprimeDados() {
		System.out.println("Nome: "+ super.getNome());
		System.out.println("Idade: "+ super.getIdade());
		System.out.println("Codigo Vendedor: "+ getcodigoVendedor());
	}

}