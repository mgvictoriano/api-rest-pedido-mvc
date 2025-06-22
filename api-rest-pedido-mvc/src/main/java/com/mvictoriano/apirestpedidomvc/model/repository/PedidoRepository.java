public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByDescricaoContainingIgnoreCase(String descricao);
}