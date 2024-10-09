package com.sesi.ava.service;

import com.sesi.ava.model.Pedido;
import com.sesi.ava.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public void save(Pedido pedido) {
        pedidoRepository.save(pedido);
    }
}
