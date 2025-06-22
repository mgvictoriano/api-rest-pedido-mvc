package com.mvictoriano.apirestpedidomvc.config;

import com.mvictoriano.apirestpedidomvc.model.domains.StatusPedido;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToStatusPedidoConverter implements Converter<String, StatusPedido> {
    @Override
    public StatusPedido convert(String source) {
        try {
            return StatusPedido.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Status inválido: " + source);
        }
    }
}