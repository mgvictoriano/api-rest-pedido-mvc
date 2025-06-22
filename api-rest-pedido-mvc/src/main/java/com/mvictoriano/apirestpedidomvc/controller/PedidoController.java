package com.mvictoriano.apirestpedidomvc.controller;

import com.mvictoriano.apirestpedidomvc.model.domains.Pedido;
import com.mvictoriano.apirestpedidomvc.model.domains.StatusPedido;
import com.mvictoriano.apirestpedidomvc.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> listarTodosPedidos() {
        return pedidoService.listarTodos();
    }

    @GetMapping("/cliente/{cliente}")
    public List<Pedido> listarPedidosPorCliente(@PathVariable String cliente) {
        return pedidoService.buscarPorCliente(cliente);
    }

    @GetMapping("/status/{status}")
    public List<Pedido> listarPedidosPorStatus(@PathVariable StatusPedido status) {
        return pedidoService.buscarPorStatus(status);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedidoPorId(@PathVariable Long id) {
        return pedidoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pedido gravarPedido(@RequestBody Pedido pedido) {
        return pedidoService.salvar(pedido);
    }

    @DeleteMapping("/{id}")
    public void removerPedido(@PathVariable Long id) {
        pedidoService.deletar(id);
    }

    @GetMapping("/contar")
    public long contarPedidos() {
        return pedidoService.contarPedidos();
    }
}