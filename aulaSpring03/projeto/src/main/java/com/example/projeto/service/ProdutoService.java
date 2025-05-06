package com.example.projeto.service;

import org.springframework.stereotype.Service;
import com.example.projeto.repository.ProdutoRepository;
import com.example.projeto.model.Produto;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService{
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return ProdutoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id){
        return ProdutoRepository.findById(id);
    }

    public Produto salvarProduto(Produto produto){
        return ProdutoRepository.save(produto);
    }

    public void deletarProduto(Long id){
        ProdutoRepository.deleteById(id);
    }
}