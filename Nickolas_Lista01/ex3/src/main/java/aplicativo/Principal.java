package aplicativo;

import dominio.Pessoa;
import dominio.Vendedor;
import dominio.Cliente;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa"); //Instancia o EntityManagerFactory com as configurações de persistencia
		EntityManager em = emf.createEntityManager(); //Intancia o EntityManager
		
		Pessoa pessoa1 = new Pessoa("José",35);

		Vendedor vendedor1 = new Vendedor("Rafael", 2, 0001);
		Cliente cliente1 = new Cliente("Miguel", 3, 0001);
		
		Vendedor vendedor2 = new Vendedor("Gabriel", 4, 0002);
		Cliente cliente2 = new Cliente("Uriel", 5, 0002);
		
		em.getTransaction().begin();// iniciar transação com banco de dados
		
		em.persist(pessoa1);

		em.persist(vendedor1);
		em.persist(cliente1);
		
		em.persist(vendedor2);
		em.persist(cliente2);
		
		Query consultaP = em.createQuery("select vendedor from Vendedor vendedor"); //consulta em jpql
		ArrayList<Vendedor> listaP = (ArrayList<Vendedor>) consultaP.getResultList();
		
		Query consultaA = em.createQuery("select cliente from Cliente cliente"); //consulta em jpql
		ArrayList<Cliente> listaA = (ArrayList<Cliente>) consultaA.getResultList();
		
		em.getTransaction().commit();//confirmar as alterações realizadas
		
		emf.close();
		em.close();
		
		for(Vendedor objP: listaP) {
			System.out.println(objP);
		}
		
		for(Cliente objA: listaA) {
			System.out.println(objA);
		}
	}			
}