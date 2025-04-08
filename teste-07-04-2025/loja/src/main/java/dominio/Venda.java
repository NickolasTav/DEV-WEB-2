package dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import jakarta.persistence.ManyToOne;

@Entity
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "valor_total")
    private Double valorTotal;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "venda_produto",
            joinColumns = @JoinColumn(name = "venda_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private List<Produto> produtos;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    public Venda(){

    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString() {
        return "Venda{" +
                "Id=" + Id +
                ", valorTotal=" + valorTotal +
                ", produtos=" + produtos +
                ", cliente=" + cliente +
                '}';
    }
    public void addProduto(Produto produto) {
        if (produtos == null) {
            produtos = new ArrayList<>();
        }
        produtos.add(produto);
    }
    public void removeProduto(Produto produto) {
        if (produtos != null) {
            produtos.remove(produto);
        }
    }
    // função para calcular o valor total da venda
    public double calcularValorTotal() {
        valorTotal = 0.0;
        if (produtos != null) {
            for (Produto produto : produtos) {
                valorTotal += produto.getPreco();
            }
        return valorTotal;
        } else {
            return 0.0;
        }
    }
}
