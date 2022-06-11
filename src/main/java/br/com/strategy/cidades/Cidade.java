package br.com.strategy.cidades;

import java.math.BigDecimal;

abstract class Cidade {
    protected BigDecimal areaTotal;

    protected Cidade(BigDecimal areaTotal) {
        this.areaTotal = areaTotal;
    }

    protected abstract BigDecimal calcularArea();
}
