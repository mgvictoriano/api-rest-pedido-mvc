package com.mvictoriano.apirestpedidomvc.model.domains;

public enum StatusPedido {
    PENDENTE("Pendente"),
    PROCESSANDO("Processando"),
    ENVIADO("Enviado"),
    ENTREGUE("Entregue"),
    CANCELADO("Cancelado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}