package br.com.strategy.cidades;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public class SaoPaulo extends Cidade {

    private int numeroDeComodos;

    public SaoPaulo(BigDecimal areaTotal, int numeroDeComodos) {
        super(areaTotal);
        this.numeroDeComodos = numeroDeComodos;
    }

    public BigDecimal calculoTotal() {
        return this.calcularArea().add(valueOf(numeroDeComodos)).multiply(new BigDecimal("2"));
    }
    @Override
    protected BigDecimal calcularArea() {
        return areaTotal.multiply(new BigDecimal("10"));
    }
}
