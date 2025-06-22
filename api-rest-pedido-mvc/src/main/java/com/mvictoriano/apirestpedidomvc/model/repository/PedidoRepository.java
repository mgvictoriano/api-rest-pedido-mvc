package com.mvictoriano.apirestpedidomvc.model.repository;

import com.mvictoriano.apirestpedidomvc.model.domains.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByClienteContainingIgnoreCase(String cliente);
    List<Pedido> findByStatus(String status);
}