package com.mvictoriano.apirestpedidomvc.model.service;

import com.mvictoriano.apirestpedidomvc.model.domains.Pedido;
import com.mvictoriano.apirestpedidomvc.model.domains.StatusPedido;
import com.mvictoriano.apirestpedidomvc.model.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public List<Pedido> buscarPorCliente(String cliente) {
        return pedidoRepository.findByClienteContainingIgnoreCase(cliente);
    }

    public List<Pedido> buscarPorStatus(StatusPedido status) {
        return pedidoRepository.findByStatus(status);
    }

    public Pedido salvar(Pedido pedido) {
        if(pedido.getDataPedido() == null) {
            pedido.setDataPedido(LocalDateTime.now());
        }
        return pedidoRepository.save(pedido);
    }
    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }

    public long contarPedidos() {
        return pedidoRepository.count();
    }
}