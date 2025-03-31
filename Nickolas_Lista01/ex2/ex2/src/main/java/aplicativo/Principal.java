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

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa"); // Instancia o
																						// EntityManagerFactory com as
																						// configurações de persistencia
		EntityManager em = emf.createEntityManager(); // Intancia o EntityManager

		Vendedor vendedor1 = new Vendedor("Níckolas Tavares do Nascimento", 21, 01);
		Cliente cliente1 = new Cliente("Rafael", 34, 01);

		em.getTransaction().begin();// iniciar transação com banco de dados

		em.persist(vendedor1);
		em.persist(cliente1);

		Query consultaP = em.createQuery("select vendedor from Vendedor vendedor"); // consulta em jpql
		ArrayList<Vendedor> listaP = (ArrayList<Vendedor>) consultaP.getResultList();

		Query consultaA = em.createQuery("select cliente from Cliente cliente"); // consulta em jpql
		ArrayList<Cliente> listaA = (ArrayList<Cliente>) consultaA.getResultList();

		em.getTransaction().commit();// confirmar as alterações realizadas

		emf.close();
		em.close();

		for (Vendedor objP : listaP) {
			System.out.println(objP);
		}

		for (Cliente objA : listaA) {
			System.out.println(objA);
		}
	}
}