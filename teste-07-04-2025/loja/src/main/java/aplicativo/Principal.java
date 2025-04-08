package aplicativo;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.Query;

import dominio.Cliente;
import dominio.Produto;
import dominio.Venda;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("aula-jpa");
            em = emf.createEntityManager();

            // Ensure the EntityManager is not null before accessing its methods
                em.getTransaction().begin();

                // Your logic for creating entities and persisting them
                Produto produto = new Produto("Notebook", 3500.00);

                em.persist(produto);

                Cliente cliente = new Cliente(001, "Níckolas Tavares");
                em.persist(cliente);
                
                Venda venda = new Venda(cliente);
                venda.setProdutos(Arrays.asList(produto));
                venda.setValorTotal(venda.calcularValorTotal());

                em.persist(venda);



                em.getTransaction().commit();

       
        } catch (Exception e) {
            // Ensure that the transaction is rolled back if something goes wrong
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // Properly close the resources
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }

    }
}