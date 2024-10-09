package com.sesi.ava.service;

import com.sesi.ava.model.Produto;
import com.sesi.ava.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public void save(Produto produto) {
        produtoRepository.save(produto);
    }
}
