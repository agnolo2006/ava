package com.sesi.ava.controller;

import com.sesi.ava.model.Pedido;
import com.sesi.ava.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pedidos")

public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/pedidos")
    public String list(Model model) {
        List<Pedido> pedidos = pedidoService.findAll();
        model.addAttribute("pedidos", pedidos);
        return "pedidos"; 
    }

    @PostMapping
    public String save(Pedido pedido) {
        pedidoService.save(pedido);
        return "redirect:/pedidos";
    }
}
