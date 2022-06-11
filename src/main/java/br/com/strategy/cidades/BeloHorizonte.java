package br.com.strategy.cidades;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class BeloHorizonte extends Cidade {

    private int numeroDeQuartos;

    public BigDecimal calculoTotal() {
        return this.calcularArea().add(valueOf(numeroDeQuartos)).multiply(new BigDecimal("2"));
    }
    @Override
    protected BigDecimal calcularArea() {
        return areaTotal.multiply(new BigDecimal("7"));
    }
}
