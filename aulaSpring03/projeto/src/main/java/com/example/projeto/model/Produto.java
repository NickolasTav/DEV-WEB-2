package com.example.projeto.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
@Table(name = "Produto")
public class Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nome;
    private Int quantidade;
    private BigDecimal valor;


    public Produto(){}


    public Produto(String nome, Int quantidade, BigDecimal valor){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Long getId(){
        return this.Id;
    }

    public String getNome(){
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
    
    public BigDecimal getValor(){
        return this.valor;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    

    




}